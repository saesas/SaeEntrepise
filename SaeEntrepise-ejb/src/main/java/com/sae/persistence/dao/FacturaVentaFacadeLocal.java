/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaVentaFacadeLocal {

    void create(FacturaVenta facturaVenta);

    void edit(FacturaVenta facturaVenta);

    void remove(FacturaVenta facturaVenta);

    FacturaVenta find(Object id);

    List<FacturaVenta> findAll();

    List<FacturaVenta> findRange(int[] range);

    int count();
    
}
