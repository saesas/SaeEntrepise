/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CuentaCobro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CuentaCobroFacadeLocal {

    void create(CuentaCobro cuentaCobro);

    void edit(CuentaCobro cuentaCobro);

    void remove(CuentaCobro cuentaCobro);

    CuentaCobro find(Object id);

    List<CuentaCobro> findAll();

    List<CuentaCobro> findRange(int[] range);

    int count();
    
}
