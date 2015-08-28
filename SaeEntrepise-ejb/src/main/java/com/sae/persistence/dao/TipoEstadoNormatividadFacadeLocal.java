/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoNormatividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoNormatividadFacadeLocal {

    void create(TipoEstadoNormatividad tipoEstadoNormatividad);

    void edit(TipoEstadoNormatividad tipoEstadoNormatividad);

    void remove(TipoEstadoNormatividad tipoEstadoNormatividad);

    TipoEstadoNormatividad find(Object id);

    List<TipoEstadoNormatividad> findAll();

    List<TipoEstadoNormatividad> findRange(int[] range);

    int count();
    
}
