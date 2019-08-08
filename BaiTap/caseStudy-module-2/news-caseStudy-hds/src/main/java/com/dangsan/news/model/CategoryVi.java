package com.dangsan.news.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoriesVi")
public class CategoryVi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(targetEntity = PostsVi.class)
    private List<PostsVi> postsListVi;

    public CategoryVi() {
    }

    public CategoryVi(String name, List<PostsVi> postsListVi) {
        this.name = name;
        this.postsListVi = postsListVi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostsVi> getPostsListVi() {
        return postsListVi;
    }

    public void setPostsList(List<PostsVi> postsListVi) {
        this.postsListVi = postsListVi;
    }
}
