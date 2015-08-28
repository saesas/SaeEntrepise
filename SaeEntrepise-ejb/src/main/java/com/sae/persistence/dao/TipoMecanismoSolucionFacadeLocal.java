/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoMecanismoSolucion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoMecanismoSolucionFacadeLocal {

    void create(TipoMecanismoSolucion tipoMecanismoSolucion);

    void edit(TipoMecanismoSolucion tipoMecanismoSolucion);

    void remove(TipoMecanismoSolucion tipoMecanismoSolucion);

    TipoMecanismoSolucion find(Object id);

    List<TipoMecanismoSolucion> findAll();

    List<TipoMecanismoSolucion> findRange(int[] range);

    int count();
    
}
