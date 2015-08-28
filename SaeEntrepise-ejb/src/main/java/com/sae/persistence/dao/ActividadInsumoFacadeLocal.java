/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActividadInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActividadInsumoFacadeLocal {

    void create(ActividadInsumo actividadInsumo);

    void edit(ActividadInsumo actividadInsumo);

    void remove(ActividadInsumo actividadInsumo);

    ActividadInsumo find(Object id);

    List<ActividadInsumo> findAll();

    List<ActividadInsumo> findRange(int[] range);

    int count();
    
}
