/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoContratante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoContratanteFacadeLocal {

    void create(TipoContratante tipoContratante);

    void edit(TipoContratante tipoContratante);

    void remove(TipoContratante tipoContratante);

    TipoContratante find(Object id);

    List<TipoContratante> findAll();

    List<TipoContratante> findRange(int[] range);

    int count();
    
}
