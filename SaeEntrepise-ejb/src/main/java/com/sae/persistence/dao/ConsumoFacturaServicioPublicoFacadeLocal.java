/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ConsumoFacturaServicioPublico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ConsumoFacturaServicioPublicoFacadeLocal {

    void create(ConsumoFacturaServicioPublico consumoFacturaServicioPublico);

    void edit(ConsumoFacturaServicioPublico consumoFacturaServicioPublico);

    void remove(ConsumoFacturaServicioPublico consumoFacturaServicioPublico);

    ConsumoFacturaServicioPublico find(Object id);

    List<ConsumoFacturaServicioPublico> findAll();

    List<ConsumoFacturaServicioPublico> findRange(int[] range);

    int count();
    
}
