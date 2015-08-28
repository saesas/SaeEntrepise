/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Normatividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface NormatividadFacadeLocal {

    void create(Normatividad normatividad);

    void edit(Normatividad normatividad);

    void remove(Normatividad normatividad);

    Normatividad find(Object id);

    List<Normatividad> findAll();

    List<Normatividad> findRange(int[] range);

    int count();
    
}
