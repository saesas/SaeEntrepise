/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoFinanciero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoFinancieroFacadeLocal {

    void create(EstadoFinanciero estadoFinanciero);

    void edit(EstadoFinanciero estadoFinanciero);

    void remove(EstadoFinanciero estadoFinanciero);

    EstadoFinanciero find(Object id);

    List<EstadoFinanciero> findAll();

    List<EstadoFinanciero> findRange(int[] range);

    int count();
    
}
