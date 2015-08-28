/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoFacturaVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoFacturaVentaFacadeLocal {

    void create(PagoFacturaVenta pagoFacturaVenta);

    void edit(PagoFacturaVenta pagoFacturaVenta);

    void remove(PagoFacturaVenta pagoFacturaVenta);

    PagoFacturaVenta find(Object id);

    List<PagoFacturaVenta> findAll();

    List<PagoFacturaVenta> findRange(int[] range);

    int count();
    
}
