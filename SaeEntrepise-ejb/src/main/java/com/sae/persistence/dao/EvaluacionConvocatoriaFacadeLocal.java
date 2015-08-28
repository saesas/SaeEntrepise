/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EvaluacionConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EvaluacionConvocatoriaFacadeLocal {

    void create(EvaluacionConvocatoria evaluacionConvocatoria);

    void edit(EvaluacionConvocatoria evaluacionConvocatoria);

    void remove(EvaluacionConvocatoria evaluacionConvocatoria);

    EvaluacionConvocatoria find(Object id);

    List<EvaluacionConvocatoria> findAll();

    List<EvaluacionConvocatoria> findRange(int[] range);

    int count();
    
}
