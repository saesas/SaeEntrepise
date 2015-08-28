/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.InformacionSobrePropuesta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface InformacionSobrePropuestaFacadeLocal {

    void create(InformacionSobrePropuesta informacionSobrePropuesta);

    void edit(InformacionSobrePropuesta informacionSobrePropuesta);

    void remove(InformacionSobrePropuesta informacionSobrePropuesta);

    InformacionSobrePropuesta find(Object id);

    List<InformacionSobrePropuesta> findAll();

    List<InformacionSobrePropuesta> findRange(int[] range);

    int count();
    
}
