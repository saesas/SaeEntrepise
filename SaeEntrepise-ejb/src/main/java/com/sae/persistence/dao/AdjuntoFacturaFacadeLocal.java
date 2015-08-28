/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoFactura;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoFacturaFacadeLocal {

    void create(AdjuntoFactura adjuntoFactura);

    void edit(AdjuntoFactura adjuntoFactura);

    void remove(AdjuntoFactura adjuntoFactura);

    AdjuntoFactura find(Object id);

    List<AdjuntoFactura> findAll();

    List<AdjuntoFactura> findRange(int[] range);

    int count();
    
}
