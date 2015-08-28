/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EtapaProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EtapaProcesoFacadeLocal {

    void create(EtapaProceso etapaProceso);

    void edit(EtapaProceso etapaProceso);

    void remove(EtapaProceso etapaProceso);

    EtapaProceso find(Object id);

    List<EtapaProceso> findAll();

    List<EtapaProceso> findRange(int[] range);

    int count();
    
}
