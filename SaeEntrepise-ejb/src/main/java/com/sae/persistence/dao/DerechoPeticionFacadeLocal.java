/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.DerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface DerechoPeticionFacadeLocal {

    void create(DerechoPeticion derechoPeticion);

    void edit(DerechoPeticion derechoPeticion);

    void remove(DerechoPeticion derechoPeticion);

    DerechoPeticion find(Object id);

    List<DerechoPeticion> findAll();

    List<DerechoPeticion> findRange(int[] range);

    int count();
    
}
