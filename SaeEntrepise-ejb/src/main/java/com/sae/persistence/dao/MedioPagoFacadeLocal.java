/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MedioPago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MedioPagoFacadeLocal {

    void create(MedioPago medioPago);

    void edit(MedioPago medioPago);

    void remove(MedioPago medioPago);

    MedioPago find(Object id);

    List<MedioPago> findAll();

    List<MedioPago> findRange(int[] range);

    int count();
    
}
