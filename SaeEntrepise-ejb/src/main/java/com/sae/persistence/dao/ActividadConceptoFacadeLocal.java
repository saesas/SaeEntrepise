/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActividadConcepto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActividadConceptoFacadeLocal {

    void create(ActividadConcepto actividadConcepto);

    void edit(ActividadConcepto actividadConcepto);

    void remove(ActividadConcepto actividadConcepto);

    ActividadConcepto find(Object id);

    List<ActividadConcepto> findAll();

    List<ActividadConcepto> findRange(int[] range);

    int count();
    
}
