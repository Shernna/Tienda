package com.tienda.controller;

import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public class CategoriaController {
    
    @Controller
    @RequestMapping("/categoria")
    public class CategriaController {
        
        @Autowired
        CategoriaService categoriaService;
        
        @GetMapping("/listado")
        public String listado(Model model) {
            List<Categoria> lista = categoriaService.getCategorias(false);
            model.addAtribute("categorias", lista);
            model.addAtribute("totalCategorias", lista.size());
            
                    
          return "/categoria/listado";  
            
        }
    }
    
}
