/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoOrdenCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoOrdenCompraFacadeLocal {

    void create(TipoEstadoOrdenCompra tipoEstadoOrdenCompra);

    void edit(TipoEstadoOrdenCompra tipoEstadoOrdenCompra);

    void remove(TipoEstadoOrdenCompra tipoEstadoOrdenCompra);

    TipoEstadoOrdenCompra find(Object id);

    List<TipoEstadoOrdenCompra> findAll();

    List<TipoEstadoOrdenCompra> findRange(int[] range);

    int count();
    
}
