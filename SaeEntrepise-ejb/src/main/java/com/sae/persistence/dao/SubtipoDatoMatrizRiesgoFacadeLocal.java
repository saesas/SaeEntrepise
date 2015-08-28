/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SubtipoDatoMatrizRiesgo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SubtipoDatoMatrizRiesgoFacadeLocal {

    void create(SubtipoDatoMatrizRiesgo subtipoDatoMatrizRiesgo);

    void edit(SubtipoDatoMatrizRiesgo subtipoDatoMatrizRiesgo);

    void remove(SubtipoDatoMatrizRiesgo subtipoDatoMatrizRiesgo);

    SubtipoDatoMatrizRiesgo find(Object id);

    List<SubtipoDatoMatrizRiesgo> findAll();

    List<SubtipoDatoMatrizRiesgo> findRange(int[] range);

    int count();
    
}
