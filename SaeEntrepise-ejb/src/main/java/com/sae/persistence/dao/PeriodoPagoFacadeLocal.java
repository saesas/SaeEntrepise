/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PeriodoPago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PeriodoPagoFacadeLocal {

    void create(PeriodoPago periodoPago);

    void edit(PeriodoPago periodoPago);

    void remove(PeriodoPago periodoPago);

    PeriodoPago find(Object id);

    List<PeriodoPago> findAll();

    List<PeriodoPago> findRange(int[] range);

    int count();
    
}
