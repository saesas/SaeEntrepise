/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SolucionProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SolucionProcesoFacadeLocal {

    void create(SolucionProceso solucionProceso);

    void edit(SolucionProceso solucionProceso);

    void remove(SolucionProceso solucionProceso);

    SolucionProceso find(Object id);

    List<SolucionProceso> findAll();

    List<SolucionProceso> findRange(int[] range);

    int count();
    
}
