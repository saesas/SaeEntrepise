/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.IndicadorConsumoServicio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface IndicadorConsumoServicioFacadeLocal {

    void create(IndicadorConsumoServicio indicadorConsumoServicio);

    void edit(IndicadorConsumoServicio indicadorConsumoServicio);

    void remove(IndicadorConsumoServicio indicadorConsumoServicio);

    IndicadorConsumoServicio find(Object id);

    List<IndicadorConsumoServicio> findAll();

    List<IndicadorConsumoServicio> findRange(int[] range);

    int count();
    
}
