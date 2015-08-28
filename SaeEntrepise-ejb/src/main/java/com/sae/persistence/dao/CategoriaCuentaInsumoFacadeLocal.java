/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CategoriaCuentaInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CategoriaCuentaInsumoFacadeLocal {

    void create(CategoriaCuentaInsumo categoriaCuentaInsumo);

    void edit(CategoriaCuentaInsumo categoriaCuentaInsumo);

    void remove(CategoriaCuentaInsumo categoriaCuentaInsumo);

    CategoriaCuentaInsumo find(Object id);

    List<CategoriaCuentaInsumo> findAll();

    List<CategoriaCuentaInsumo> findRange(int[] range);

    int count();
    
}
