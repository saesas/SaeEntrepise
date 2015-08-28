/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoCredito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoCreditoFacadeLocal {

    void create(PagoCredito pagoCredito);

    void edit(PagoCredito pagoCredito);

    void remove(PagoCredito pagoCredito);

    PagoCredito find(Object id);

    List<PagoCredito> findAll();

    List<PagoCredito> findRange(int[] range);

    int count();
    
}
