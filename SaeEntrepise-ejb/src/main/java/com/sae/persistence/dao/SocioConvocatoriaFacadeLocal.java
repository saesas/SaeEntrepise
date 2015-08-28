/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SocioConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SocioConvocatoriaFacadeLocal {

    void create(SocioConvocatoria socioConvocatoria);

    void edit(SocioConvocatoria socioConvocatoria);

    void remove(SocioConvocatoria socioConvocatoria);

    SocioConvocatoria find(Object id);

    List<SocioConvocatoria> findAll();

    List<SocioConvocatoria> findRange(int[] range);

    int count();
    
}
