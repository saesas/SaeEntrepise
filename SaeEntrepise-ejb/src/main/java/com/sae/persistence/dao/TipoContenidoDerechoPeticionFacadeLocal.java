/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoContenidoDerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoContenidoDerechoPeticionFacadeLocal {

    void create(TipoContenidoDerechoPeticion tipoContenidoDerechoPeticion);

    void edit(TipoContenidoDerechoPeticion tipoContenidoDerechoPeticion);

    void remove(TipoContenidoDerechoPeticion tipoContenidoDerechoPeticion);

    TipoContenidoDerechoPeticion find(Object id);

    List<TipoContenidoDerechoPeticion> findAll();

    List<TipoContenidoDerechoPeticion> findRange(int[] range);

    int count();
    
}
