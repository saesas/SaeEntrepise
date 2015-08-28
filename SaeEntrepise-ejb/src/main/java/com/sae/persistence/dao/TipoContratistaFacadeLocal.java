/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoContratista;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoContratistaFacadeLocal {

    void create(TipoContratista tipoContratista);

    void edit(TipoContratista tipoContratista);

    void remove(TipoContratista tipoContratista);

    TipoContratista find(Object id);

    List<TipoContratista> findAll();

    List<TipoContratista> findRange(int[] range);

    int count();
    
}
