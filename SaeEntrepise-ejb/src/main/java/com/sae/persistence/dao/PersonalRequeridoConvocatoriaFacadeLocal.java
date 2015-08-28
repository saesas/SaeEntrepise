/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PersonalRequeridoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PersonalRequeridoConvocatoriaFacadeLocal {

    void create(PersonalRequeridoConvocatoria personalRequeridoConvocatoria);

    void edit(PersonalRequeridoConvocatoria personalRequeridoConvocatoria);

    void remove(PersonalRequeridoConvocatoria personalRequeridoConvocatoria);

    PersonalRequeridoConvocatoria find(Object id);

    List<PersonalRequeridoConvocatoria> findAll();

    List<PersonalRequeridoConvocatoria> findRange(int[] range);

    int count();
    
}
