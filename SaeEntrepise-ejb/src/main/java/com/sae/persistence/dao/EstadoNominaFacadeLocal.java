/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoNominaFacadeLocal {

    void create(EstadoNomina estadoNomina);

    void edit(EstadoNomina estadoNomina);

    void remove(EstadoNomina estadoNomina);

    EstadoNomina find(Object id);

    List<EstadoNomina> findAll();

    List<EstadoNomina> findRange(int[] range);

    int count();
    
}
