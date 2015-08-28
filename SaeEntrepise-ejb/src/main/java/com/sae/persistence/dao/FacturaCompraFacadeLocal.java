/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaCompraFacadeLocal {

    void create(FacturaCompra facturaCompra);

    void edit(FacturaCompra facturaCompra);

    void remove(FacturaCompra facturaCompra);

    FacturaCompra find(Object id);

    List<FacturaCompra> findAll();

    List<FacturaCompra> findRange(int[] range);

    int count();
    
}
