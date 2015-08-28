/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RegimenTipoTarifaIva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RegimenTipoTarifaIvaFacadeLocal {

    void create(RegimenTipoTarifaIva regimenTipoTarifaIva);

    void edit(RegimenTipoTarifaIva regimenTipoTarifaIva);

    void remove(RegimenTipoTarifaIva regimenTipoTarifaIva);

    RegimenTipoTarifaIva find(Object id);

    List<RegimenTipoTarifaIva> findAll();

    List<RegimenTipoTarifaIva> findRange(int[] range);

    int count();
    
}
