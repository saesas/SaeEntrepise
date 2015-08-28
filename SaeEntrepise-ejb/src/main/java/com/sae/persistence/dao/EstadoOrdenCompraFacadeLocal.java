/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoOrdenCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoOrdenCompraFacadeLocal {

    void create(EstadoOrdenCompra estadoOrdenCompra);

    void edit(EstadoOrdenCompra estadoOrdenCompra);

    void remove(EstadoOrdenCompra estadoOrdenCompra);

    EstadoOrdenCompra find(Object id);

    List<EstadoOrdenCompra> findAll();

    List<EstadoOrdenCompra> findRange(int[] range);

    int count();
    
}
