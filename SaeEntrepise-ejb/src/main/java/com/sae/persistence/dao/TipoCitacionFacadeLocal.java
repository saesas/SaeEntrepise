/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoCitacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoCitacionFacadeLocal {

    void create(TipoCitacion tipoCitacion);

    void edit(TipoCitacion tipoCitacion);

    void remove(TipoCitacion tipoCitacion);

    TipoCitacion find(Object id);

    List<TipoCitacion> findAll();

    List<TipoCitacion> findRange(int[] range);

    int count();
    
}
