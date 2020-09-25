package com.example.project.models;

import javax.persistence.*;

@Entity
@Table(name = "javaArticles")
public class articleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    private String user;
    private String nameArticle;
    private Integer prioridad;

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return nameArticle;
    }

    public void setArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public String getEmail() {
        return user;
    }

    public void setEmail(String user) {
        this.user = user;
    }
}
