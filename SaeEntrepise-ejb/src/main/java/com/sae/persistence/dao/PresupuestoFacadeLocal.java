/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Presupuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PresupuestoFacadeLocal {

    void create(Presupuesto presupuesto);

    void edit(Presupuesto presupuesto);

    void remove(Presupuesto presupuesto);

    Presupuesto find(Object id);

    List<Presupuesto> findAll();

    List<Presupuesto> findRange(int[] range);

    int count();
    
}
