/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ReservaCosto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ReservaCostoFacadeLocal {

    void create(ReservaCosto reservaCosto);

    void edit(ReservaCosto reservaCosto);

    void remove(ReservaCosto reservaCosto);

    ReservaCosto find(Object id);

    List<ReservaCosto> findAll();

    List<ReservaCosto> findRange(int[] range);

    int count();
    
}
