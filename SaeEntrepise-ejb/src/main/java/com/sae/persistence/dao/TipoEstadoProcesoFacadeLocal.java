/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoProcesoFacadeLocal {

    void create(TipoEstadoProceso tipoEstadoProceso);

    void edit(TipoEstadoProceso tipoEstadoProceso);

    void remove(TipoEstadoProceso tipoEstadoProceso);

    TipoEstadoProceso find(Object id);

    List<TipoEstadoProceso> findAll();

    List<TipoEstadoProceso> findRange(int[] range);

    int count();
    
}
