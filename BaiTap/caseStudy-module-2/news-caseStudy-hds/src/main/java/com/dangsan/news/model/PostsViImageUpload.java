package com.dangsan.news.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;

public class PostsViImageUpload extends PostsVi {
    @NotEmpty
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
