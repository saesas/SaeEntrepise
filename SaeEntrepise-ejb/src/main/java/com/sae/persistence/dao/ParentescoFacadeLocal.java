/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Parentesco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ParentescoFacadeLocal {

    void create(Parentesco parentesco);

    void edit(Parentesco parentesco);

    void remove(Parentesco parentesco);

    Parentesco find(Object id);

    List<Parentesco> findAll();

    List<Parentesco> findRange(int[] range);

    int count();
    
}
