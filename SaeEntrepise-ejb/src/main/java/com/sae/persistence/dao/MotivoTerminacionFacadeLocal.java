/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MotivoTerminacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MotivoTerminacionFacadeLocal {

    void create(MotivoTerminacion motivoTerminacion);

    void edit(MotivoTerminacion motivoTerminacion);

    void remove(MotivoTerminacion motivoTerminacion);

    MotivoTerminacion find(Object id);

    List<MotivoTerminacion> findAll();

    List<MotivoTerminacion> findRange(int[] range);

    int count();
    
}
