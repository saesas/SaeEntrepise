/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContratoTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContratoTerceroFacadeLocal {

    void create(ContratoTercero contratoTercero);

    void edit(ContratoTercero contratoTercero);

    void remove(ContratoTercero contratoTercero);

    ContratoTercero find(Object id);

    List<ContratoTercero> findAll();

    List<ContratoTercero> findRange(int[] range);

    int count();
    
}
