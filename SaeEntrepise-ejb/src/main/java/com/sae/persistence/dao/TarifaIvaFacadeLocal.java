/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TarifaIva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TarifaIvaFacadeLocal {

    void create(TarifaIva tarifaIva);

    void edit(TarifaIva tarifaIva);

    void remove(TarifaIva tarifaIva);

    TarifaIva find(Object id);

    List<TarifaIva> findAll();

    List<TarifaIva> findRange(int[] range);

    int count();
    
}
