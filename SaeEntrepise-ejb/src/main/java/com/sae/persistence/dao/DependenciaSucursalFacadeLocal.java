/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.DependenciaSucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface DependenciaSucursalFacadeLocal {

    void create(DependenciaSucursal dependenciaSucursal);

    void edit(DependenciaSucursal dependenciaSucursal);

    void remove(DependenciaSucursal dependenciaSucursal);

    DependenciaSucursal find(Object id);

    List<DependenciaSucursal> findAll();

    List<DependenciaSucursal> findRange(int[] range);

    int count();
    
}
