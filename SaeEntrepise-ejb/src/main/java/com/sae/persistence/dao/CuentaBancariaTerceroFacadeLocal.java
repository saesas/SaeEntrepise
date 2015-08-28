/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CuentaBancariaTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CuentaBancariaTerceroFacadeLocal {

    void create(CuentaBancariaTercero cuentaBancariaTercero);

    void edit(CuentaBancariaTercero cuentaBancariaTercero);

    void remove(CuentaBancariaTercero cuentaBancariaTercero);

    CuentaBancariaTercero find(Object id);

    List<CuentaBancariaTercero> findAll();

    List<CuentaBancariaTercero> findRange(int[] range);

    int count();
    
}
