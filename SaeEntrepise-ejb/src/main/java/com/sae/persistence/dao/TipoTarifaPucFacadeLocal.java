/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoTarifaPuc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoTarifaPucFacadeLocal {

    void create(TipoTarifaPuc tipoTarifaPuc);

    void edit(TipoTarifaPuc tipoTarifaPuc);

    void remove(TipoTarifaPuc tipoTarifaPuc);

    TipoTarifaPuc find(Object id);

    List<TipoTarifaPuc> findAll();

    List<TipoTarifaPuc> findRange(int[] range);

    int count();
    
}
