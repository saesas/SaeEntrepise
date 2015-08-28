/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoClausulaContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoClausulaContratoFacadeLocal {

    void create(TipoClausulaContrato tipoClausulaContrato);

    void edit(TipoClausulaContrato tipoClausulaContrato);

    void remove(TipoClausulaContrato tipoClausulaContrato);

    TipoClausulaContrato find(Object id);

    List<TipoClausulaContrato> findAll();

    List<TipoClausulaContrato> findRange(int[] range);

    int count();
    
}
