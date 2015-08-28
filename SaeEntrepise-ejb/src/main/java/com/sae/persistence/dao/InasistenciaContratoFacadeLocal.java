/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.InasistenciaContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface InasistenciaContratoFacadeLocal {

    void create(InasistenciaContrato inasistenciaContrato);

    void edit(InasistenciaContrato inasistenciaContrato);

    void remove(InasistenciaContrato inasistenciaContrato);

    InasistenciaContrato find(Object id);

    List<InasistenciaContrato> findAll();

    List<InasistenciaContrato> findRange(int[] range);

    int count();
    
}
