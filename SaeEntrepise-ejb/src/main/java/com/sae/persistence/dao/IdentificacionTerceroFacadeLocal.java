/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.IdentificacionTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface IdentificacionTerceroFacadeLocal {

    void create(IdentificacionTercero identificacionTercero);

    void edit(IdentificacionTercero identificacionTercero);

    void remove(IdentificacionTercero identificacionTercero);

    IdentificacionTercero find(Object id);

    List<IdentificacionTercero> findAll();

    List<IdentificacionTercero> findRange(int[] range);

    int count();
    
}
