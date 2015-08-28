/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Reintegro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ReintegroFacadeLocal {

    void create(Reintegro reintegro);

    void edit(Reintegro reintegro);

    void remove(Reintegro reintegro);

    Reintegro find(Object id);

    List<Reintegro> findAll();

    List<Reintegro> findRange(int[] range);

    int count();
    
}
