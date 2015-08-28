/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RetencionEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RetencionEmpleadoFacadeLocal {

    void create(RetencionEmpleado retencionEmpleado);

    void edit(RetencionEmpleado retencionEmpleado);

    void remove(RetencionEmpleado retencionEmpleado);

    RetencionEmpleado find(Object id);

    List<RetencionEmpleado> findAll();

    List<RetencionEmpleado> findRange(int[] range);

    int count();
    
}
