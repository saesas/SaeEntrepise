/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.OrigenOtrosi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface OrigenOtrosiFacadeLocal {

    void create(OrigenOtrosi origenOtrosi);

    void edit(OrigenOtrosi origenOtrosi);

    void remove(OrigenOtrosi origenOtrosi);

    OrigenOtrosi find(Object id);

    List<OrigenOtrosi> findAll();

    List<OrigenOtrosi> findRange(int[] range);

    int count();
    
}
