/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoConvocatoriaFacadeLocal {

    void create(EstadoConvocatoria estadoConvocatoria);

    void edit(EstadoConvocatoria estadoConvocatoria);

    void remove(EstadoConvocatoria estadoConvocatoria);

    EstadoConvocatoria find(Object id);

    List<EstadoConvocatoria> findAll();

    List<EstadoConvocatoria> findRange(int[] range);

    int count();
    
}
