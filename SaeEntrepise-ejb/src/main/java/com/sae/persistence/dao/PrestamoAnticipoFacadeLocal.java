/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PrestamoAnticipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PrestamoAnticipoFacadeLocal {

    void create(PrestamoAnticipo prestamoAnticipo);

    void edit(PrestamoAnticipo prestamoAnticipo);

    void remove(PrestamoAnticipo prestamoAnticipo);

    PrestamoAnticipo find(Object id);

    List<PrestamoAnticipo> findAll();

    List<PrestamoAnticipo> findRange(int[] range);

    int count();
    
}
