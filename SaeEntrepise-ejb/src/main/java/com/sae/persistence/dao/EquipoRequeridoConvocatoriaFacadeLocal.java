/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EquipoRequeridoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EquipoRequeridoConvocatoriaFacadeLocal {

    void create(EquipoRequeridoConvocatoria equipoRequeridoConvocatoria);

    void edit(EquipoRequeridoConvocatoria equipoRequeridoConvocatoria);

    void remove(EquipoRequeridoConvocatoria equipoRequeridoConvocatoria);

    EquipoRequeridoConvocatoria find(Object id);

    List<EquipoRequeridoConvocatoria> findAll();

    List<EquipoRequeridoConvocatoria> findRange(int[] range);

    int count();
    
}
