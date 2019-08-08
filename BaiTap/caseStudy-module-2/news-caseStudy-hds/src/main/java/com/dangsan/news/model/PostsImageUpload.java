package com.dangsan.news.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;

public class PostsImageUpload extends Posts {
    @NotEmpty
    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
