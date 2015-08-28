/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RupEstadoFinancieroSocioConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RupEstadoFinancieroSocioConvocatoriaFacadeLocal {

    void create(RupEstadoFinancieroSocioConvocatoria rupEstadoFinancieroSocioConvocatoria);

    void edit(RupEstadoFinancieroSocioConvocatoria rupEstadoFinancieroSocioConvocatoria);

    void remove(RupEstadoFinancieroSocioConvocatoria rupEstadoFinancieroSocioConvocatoria);

    RupEstadoFinancieroSocioConvocatoria find(Object id);

    List<RupEstadoFinancieroSocioConvocatoria> findAll();

    List<RupEstadoFinancieroSocioConvocatoria> findRange(int[] range);

    int count();
    
}
