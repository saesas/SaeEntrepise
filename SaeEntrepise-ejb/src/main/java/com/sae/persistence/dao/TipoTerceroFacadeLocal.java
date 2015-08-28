/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoTerceroFacadeLocal {

    void create(TipoTercero tipoTercero);

    void edit(TipoTercero tipoTercero);

    void remove(TipoTercero tipoTercero);

    TipoTercero find(Object id);

    List<TipoTercero> findAll();

    List<TipoTercero> findRange(int[] range);

    int count();
    
}
