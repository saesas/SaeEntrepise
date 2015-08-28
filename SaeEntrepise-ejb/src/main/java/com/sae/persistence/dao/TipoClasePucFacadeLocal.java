/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoClasePuc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoClasePucFacadeLocal {

    void create(TipoClasePuc tipoClasePuc);

    void edit(TipoClasePuc tipoClasePuc);

    void remove(TipoClasePuc tipoClasePuc);

    TipoClasePuc find(Object id);

    List<TipoClasePuc> findAll();

    List<TipoClasePuc> findRange(int[] range);

    int count();
    
}
