/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PagoSoi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PagoSoiFacadeLocal {

    void create(PagoSoi pagoSoi);

    void edit(PagoSoi pagoSoi);

    void remove(PagoSoi pagoSoi);

    PagoSoi find(Object id);

    List<PagoSoi> findAll();

    List<PagoSoi> findRange(int[] range);

    int count();
    
}
