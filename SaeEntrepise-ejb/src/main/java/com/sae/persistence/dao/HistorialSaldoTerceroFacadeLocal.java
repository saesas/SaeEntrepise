/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.HistorialSaldoTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface HistorialSaldoTerceroFacadeLocal {

    void create(HistorialSaldoTercero historialSaldoTercero);

    void edit(HistorialSaldoTercero historialSaldoTercero);

    void remove(HistorialSaldoTercero historialSaldoTercero);

    HistorialSaldoTercero find(Object id);

    List<HistorialSaldoTercero> findAll();

    List<HistorialSaldoTercero> findRange(int[] range);

    int count();
    
}
