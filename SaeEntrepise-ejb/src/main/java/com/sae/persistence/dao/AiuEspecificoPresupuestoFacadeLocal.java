/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AiuEspecificoPresupuesto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AiuEspecificoPresupuestoFacadeLocal {

    void create(AiuEspecificoPresupuesto aiuEspecificoPresupuesto);

    void edit(AiuEspecificoPresupuesto aiuEspecificoPresupuesto);

    void remove(AiuEspecificoPresupuesto aiuEspecificoPresupuesto);

    AiuEspecificoPresupuesto find(Object id);

    List<AiuEspecificoPresupuesto> findAll();

    List<AiuEspecificoPresupuesto> findRange(int[] range);

    int count();
    
}
