package com.ferdian.newsAPI.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "image_article")
public class ImageArticle {
    @Id
    @UuidGenerator
    private String id;
    private String sharedUrl;
    private String imageName;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    @JsonIgnore
    private byte[] data;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    private Boolean isDeleted = false;

    @UpdateTimestamp
    @JsonIgnore
    private LocalDateTime updatedAt;

    public ImageArticle(String imageName, byte[] data, Article article) {
        this.imageName = imageName;
        this.data = data;
        this.article = article;
    }

}
