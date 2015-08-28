/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoProyectoFacadeLocal {

    void create(EstadoProyecto estadoProyecto);

    void edit(EstadoProyecto estadoProyecto);

    void remove(EstadoProyecto estadoProyecto);

    EstadoProyecto find(Object id);

    List<EstadoProyecto> findAll();

    List<EstadoProyecto> findRange(int[] range);

    int count();
    
}
