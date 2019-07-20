package com.dangsan.blog.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Posts {
    private Long id;
    private String title;
    private String content;

    public Posts() {
    }

    public Posts(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Posts[id=%d, title='%s', context='%s']", id, title, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
