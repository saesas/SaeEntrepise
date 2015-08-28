/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ClaseContratoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ClaseContratoProyectoFacadeLocal {

    void create(ClaseContratoProyecto claseContratoProyecto);

    void edit(ClaseContratoProyecto claseContratoProyecto);

    void remove(ClaseContratoProyecto claseContratoProyecto);

    ClaseContratoProyecto find(Object id);

    List<ClaseContratoProyecto> findAll();

    List<ClaseContratoProyecto> findRange(int[] range);

    int count();
    
}
