/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoContratoFacadeLocal {

    void create(EstadoContrato estadoContrato);

    void edit(EstadoContrato estadoContrato);

    void remove(EstadoContrato estadoContrato);

    EstadoContrato find(Object id);

    List<EstadoContrato> findAll();

    List<EstadoContrato> findRange(int[] range);

    int count();
    
}
