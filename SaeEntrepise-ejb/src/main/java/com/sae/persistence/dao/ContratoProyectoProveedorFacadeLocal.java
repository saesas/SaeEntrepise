/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContratoProyectoProveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContratoProyectoProveedorFacadeLocal {

    void create(ContratoProyectoProveedor contratoProyectoProveedor);

    void edit(ContratoProyectoProveedor contratoProyectoProveedor);

    void remove(ContratoProyectoProveedor contratoProyectoProveedor);

    ContratoProyectoProveedor find(Object id);

    List<ContratoProyectoProveedor> findAll();

    List<ContratoProyectoProveedor> findRange(int[] range);

    int count();
    
}
