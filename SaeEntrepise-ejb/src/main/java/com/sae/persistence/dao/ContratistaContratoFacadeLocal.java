/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContratistaContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContratistaContratoFacadeLocal {

    void create(ContratistaContrato contratistaContrato);

    void edit(ContratistaContrato contratistaContrato);

    void remove(ContratistaContrato contratistaContrato);

    ContratistaContrato find(Object id);

    List<ContratistaContrato> findAll();

    List<ContratistaContrato> findRange(int[] range);

    int count();
    
}
