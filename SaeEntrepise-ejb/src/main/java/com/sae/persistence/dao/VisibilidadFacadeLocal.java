/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Visibilidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface VisibilidadFacadeLocal {

    void create(Visibilidad visibilidad);

    void edit(Visibilidad visibilidad);

    void remove(Visibilidad visibilidad);

    Visibilidad find(Object id);

    List<Visibilidad> findAll();

    List<Visibilidad> findRange(int[] range);

    int count();
    
}
