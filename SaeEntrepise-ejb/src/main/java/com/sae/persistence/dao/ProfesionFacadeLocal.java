/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Profesion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ProfesionFacadeLocal {

    void create(Profesion profesion);

    void edit(Profesion profesion);

    void remove(Profesion profesion);

    Profesion find(Object id);

    List<Profesion> findAll();

    List<Profesion> findRange(int[] range);

    int count();
    
}
