/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoTarifaServicioPublico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoTarifaServicioPublicoFacadeLocal {

    void create(TipoTarifaServicioPublico tipoTarifaServicioPublico);

    void edit(TipoTarifaServicioPublico tipoTarifaServicioPublico);

    void remove(TipoTarifaServicioPublico tipoTarifaServicioPublico);

    TipoTarifaServicioPublico find(Object id);

    List<TipoTarifaServicioPublico> findAll();

    List<TipoTarifaServicioPublico> findRange(int[] range);

    int count();
    
}
