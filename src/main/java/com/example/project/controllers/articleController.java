package com.example.project.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.project.models.articleModel;
import com.example.project.services.servicesArticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class articleController {
    
    @Autowired(required = true)
    servicesArticle servicesArti;

    @GetMapping()
    public ArrayList<articleModel> getArticle(){
        return servicesArti.getArticles();
    }

    @PostMapping()
    public articleModel saveArticle(@RequestBody articleModel article){
        return this.servicesArti.saveArticles(article);
    }

    @GetMapping(path = "/{id}")
    public Optional<articleModel> getArticleForId(@PathVariable("id") Long id){
        return this.servicesArti.getArticleById(id);
    }

    @GetMapping("/query")
    public ArrayList<articleModel> getArticleForUser(@RequestParam("user") String user){
        return this.servicesArti.getArticleByUser(user);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteForId(@PathVariable("id") Long id){
        boolean ok = this.servicesArti.deleteArticle(id);
        if (ok){
            return "Se eliminó el articulo con id " + id;
        }else{
            return "No se pudo eliminar el articulo con id" + id;
        }
    }
}
