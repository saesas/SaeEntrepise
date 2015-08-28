/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ReferenciaPersonal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ReferenciaPersonalFacadeLocal {

    void create(ReferenciaPersonal referenciaPersonal);

    void edit(ReferenciaPersonal referenciaPersonal);

    void remove(ReferenciaPersonal referenciaPersonal);

    ReferenciaPersonal find(Object id);

    List<ReferenciaPersonal> findAll();

    List<ReferenciaPersonal> findRange(int[] range);

    int count();
    
}
