/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ItemEvaluacionConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ItemEvaluacionConvocatoriaFacadeLocal {

    void create(ItemEvaluacionConvocatoria itemEvaluacionConvocatoria);

    void edit(ItemEvaluacionConvocatoria itemEvaluacionConvocatoria);

    void remove(ItemEvaluacionConvocatoria itemEvaluacionConvocatoria);

    ItemEvaluacionConvocatoria find(Object id);

    List<ItemEvaluacionConvocatoria> findAll();

    List<ItemEvaluacionConvocatoria> findRange(int[] range);

    int count();
    
}
