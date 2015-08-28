/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoConvocatoriaFacadeLocal {

    void create(TipoEstadoConvocatoria tipoEstadoConvocatoria);

    void edit(TipoEstadoConvocatoria tipoEstadoConvocatoria);

    void remove(TipoEstadoConvocatoria tipoEstadoConvocatoria);

    TipoEstadoConvocatoria find(Object id);

    List<TipoEstadoConvocatoria> findAll();

    List<TipoEstadoConvocatoria> findRange(int[] range);

    int count();
    
}
