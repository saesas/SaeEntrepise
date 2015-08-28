/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoFacturaVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoFacturaVentaFacadeLocal {

    void create(TipoFacturaVenta tipoFacturaVenta);

    void edit(TipoFacturaVenta tipoFacturaVenta);

    void remove(TipoFacturaVenta tipoFacturaVenta);

    TipoFacturaVenta find(Object id);

    List<TipoFacturaVenta> findAll();

    List<TipoFacturaVenta> findRange(int[] range);

    int count();
    
}
