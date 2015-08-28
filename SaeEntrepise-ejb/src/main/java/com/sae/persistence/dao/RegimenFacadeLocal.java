/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Regimen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RegimenFacadeLocal {

    void create(Regimen regimen);

    void edit(Regimen regimen);

    void remove(Regimen regimen);

    Regimen find(Object id);

    List<Regimen> findAll();

    List<Regimen> findRange(int[] range);

    int count();
    
}
