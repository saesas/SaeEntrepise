/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoAdjunto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoAdjuntoFacadeLocal {

    void create(TipoAdjunto tipoAdjunto);

    void edit(TipoAdjunto tipoAdjunto);

    void remove(TipoAdjunto tipoAdjunto);

    TipoAdjunto find(Object id);

    List<TipoAdjunto> findAll();

    List<TipoAdjunto> findRange(int[] range);

    int count();
    
}
