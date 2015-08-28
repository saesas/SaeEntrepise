/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoCuentaCobro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoCuentaCobroFacadeLocal {

    void create(AdjuntoCuentaCobro adjuntoCuentaCobro);

    void edit(AdjuntoCuentaCobro adjuntoCuentaCobro);

    void remove(AdjuntoCuentaCobro adjuntoCuentaCobro);

    AdjuntoCuentaCobro find(Object id);

    List<AdjuntoCuentaCobro> findAll();

    List<AdjuntoCuentaCobro> findRange(int[] range);

    int count();
    
}
