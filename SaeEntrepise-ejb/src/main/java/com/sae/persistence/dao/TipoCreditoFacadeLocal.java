/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoCredito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoCreditoFacadeLocal {

    void create(TipoCredito tipoCredito);

    void edit(TipoCredito tipoCredito);

    void remove(TipoCredito tipoCredito);

    TipoCredito find(Object id);

    List<TipoCredito> findAll();

    List<TipoCredito> findRange(int[] range);

    int count();
    
}
