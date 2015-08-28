/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ClausulaContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ClausulaContratoFacadeLocal {

    void create(ClausulaContrato clausulaContrato);

    void edit(ClausulaContrato clausulaContrato);

    void remove(ClausulaContrato clausulaContrato);

    ClausulaContrato find(Object id);

    List<ClausulaContrato> findAll();

    List<ClausulaContrato> findRange(int[] range);

    int count();
    
}
