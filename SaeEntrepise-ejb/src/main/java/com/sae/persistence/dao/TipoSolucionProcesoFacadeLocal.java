/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoSolucionProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoSolucionProcesoFacadeLocal {

    void create(TipoSolucionProceso tipoSolucionProceso);

    void edit(TipoSolucionProceso tipoSolucionProceso);

    void remove(TipoSolucionProceso tipoSolucionProceso);

    TipoSolucionProceso find(Object id);

    List<TipoSolucionProceso> findAll();

    List<TipoSolucionProceso> findRange(int[] range);

    int count();
    
}
