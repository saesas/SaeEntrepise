/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ConceptoNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ConceptoNominaFacadeLocal {

    void create(ConceptoNomina conceptoNomina);

    void edit(ConceptoNomina conceptoNomina);

    void remove(ConceptoNomina conceptoNomina);

    ConceptoNomina find(Object id);

    List<ConceptoNomina> findAll();

    List<ConceptoNomina> findRange(int[] range);

    int count();
    
}
