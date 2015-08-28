/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ParametroContableProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ParametroContableProyectoFacadeLocal {

    void create(ParametroContableProyecto parametroContableProyecto);

    void edit(ParametroContableProyecto parametroContableProyecto);

    void remove(ParametroContableProyecto parametroContableProyecto);

    ParametroContableProyecto find(Object id);

    List<ParametroContableProyecto> findAll();

    List<ParametroContableProyecto> findRange(int[] range);

    int count();
    
}
