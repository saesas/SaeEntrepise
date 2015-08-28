/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoProcesoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoProcesoConvocatoriaFacadeLocal {

    void create(TipoProcesoConvocatoria tipoProcesoConvocatoria);

    void edit(TipoProcesoConvocatoria tipoProcesoConvocatoria);

    void remove(TipoProcesoConvocatoria tipoProcesoConvocatoria);

    TipoProcesoConvocatoria find(Object id);

    List<TipoProcesoConvocatoria> findAll();

    List<TipoProcesoConvocatoria> findRange(int[] range);

    int count();
    
}
