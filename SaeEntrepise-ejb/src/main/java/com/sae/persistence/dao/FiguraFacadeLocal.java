/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Figura;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraFacadeLocal {

    void create(Figura figura);

    void edit(Figura figura);

    void remove(Figura figura);

    Figura find(Object id);

    List<Figura> findAll();

    List<Figura> findRange(int[] range);

    int count();
    
}
