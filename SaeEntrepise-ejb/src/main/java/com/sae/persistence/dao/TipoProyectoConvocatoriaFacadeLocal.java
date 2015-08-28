/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoProyectoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoProyectoConvocatoriaFacadeLocal {

    void create(TipoProyectoConvocatoria tipoProyectoConvocatoria);

    void edit(TipoProyectoConvocatoria tipoProyectoConvocatoria);

    void remove(TipoProyectoConvocatoria tipoProyectoConvocatoria);

    TipoProyectoConvocatoria find(Object id);

    List<TipoProyectoConvocatoria> findAll();

    List<TipoProyectoConvocatoria> findRange(int[] range);

    int count();
    
}
