/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SobrePropuesta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SobrePropuestaFacadeLocal {

    void create(SobrePropuesta sobrePropuesta);

    void edit(SobrePropuesta sobrePropuesta);

    void remove(SobrePropuesta sobrePropuesta);

    SobrePropuesta find(Object id);

    List<SobrePropuesta> findAll();

    List<SobrePropuesta> findRange(int[] range);

    int count();
    
}
