/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoContratoFacadeLocal {

    void create(TipoEstadoContrato tipoEstadoContrato);

    void edit(TipoEstadoContrato tipoEstadoContrato);

    void remove(TipoEstadoContrato tipoEstadoContrato);

    TipoEstadoContrato find(Object id);

    List<TipoEstadoContrato> findAll();

    List<TipoEstadoContrato> findRange(int[] range);

    int count();
    
}
