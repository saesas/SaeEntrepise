/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Afiliacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AfiliacionFacadeLocal {

    void create(Afiliacion afiliacion);

    void edit(Afiliacion afiliacion);

    void remove(Afiliacion afiliacion);

    Afiliacion find(Object id);

    List<Afiliacion> findAll();

    List<Afiliacion> findRange(int[] range);

    int count();
    
}
