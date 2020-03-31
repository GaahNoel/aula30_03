package com.example.aula30_03.sevice;

import java.util.HashMap;

import com.example.aula30_03.model.Livro;
import com.example.aula30_03.repository.RepositorioLivro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ServicosLivro
 */
@Service
public class ServicosLivro {

    @Autowired
    private RepositorioLivro rl;

    public HashMap<Integer,Livro> listaLivros()
    {
        HashMap<Integer,Livro> hm = rl.listarLivros();
        return hm; 
    }
    public boolean addLivro(Livro l)
    {
        boolean existe = false;
        for(Livro x: rl.listarLivros().values())
        {
            if(x.getAutor().equals(l.getAutor())&& x.getEdicao() == l.getEdicao())
            {
                existe = true;
            }
        }
        if(!existe)
        {
            rl.addLivro(l);
            return false;
        }
        return true;
        

    }
}