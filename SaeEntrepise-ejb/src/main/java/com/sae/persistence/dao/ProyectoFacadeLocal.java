/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Proyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ProyectoFacadeLocal {

    void create(Proyecto proyecto);

    void edit(Proyecto proyecto);

    void remove(Proyecto proyecto);

    Proyecto find(Object id);

    List<Proyecto> findAll();

    List<Proyecto> findRange(int[] range);

    int count();
    
}
