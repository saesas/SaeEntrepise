/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SeguimientoNormatividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SeguimientoNormatividadFacadeLocal {

    void create(SeguimientoNormatividad seguimientoNormatividad);

    void edit(SeguimientoNormatividad seguimientoNormatividad);

    void remove(SeguimientoNormatividad seguimientoNormatividad);

    SeguimientoNormatividad find(Object id);

    List<SeguimientoNormatividad> findAll();

    List<SeguimientoNormatividad> findRange(int[] range);

    int count();
    
}
