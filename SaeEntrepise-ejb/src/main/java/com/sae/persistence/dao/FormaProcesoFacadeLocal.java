/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FormaProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FormaProcesoFacadeLocal {

    void create(FormaProceso formaProceso);

    void edit(FormaProceso formaProceso);

    void remove(FormaProceso formaProceso);

    FormaProceso find(Object id);

    List<FormaProceso> findAll();

    List<FormaProceso> findRange(int[] range);

    int count();
    
}
