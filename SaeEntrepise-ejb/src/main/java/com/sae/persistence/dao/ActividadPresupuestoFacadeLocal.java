/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActividadPresupuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActividadPresupuestoFacadeLocal {

    void create(ActividadPresupuesto actividadPresupuesto);

    void edit(ActividadPresupuesto actividadPresupuesto);

    void remove(ActividadPresupuesto actividadPresupuesto);

    ActividadPresupuesto find(Object id);

    List<ActividadPresupuesto> findAll();

    List<ActividadPresupuesto> findRange(int[] range);

    int count();
    
}
