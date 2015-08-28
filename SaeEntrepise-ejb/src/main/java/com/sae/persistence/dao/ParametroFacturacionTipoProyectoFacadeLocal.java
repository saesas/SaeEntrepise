/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ParametroFacturacionTipoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ParametroFacturacionTipoProyectoFacadeLocal {

    void create(ParametroFacturacionTipoProyecto parametroFacturacionTipoProyecto);

    void edit(ParametroFacturacionTipoProyecto parametroFacturacionTipoProyecto);

    void remove(ParametroFacturacionTipoProyecto parametroFacturacionTipoProyecto);

    ParametroFacturacionTipoProyecto find(Object id);

    List<ParametroFacturacionTipoProyecto> findAll();

    List<ParametroFacturacionTipoProyecto> findRange(int[] range);

    int count();
    
}
