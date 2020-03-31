package com.example.aula30_03.repository;

import java.util.HashMap;

import com.example.aula30_03.model.Livro;

import org.springframework.stereotype.Repository;

/**
 * RepositorioLivro
 */
@Repository
public class RepositorioLivro {
    private HashMap<Integer,Livro> hm = new HashMap<>();
    private int cont=0;
   
    public void addLivro(Livro l)
    {
        hm.put(cont++, l);
    } 
    public HashMap<Integer,Livro> listarLivros()
    {
        return hm;
    }

}


