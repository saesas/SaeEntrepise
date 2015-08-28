/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.NivelContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface NivelContratoFacadeLocal {

    void create(NivelContrato nivelContrato);

    void edit(NivelContrato nivelContrato);

    void remove(NivelContrato nivelContrato);

    NivelContrato find(Object id);

    List<NivelContrato> findAll();

    List<NivelContrato> findRange(int[] range);

    int count();
    
}
