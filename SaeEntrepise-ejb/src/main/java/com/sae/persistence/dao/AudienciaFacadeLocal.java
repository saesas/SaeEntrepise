/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Audiencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AudienciaFacadeLocal {

    void create(Audiencia audiencia);

    void edit(Audiencia audiencia);

    void remove(Audiencia audiencia);

    Audiencia find(Object id);

    List<Audiencia> findAll();

    List<Audiencia> findRange(int[] range);

    int count();
    
}
