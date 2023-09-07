package com.ferdian.newsAPI.controllers.admin;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ferdian.newsAPI.services.storageImage.StorageImageService;

@RestController
@RequestMapping("/api/v1/admin")
public class ImageArticleController {
    @Autowired
    StorageImageService storageImageService;

    @PostMapping("/files/article")
    public ResponseEntity<?> storeImage(@RequestParam(value = "file") MultipartFile file,
            @RequestParam(value = "articleId") String articleId) throws IOException {
        return storageImageService.storeImage(file, articleId);
    }

    @GetMapping("/files/image/{imageId}")
    public ResponseEntity<?> loadImage(@PathVariable String imageId) {
        return storageImageService.loadImage(imageId);
    }
}
