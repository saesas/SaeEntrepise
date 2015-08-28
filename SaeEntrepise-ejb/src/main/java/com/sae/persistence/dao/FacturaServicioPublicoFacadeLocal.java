/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FacturaServicioPublico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FacturaServicioPublicoFacadeLocal {

    void create(FacturaServicioPublico facturaServicioPublico);

    void edit(FacturaServicioPublico facturaServicioPublico);

    void remove(FacturaServicioPublico facturaServicioPublico);

    FacturaServicioPublico find(Object id);

    List<FacturaServicioPublico> findAll();

    List<FacturaServicioPublico> findRange(int[] range);

    int count();
    
}
