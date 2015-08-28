/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoBitacora;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoBitacoraFacadeLocal {

    void create(AdjuntoBitacora adjuntoBitacora);

    void edit(AdjuntoBitacora adjuntoBitacora);

    void remove(AdjuntoBitacora adjuntoBitacora);

    AdjuntoBitacora find(Object id);

    List<AdjuntoBitacora> findAll();

    List<AdjuntoBitacora> findRange(int[] range);

    int count();
    
}
