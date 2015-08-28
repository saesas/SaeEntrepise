/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.OrigenDerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface OrigenDerechoPeticionFacadeLocal {

    void create(OrigenDerechoPeticion origenDerechoPeticion);

    void edit(OrigenDerechoPeticion origenDerechoPeticion);

    void remove(OrigenDerechoPeticion origenDerechoPeticion);

    OrigenDerechoPeticion find(Object id);

    List<OrigenDerechoPeticion> findAll();

    List<OrigenDerechoPeticion> findRange(int[] range);

    int count();
    
}
