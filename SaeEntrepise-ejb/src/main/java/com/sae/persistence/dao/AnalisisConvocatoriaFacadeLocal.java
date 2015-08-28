/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AnalisisConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AnalisisConvocatoriaFacadeLocal {

    void create(AnalisisConvocatoria analisisConvocatoria);

    void edit(AnalisisConvocatoria analisisConvocatoria);

    void remove(AnalisisConvocatoria analisisConvocatoria);

    AnalisisConvocatoria find(Object id);

    List<AnalisisConvocatoria> findAll();

    List<AnalisisConvocatoria> findRange(int[] range);

    int count();
    
}
