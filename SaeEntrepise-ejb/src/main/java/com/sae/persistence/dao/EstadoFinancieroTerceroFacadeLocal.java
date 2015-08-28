/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoFinancieroTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoFinancieroTerceroFacadeLocal {

    void create(EstadoFinancieroTercero estadoFinancieroTercero);

    void edit(EstadoFinancieroTercero estadoFinancieroTercero);

    void remove(EstadoFinancieroTercero estadoFinancieroTercero);

    EstadoFinancieroTercero find(Object id);

    List<EstadoFinancieroTercero> findAll();

    List<EstadoFinancieroTercero> findRange(int[] range);

    int count();
    
}
