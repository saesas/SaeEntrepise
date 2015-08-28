/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoAnticipoReintegro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoAnticipoReintegroFacadeLocal {

    void create(PagoAnticipoReintegro pagoAnticipoReintegro);

    void edit(PagoAnticipoReintegro pagoAnticipoReintegro);

    void remove(PagoAnticipoReintegro pagoAnticipoReintegro);

    PagoAnticipoReintegro find(Object id);

    List<PagoAnticipoReintegro> findAll();

    List<PagoAnticipoReintegro> findRange(int[] range);

    int count();
    
}
