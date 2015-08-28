/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoDatoMatrizRiesgo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoDatoMatrizRiesgoFacadeLocal {

    void create(TipoDatoMatrizRiesgo tipoDatoMatrizRiesgo);

    void edit(TipoDatoMatrizRiesgo tipoDatoMatrizRiesgo);

    void remove(TipoDatoMatrizRiesgo tipoDatoMatrizRiesgo);

    TipoDatoMatrizRiesgo find(Object id);

    List<TipoDatoMatrizRiesgo> findAll();

    List<TipoDatoMatrizRiesgo> findRange(int[] range);

    int count();
    
}
