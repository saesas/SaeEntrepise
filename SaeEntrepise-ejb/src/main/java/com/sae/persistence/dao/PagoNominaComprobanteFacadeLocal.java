/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoNominaComprobante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoNominaComprobanteFacadeLocal {

    void create(PagoNominaComprobante pagoNominaComprobante);

    void edit(PagoNominaComprobante pagoNominaComprobante);

    void remove(PagoNominaComprobante pagoNominaComprobante);

    PagoNominaComprobante find(Object id);

    List<PagoNominaComprobante> findAll();

    List<PagoNominaComprobante> findRange(int[] range);

    int count();
    
}
