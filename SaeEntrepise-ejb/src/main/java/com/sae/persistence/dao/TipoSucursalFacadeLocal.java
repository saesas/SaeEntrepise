/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoSucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoSucursalFacadeLocal {

    void create(TipoSucursal tipoSucursal);

    void edit(TipoSucursal tipoSucursal);

    void remove(TipoSucursal tipoSucursal);

    TipoSucursal find(Object id);

    List<TipoSucursal> findAll();

    List<TipoSucursal> findRange(int[] range);

    int count();
    
}
