
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.service.CategoriaService;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    public List<Categoria> getCategorias(boolean activo) {
        List<Categoria> lista = CategoriaDao.findAll();
        if (activo){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
    
}
