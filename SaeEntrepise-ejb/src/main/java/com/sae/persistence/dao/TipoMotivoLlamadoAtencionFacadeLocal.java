/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoMotivoLlamadoAtencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoMotivoLlamadoAtencionFacadeLocal {

    void create(TipoMotivoLlamadoAtencion tipoMotivoLlamadoAtencion);

    void edit(TipoMotivoLlamadoAtencion tipoMotivoLlamadoAtencion);

    void remove(TipoMotivoLlamadoAtencion tipoMotivoLlamadoAtencion);

    TipoMotivoLlamadoAtencion find(Object id);

    List<TipoMotivoLlamadoAtencion> findAll();

    List<TipoMotivoLlamadoAtencion> findRange(int[] range);

    int count();
    
}
