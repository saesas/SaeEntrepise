/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoIva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoIvaFacadeLocal {

    void create(TipoIva tipoIva);

    void edit(TipoIva tipoIva);

    void remove(TipoIva tipoIva);

    TipoIva find(Object id);

    List<TipoIva> findAll();

    List<TipoIva> findRange(int[] range);

    int count();
    
}
