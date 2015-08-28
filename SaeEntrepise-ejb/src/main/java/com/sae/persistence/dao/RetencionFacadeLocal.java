/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Retencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RetencionFacadeLocal {

    void create(Retencion retencion);

    void edit(Retencion retencion);

    void remove(Retencion retencion);

    Retencion find(Object id);

    List<Retencion> findAll();

    List<Retencion> findRange(int[] range);

    int count();
    
}
