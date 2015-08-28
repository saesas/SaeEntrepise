/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActividadEconomica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActividadEconomicaFacadeLocal {

    void create(ActividadEconomica actividadEconomica);

    void edit(ActividadEconomica actividadEconomica);

    void remove(ActividadEconomica actividadEconomica);

    ActividadEconomica find(Object id);

    List<ActividadEconomica> findAll();

    List<ActividadEconomica> findRange(int[] range);

    int count();
    
}
