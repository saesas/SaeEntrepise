/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.OrdenCompraInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface OrdenCompraInsumoFacadeLocal {

    void create(OrdenCompraInsumo ordenCompraInsumo);

    void edit(OrdenCompraInsumo ordenCompraInsumo);

    void remove(OrdenCompraInsumo ordenCompraInsumo);

    OrdenCompraInsumo find(Object id);

    List<OrdenCompraInsumo> findAll();

    List<OrdenCompraInsumo> findRange(int[] range);

    int count();
    
}
