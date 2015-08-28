/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoConvocatoriaFacadeLocal {

    void create(AdjuntoConvocatoria adjuntoConvocatoria);

    void edit(AdjuntoConvocatoria adjuntoConvocatoria);

    void remove(AdjuntoConvocatoria adjuntoConvocatoria);

    AdjuntoConvocatoria find(Object id);

    List<AdjuntoConvocatoria> findAll();

    List<AdjuntoConvocatoria> findRange(int[] range);

    int count();
    
}
