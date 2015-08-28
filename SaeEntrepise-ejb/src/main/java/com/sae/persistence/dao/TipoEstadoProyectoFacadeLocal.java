/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoProyectoFacadeLocal {

    void create(TipoEstadoProyecto tipoEstadoProyecto);

    void edit(TipoEstadoProyecto tipoEstadoProyecto);

    void remove(TipoEstadoProyecto tipoEstadoProyecto);

    TipoEstadoProyecto find(Object id);

    List<TipoEstadoProyecto> findAll();

    List<TipoEstadoProyecto> findRange(int[] range);

    int count();
    
}
