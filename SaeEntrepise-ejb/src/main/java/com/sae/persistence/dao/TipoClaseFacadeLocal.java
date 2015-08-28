/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoClase;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoClaseFacadeLocal {

    void create(TipoClase tipoClase);

    void edit(TipoClase tipoClase);

    void remove(TipoClase tipoClase);

    TipoClase find(Object id);

    List<TipoClase> findAll();

    List<TipoClase> findRange(int[] range);

    int count();
    
}
