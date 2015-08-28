/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PucServicioPublico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PucServicioPublicoFacadeLocal {

    void create(PucServicioPublico pucServicioPublico);

    void edit(PucServicioPublico pucServicioPublico);

    void remove(PucServicioPublico pucServicioPublico);

    PucServicioPublico find(Object id);

    List<PucServicioPublico> findAll();

    List<PucServicioPublico> findRange(int[] range);

    int count();
    
}
