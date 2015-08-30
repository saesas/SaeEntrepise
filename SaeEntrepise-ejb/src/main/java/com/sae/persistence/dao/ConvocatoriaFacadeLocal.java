/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sae.persistence.dao;

import com.sae.persistence.domain.Convocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ConvocatoriaFacadeLocal {

    void create(Convocatoria convocatoria);

    void edit(Convocatoria convocatoria);

    void remove(Convocatoria convocatoria);

    Convocatoria find(Object id);

    List<Convocatoria> findAll();

    List<Convocatoria> findRange(int[] range);

    int count();

    List<Convocatoria> getListConvocatoriaByRazonSocialBd(int idRazonSocial);

}
