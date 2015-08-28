/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Configuracion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ConfiguracionFacadeLocal {

    void create(Configuracion configuracion);

    void edit(Configuracion configuracion);

    void remove(Configuracion configuracion);

    Configuracion find(Object id);

    List<Configuracion> findAll();

    List<Configuracion> findRange(int[] range);

    int count();
    
}
