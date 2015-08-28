/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.NivelPuc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface NivelPucFacadeLocal {

    void create(NivelPuc nivelPuc);

    void edit(NivelPuc nivelPuc);

    void remove(NivelPuc nivelPuc);

    NivelPuc find(Object id);

    List<NivelPuc> findAll();

    List<NivelPuc> findRange(int[] range);

    int count();
    
}
