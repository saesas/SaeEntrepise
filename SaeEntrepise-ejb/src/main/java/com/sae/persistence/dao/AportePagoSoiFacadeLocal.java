/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AportePagoSoi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AportePagoSoiFacadeLocal {

    void create(AportePagoSoi aportePagoSoi);

    void edit(AportePagoSoi aportePagoSoi);

    void remove(AportePagoSoi aportePagoSoi);

    AportePagoSoi find(Object id);

    List<AportePagoSoi> findAll();

    List<AportePagoSoi> findRange(int[] range);

    int count();
    
}
