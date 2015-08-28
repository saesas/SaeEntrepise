/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoNominaFacadeLocal {

    void create(TipoEstadoNomina tipoEstadoNomina);

    void edit(TipoEstadoNomina tipoEstadoNomina);

    void remove(TipoEstadoNomina tipoEstadoNomina);

    TipoEstadoNomina find(Object id);

    List<TipoEstadoNomina> findAll();

    List<TipoEstadoNomina> findRange(int[] range);

    int count();
    
}
