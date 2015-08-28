/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContratoFuncion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContratoFuncionFacadeLocal {

    void create(ContratoFuncion contratoFuncion);

    void edit(ContratoFuncion contratoFuncion);

    void remove(ContratoFuncion contratoFuncion);

    ContratoFuncion find(Object id);

    List<ContratoFuncion> findAll();

    List<ContratoFuncion> findRange(int[] range);

    int count();
    
}
