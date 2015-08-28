/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContenidoDerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContenidoDerechoPeticionFacadeLocal {

    void create(ContenidoDerechoPeticion contenidoDerechoPeticion);

    void edit(ContenidoDerechoPeticion contenidoDerechoPeticion);

    void remove(ContenidoDerechoPeticion contenidoDerechoPeticion);

    ContenidoDerechoPeticion find(Object id);

    List<ContenidoDerechoPeticion> findAll();

    List<ContenidoDerechoPeticion> findRange(int[] range);

    int count();
    
}
