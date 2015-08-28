/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MotivoLlamadoAtencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MotivoLlamadoAtencionFacadeLocal {

    void create(MotivoLlamadoAtencion motivoLlamadoAtencion);

    void edit(MotivoLlamadoAtencion motivoLlamadoAtencion);

    void remove(MotivoLlamadoAtencion motivoLlamadoAtencion);

    MotivoLlamadoAtencion find(Object id);

    List<MotivoLlamadoAtencion> findAll();

    List<MotivoLlamadoAtencion> findRange(int[] range);

    int count();
    
}
