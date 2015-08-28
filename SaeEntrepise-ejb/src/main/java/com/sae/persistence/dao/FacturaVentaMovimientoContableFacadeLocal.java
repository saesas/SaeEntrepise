/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaVentaMovimientoContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaVentaMovimientoContableFacadeLocal {

    void create(FacturaVentaMovimientoContable facturaVentaMovimientoContable);

    void edit(FacturaVentaMovimientoContable facturaVentaMovimientoContable);

    void remove(FacturaVentaMovimientoContable facturaVentaMovimientoContable);

    FacturaVentaMovimientoContable find(Object id);

    List<FacturaVentaMovimientoContable> findAll();

    List<FacturaVentaMovimientoContable> findRange(int[] range);

    int count();
    
}
