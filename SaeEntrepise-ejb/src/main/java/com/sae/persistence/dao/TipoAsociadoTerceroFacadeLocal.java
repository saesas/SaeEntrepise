/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoAsociadoTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoAsociadoTerceroFacadeLocal {

    void create(TipoAsociadoTercero tipoAsociadoTercero);

    void edit(TipoAsociadoTercero tipoAsociadoTercero);

    void remove(TipoAsociadoTercero tipoAsociadoTercero);

    TipoAsociadoTercero find(Object id);

    List<TipoAsociadoTercero> findAll();

    List<TipoAsociadoTercero> findRange(int[] range);

    int count();
    
}
