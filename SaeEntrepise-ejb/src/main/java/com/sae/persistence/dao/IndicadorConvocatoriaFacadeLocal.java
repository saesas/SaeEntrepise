/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.IndicadorConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface IndicadorConvocatoriaFacadeLocal {

    void create(IndicadorConvocatoria indicadorConvocatoria);

    void edit(IndicadorConvocatoria indicadorConvocatoria);

    void remove(IndicadorConvocatoria indicadorConvocatoria);

    IndicadorConvocatoria find(Object id);

    List<IndicadorConvocatoria> findAll();

    List<IndicadorConvocatoria> findRange(int[] range);

    int count();
    
}
