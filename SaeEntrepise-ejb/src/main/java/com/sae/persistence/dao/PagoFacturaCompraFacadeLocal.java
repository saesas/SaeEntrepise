/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoFacturaCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoFacturaCompraFacadeLocal {

    void create(PagoFacturaCompra pagoFacturaCompra);

    void edit(PagoFacturaCompra pagoFacturaCompra);

    void remove(PagoFacturaCompra pagoFacturaCompra);

    PagoFacturaCompra find(Object id);

    List<PagoFacturaCompra> findAll();

    List<PagoFacturaCompra> findRange(int[] range);

    int count();
    
}
