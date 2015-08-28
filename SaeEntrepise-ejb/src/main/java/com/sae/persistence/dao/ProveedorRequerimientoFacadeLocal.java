/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ProveedorRequerimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ProveedorRequerimientoFacadeLocal {

    void create(ProveedorRequerimiento proveedorRequerimiento);

    void edit(ProveedorRequerimiento proveedorRequerimiento);

    void remove(ProveedorRequerimiento proveedorRequerimiento);

    ProveedorRequerimiento find(Object id);

    List<ProveedorRequerimiento> findAll();

    List<ProveedorRequerimiento> findRange(int[] range);

    int count();
    
}
