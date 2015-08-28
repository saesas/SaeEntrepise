/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.HojaVida;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface HojaVidaFacadeLocal {

    void create(HojaVida hojaVida);

    void edit(HojaVida hojaVida);

    void remove(HojaVida hojaVida);

    HojaVida find(Object id);

    List<HojaVida> findAll();

    List<HojaVida> findRange(int[] range);

    int count();
    
}
