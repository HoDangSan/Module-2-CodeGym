package com.dangsan.news.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "postsVi")
public class PostsVi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    @Column(length = 9096, nullable = false)
    private String Description;
    @NotEmpty
    private String author;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date dateCreate;
    private String finalEditor;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @NotEmpty
    private String image;

    @ManyToOne
    @JoinColumn(name = "categoryVi_id")
    private CategoryVi categoryVi;

    public PostsVi() {
    }

    public PostsVi(String name, String description, String author, Date dateCreate, String finalEditor, Date lastModifiedDate, String image, CategoryVi categoryVi) {
        this.name = name;
        Description = description;
        this.author = author;
        this.dateCreate = dateCreate;
        this.finalEditor = finalEditor;
        this.lastModifiedDate = lastModifiedDate;
        this.image = image;
        this.categoryVi = categoryVi;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getFinalEditor() {
        return finalEditor;
    }

    public void setFinalEditor(String finalEditor) {
        this.finalEditor = finalEditor;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CategoryVi getCategoryVi() {
        return categoryVi;
    }

    public void setCategoryVi(CategoryVi categoryVi) {
        this.categoryVi = categoryVi;
    }
}
