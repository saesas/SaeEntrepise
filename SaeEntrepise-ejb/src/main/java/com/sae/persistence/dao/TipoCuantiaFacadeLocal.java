/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoCuantia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoCuantiaFacadeLocal {

    void create(TipoCuantia tipoCuantia);

    void edit(TipoCuantia tipoCuantia);

    void remove(TipoCuantia tipoCuantia);

    TipoCuantia find(Object id);

    List<TipoCuantia> findAll();

    List<TipoCuantia> findRange(int[] range);

    int count();
    
}
