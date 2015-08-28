/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CuentaCobroMovimientoContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CuentaCobroMovimientoContableFacadeLocal {

    void create(CuentaCobroMovimientoContable cuentaCobroMovimientoContable);

    void edit(CuentaCobroMovimientoContable cuentaCobroMovimientoContable);

    void remove(CuentaCobroMovimientoContable cuentaCobroMovimientoContable);

    CuentaCobroMovimientoContable find(Object id);

    List<CuentaCobroMovimientoContable> findAll();

    List<CuentaCobroMovimientoContable> findRange(int[] range);

    int count();
    
}
