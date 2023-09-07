package com.ferdian.newsAPI.services.storageImage;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.ImageArticle;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.ArticleRepository;
import com.ferdian.newsAPI.repositories.ImageArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Service
public class StorageImageServiceImpl implements StorageImageService {

    @Autowired
    ImageArticleRepository imageArticleRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public ResponseEntity<?> storeImage(MultipartFile file, String articleId) throws IOException {
        // ambil nama gambar
        String imgName = StringUtils.cleanPath(file.getOriginalFilename());

        // file content type -> untuk ambil type filenya

        // cari entitas buku
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new NoSuchElementException("Article is not found!"));

        ImageArticle imageArticle = new ImageArticle(imgName, file.getBytes(), article);
        imageArticleRepository.save(imageArticle); // menyimpan id

        // buatkan sharedUrl
        /*
         * endpoint untuk upload: /admin/files/book -> POST
         * endpoint untuk load: /files/book/{uuidGambar} ->GET
         */
        String sharedUrl = ServletUriComponentsBuilder
                .fromCurrentContextPath() // localhost:9090
                .path("/files/book/")
                .path(imageArticle.getId()) // id gambar
                .toUriString();

        // set sharedurl ke obj imagebook
        imageArticle.setSharedUrl(sharedUrl);
        imageArticleRepository.save(imageArticle);

        return ResponseHander.responseData(HttpStatus.CREATED.value(), "success store image", imageArticle);
    }

    @Override
    public ResponseEntity<?> loadImage(String imageId) {
        ImageArticle imageArticle = imageArticleRepository.findById(imageId)
                .orElseThrow(() -> new NoSuchElementException("Image is not found!"));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageArticle.getImageName() + "\"")
                .body(imageArticle.getData());
    }

}
