/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ParametroContableTipoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ParametroContableTipoProyectoFacadeLocal {

    void create(ParametroContableTipoProyecto parametroContableTipoProyecto);

    void edit(ParametroContableTipoProyecto parametroContableTipoProyecto);

    void remove(ParametroContableTipoProyecto parametroContableTipoProyecto);

    ParametroContableTipoProyecto find(Object id);

    List<ParametroContableTipoProyecto> findAll();

    List<ParametroContableTipoProyecto> findRange(int[] range);

    int count();
    
}
