package com.example.project.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.project.models.articleModel;
import com.example.project.repositories.repoArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // seleccionamos de tipo servicio
public class servicesArticle {
    @Autowired(required = true)
    repoArticle repoArti;

    public ArrayList<articleModel> getArticles(){
        return (ArrayList<articleModel>) repoArti.findAll();
    }

    public articleModel saveArticles(articleModel article){
        return repoArti.save(article);
    }

    public Optional<articleModel> getArticleById(Long id){
        return repoArti.findById(id);
    }

    public ArrayList<articleModel> getArticleByUser(String user){
        return repoArti.findByUser(user);
    }

    public boolean deleteArticle(Long id) {
        try{
            repoArti.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
