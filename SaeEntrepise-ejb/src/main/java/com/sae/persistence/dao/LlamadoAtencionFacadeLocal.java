/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.LlamadoAtencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface LlamadoAtencionFacadeLocal {

    void create(LlamadoAtencion llamadoAtencion);

    void edit(LlamadoAtencion llamadoAtencion);

    void remove(LlamadoAtencion llamadoAtencion);

    LlamadoAtencion find(Object id);

    List<LlamadoAtencion> findAll();

    List<LlamadoAtencion> findRange(int[] range);

    int count();
    
}
