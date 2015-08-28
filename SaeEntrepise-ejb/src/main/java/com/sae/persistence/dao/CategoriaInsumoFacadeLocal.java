/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CategoriaInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CategoriaInsumoFacadeLocal {

    void create(CategoriaInsumo categoriaInsumo);

    void edit(CategoriaInsumo categoriaInsumo);

    void remove(CategoriaInsumo categoriaInsumo);

    CategoriaInsumo find(Object id);

    List<CategoriaInsumo> findAll();

    List<CategoriaInsumo> findRange(int[] range);

    int count();
    
}
