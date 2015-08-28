/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AplicacionTributaria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AplicacionTributariaFacadeLocal {

    void create(AplicacionTributaria aplicacionTributaria);

    void edit(AplicacionTributaria aplicacionTributaria);

    void remove(AplicacionTributaria aplicacionTributaria);

    AplicacionTributaria find(Object id);

    List<AplicacionTributaria> findAll();

    List<AplicacionTributaria> findRange(int[] range);

    int count();
    
}
