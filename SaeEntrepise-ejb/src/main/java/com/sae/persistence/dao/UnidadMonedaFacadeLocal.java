/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.UnidadMoneda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface UnidadMonedaFacadeLocal {

    void create(UnidadMoneda unidadMoneda);

    void edit(UnidadMoneda unidadMoneda);

    void remove(UnidadMoneda unidadMoneda);

    UnidadMoneda find(Object id);

    List<UnidadMoneda> findAll();

    List<UnidadMoneda> findRange(int[] range);

    int count();
    
}
