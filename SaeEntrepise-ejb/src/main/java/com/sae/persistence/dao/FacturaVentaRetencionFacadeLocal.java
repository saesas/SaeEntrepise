/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaVentaRetencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaVentaRetencionFacadeLocal {

    void create(FacturaVentaRetencion facturaVentaRetencion);

    void edit(FacturaVentaRetencion facturaVentaRetencion);

    void remove(FacturaVentaRetencion facturaVentaRetencion);

    FacturaVentaRetencion find(Object id);

    List<FacturaVentaRetencion> findAll();

    List<FacturaVentaRetencion> findRange(int[] range);

    int count();
    
}
