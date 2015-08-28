/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoInsumoFacadeLocal {

    void create(TipoInsumo tipoInsumo);

    void edit(TipoInsumo tipoInsumo);

    void remove(TipoInsumo tipoInsumo);

    TipoInsumo find(Object id);

    List<TipoInsumo> findAll();

    List<TipoInsumo> findRange(int[] range);

    int count();
    
}
