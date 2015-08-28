/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CuentaRetencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CuentaRetencionFacadeLocal {

    void create(CuentaRetencion cuentaRetencion);

    void edit(CuentaRetencion cuentaRetencion);

    void remove(CuentaRetencion cuentaRetencion);

    CuentaRetencion find(Object id);

    List<CuentaRetencion> findAll();

    List<CuentaRetencion> findRange(int[] range);

    int count();
    
}
