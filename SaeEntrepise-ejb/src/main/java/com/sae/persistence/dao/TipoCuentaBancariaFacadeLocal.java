/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoCuentaBancaria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoCuentaBancariaFacadeLocal {

    void create(TipoCuentaBancaria tipoCuentaBancaria);

    void edit(TipoCuentaBancaria tipoCuentaBancaria);

    void remove(TipoCuentaBancaria tipoCuentaBancaria);

    TipoCuentaBancaria find(Object id);

    List<TipoCuentaBancaria> findAll();

    List<TipoCuentaBancaria> findRange(int[] range);

    int count();
    
}
