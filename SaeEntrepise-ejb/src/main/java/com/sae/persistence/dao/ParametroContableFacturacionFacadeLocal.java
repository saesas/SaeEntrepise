/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ParametroContableFacturacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ParametroContableFacturacionFacadeLocal {

    void create(ParametroContableFacturacion parametroContableFacturacion);

    void edit(ParametroContableFacturacion parametroContableFacturacion);

    void remove(ParametroContableFacturacion parametroContableFacturacion);

    ParametroContableFacturacion find(Object id);

    List<ParametroContableFacturacion> findAll();

    List<ParametroContableFacturacion> findRange(int[] range);

    int count();
    
}
