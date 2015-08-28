/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.GrupoServicioConceptoRetencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface GrupoServicioConceptoRetencionFacadeLocal {

    void create(GrupoServicioConceptoRetencion grupoServicioConceptoRetencion);

    void edit(GrupoServicioConceptoRetencion grupoServicioConceptoRetencion);

    void remove(GrupoServicioConceptoRetencion grupoServicioConceptoRetencion);

    GrupoServicioConceptoRetencion find(Object id);

    List<GrupoServicioConceptoRetencion> findAll();

    List<GrupoServicioConceptoRetencion> findRange(int[] range);

    int count();
    
}
