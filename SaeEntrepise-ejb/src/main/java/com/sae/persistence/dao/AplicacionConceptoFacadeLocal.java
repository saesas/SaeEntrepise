/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AplicacionConcepto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AplicacionConceptoFacadeLocal {

    void create(AplicacionConcepto aplicacionConcepto);

    void edit(AplicacionConcepto aplicacionConcepto);

    void remove(AplicacionConcepto aplicacionConcepto);

    AplicacionConcepto find(Object id);

    List<AplicacionConcepto> findAll();

    List<AplicacionConcepto> findRange(int[] range);

    int count();
    
}
