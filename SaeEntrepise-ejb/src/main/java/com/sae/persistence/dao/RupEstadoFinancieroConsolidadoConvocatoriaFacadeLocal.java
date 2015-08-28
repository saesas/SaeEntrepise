/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RupEstadoFinancieroConsolidadoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RupEstadoFinancieroConsolidadoConvocatoriaFacadeLocal {

    void create(RupEstadoFinancieroConsolidadoConvocatoria rupEstadoFinancieroConsolidadoConvocatoria);

    void edit(RupEstadoFinancieroConsolidadoConvocatoria rupEstadoFinancieroConsolidadoConvocatoria);

    void remove(RupEstadoFinancieroConsolidadoConvocatoria rupEstadoFinancieroConsolidadoConvocatoria);

    RupEstadoFinancieroConsolidadoConvocatoria find(Object id);

    List<RupEstadoFinancieroConsolidadoConvocatoria> findAll();

    List<RupEstadoFinancieroConsolidadoConvocatoria> findRange(int[] range);

    int count();
    
}
