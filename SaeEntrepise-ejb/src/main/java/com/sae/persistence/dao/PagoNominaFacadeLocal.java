/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoNominaFacadeLocal {

    void create(PagoNomina pagoNomina);

    void edit(PagoNomina pagoNomina);

    void remove(PagoNomina pagoNomina);

    PagoNomina find(Object id);

    List<PagoNomina> findAll();

    List<PagoNomina> findRange(int[] range);

    int count();
    
}
