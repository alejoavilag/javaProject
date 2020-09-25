package com.example.project.repositories;

import java.util.ArrayList;

import com.example.project.models.articleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository  // selecciomos tipo repositorio
public interface repoArticle extends CrudRepository<articleModel, Long>{
    public abstract ArrayList<articleModel> findByUser(String user);
}
