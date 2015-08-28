/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaCompraMovimientoContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaCompraMovimientoContableFacadeLocal {

    void create(FacturaCompraMovimientoContable facturaCompraMovimientoContable);

    void edit(FacturaCompraMovimientoContable facturaCompraMovimientoContable);

    void remove(FacturaCompraMovimientoContable facturaCompraMovimientoContable);

    FacturaCompraMovimientoContable find(Object id);

    List<FacturaCompraMovimientoContable> findAll();

    List<FacturaCompraMovimientoContable> findRange(int[] range);

    int count();
    
}
