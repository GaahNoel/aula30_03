package com.example.aula30_03.controller;

import java.util.HashMap;

import com.example.aula30_03.model.Livro;
import com.example.aula30_03.sevice.ServicosLivro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ControleLivro
 */
@Controller
@RequestMapping("/app")
public class ControleLivro {
    @Autowired
    private ServicosLivro sl;

    @GetMapping("/livros")
    public ModelAndView mostraLivros()
    {
        ModelAndView mv = new ModelAndView("view");
        HashMap<Integer,Livro> hm = sl.listaLivros();
        mv.addObject("livros",hm.values());
        return mv;
    }
    @PostMapping("/livros")
    public ModelAndView addLivro(@ModelAttribute Livro livro)
    {
        ModelAndView mv = new ModelAndView("view");
        boolean transaction = sl.addLivro(livro);
        if(transaction)
            mv.addObject("erro",transaction);
        mv.addObject("livros", sl.listaLivros().values());
        
        return mv;
    }
    
}