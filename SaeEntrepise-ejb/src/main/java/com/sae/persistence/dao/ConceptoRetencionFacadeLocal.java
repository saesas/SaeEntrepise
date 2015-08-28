/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ConceptoRetencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ConceptoRetencionFacadeLocal {

    void create(ConceptoRetencion conceptoRetencion);

    void edit(ConceptoRetencion conceptoRetencion);

    void remove(ConceptoRetencion conceptoRetencion);

    ConceptoRetencion find(Object id);

    List<ConceptoRetencion> findAll();

    List<ConceptoRetencion> findRange(int[] range);

    int count();
    
}
