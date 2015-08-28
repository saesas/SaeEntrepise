/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoEstadoAudiencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoEstadoAudienciaFacadeLocal {

    void create(TipoEstadoAudiencia tipoEstadoAudiencia);

    void edit(TipoEstadoAudiencia tipoEstadoAudiencia);

    void remove(TipoEstadoAudiencia tipoEstadoAudiencia);

    TipoEstadoAudiencia find(Object id);

    List<TipoEstadoAudiencia> findAll();

    List<TipoEstadoAudiencia> findRange(int[] range);

    int count();
    
}
