/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Aiu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AiuFacadeLocal {

    void create(Aiu aiu);

    void edit(Aiu aiu);

    void remove(Aiu aiu);

    Aiu find(Object id);

    List<Aiu> findAll();

    List<Aiu> findRange(int[] range);

    int count();
    
}
