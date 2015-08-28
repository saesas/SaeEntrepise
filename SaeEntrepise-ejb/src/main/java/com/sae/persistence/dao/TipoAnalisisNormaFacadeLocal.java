/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoAnalisisNorma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoAnalisisNormaFacadeLocal {

    void create(TipoAnalisisNorma tipoAnalisisNorma);

    void edit(TipoAnalisisNorma tipoAnalisisNorma);

    void remove(TipoAnalisisNorma tipoAnalisisNorma);

    TipoAnalisisNorma find(Object id);

    List<TipoAnalisisNorma> findAll();

    List<TipoAnalisisNorma> findRange(int[] range);

    int count();
    
}
