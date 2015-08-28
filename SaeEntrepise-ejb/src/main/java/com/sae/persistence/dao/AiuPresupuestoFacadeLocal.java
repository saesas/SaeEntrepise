/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AiuPresupuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AiuPresupuestoFacadeLocal {

    void create(AiuPresupuesto aiuPresupuesto);

    void edit(AiuPresupuesto aiuPresupuesto);

    void remove(AiuPresupuesto aiuPresupuesto);

    AiuPresupuesto find(Object id);

    List<AiuPresupuesto> findAll();

    List<AiuPresupuesto> findRange(int[] range);

    int count();
    
}
