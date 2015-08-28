/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoPropiedad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoPropiedadFacadeLocal {

    void create(TipoPropiedad tipoPropiedad);

    void edit(TipoPropiedad tipoPropiedad);

    void remove(TipoPropiedad tipoPropiedad);

    TipoPropiedad find(Object id);

    List<TipoPropiedad> findAll();

    List<TipoPropiedad> findRange(int[] range);

    int count();
    
}
