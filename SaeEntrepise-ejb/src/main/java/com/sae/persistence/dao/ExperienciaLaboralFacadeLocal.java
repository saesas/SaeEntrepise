/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ExperienciaLaboral;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ExperienciaLaboralFacadeLocal {

    void create(ExperienciaLaboral experienciaLaboral);

    void edit(ExperienciaLaboral experienciaLaboral);

    void remove(ExperienciaLaboral experienciaLaboral);

    ExperienciaLaboral find(Object id);

    List<ExperienciaLaboral> findAll();

    List<ExperienciaLaboral> findRange(int[] range);

    int count();
    
}
