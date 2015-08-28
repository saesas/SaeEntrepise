/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.JornadaLaboral;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface JornadaLaboralFacadeLocal {

    void create(JornadaLaboral jornadaLaboral);

    void edit(JornadaLaboral jornadaLaboral);

    void remove(JornadaLaboral jornadaLaboral);

    JornadaLaboral find(Object id);

    List<JornadaLaboral> findAll();

    List<JornadaLaboral> findRange(int[] range);

    int count();
    
}
