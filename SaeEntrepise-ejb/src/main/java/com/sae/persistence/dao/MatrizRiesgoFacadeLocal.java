/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MatrizRiesgo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MatrizRiesgoFacadeLocal {

    void create(MatrizRiesgo matrizRiesgo);

    void edit(MatrizRiesgo matrizRiesgo);

    void remove(MatrizRiesgo matrizRiesgo);

    MatrizRiesgo find(Object id);

    List<MatrizRiesgo> findAll();

    List<MatrizRiesgo> findRange(int[] range);

    int count();
    
}
