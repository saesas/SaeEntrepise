/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.NivelEducacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface NivelEducacionFacadeLocal {

    void create(NivelEducacion nivelEducacion);

    void edit(NivelEducacion nivelEducacion);

    void remove(NivelEducacion nivelEducacion);

    NivelEducacion find(Object id);

    List<NivelEducacion> findAll();

    List<NivelEducacion> findRange(int[] range);

    int count();
    
}
