/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoOrganizacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoOrganizacionFacadeLocal {

    void create(TipoOrganizacion tipoOrganizacion);

    void edit(TipoOrganizacion tipoOrganizacion);

    void remove(TipoOrganizacion tipoOrganizacion);

    TipoOrganizacion find(Object id);

    List<TipoOrganizacion> findAll();

    List<TipoOrganizacion> findRange(int[] range);

    int count();
    
}
