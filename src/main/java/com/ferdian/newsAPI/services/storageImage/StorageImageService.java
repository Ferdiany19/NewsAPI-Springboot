package com.ferdian.newsAPI.services.storageImage;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface StorageImageService {
    ResponseEntity<?> storeImage(MultipartFile file, String bookId) throws IOException;

    ResponseEntity<?> loadImage(String imageId);
}
