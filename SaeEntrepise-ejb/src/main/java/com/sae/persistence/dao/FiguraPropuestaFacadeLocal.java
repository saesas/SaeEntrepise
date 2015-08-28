/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraPropuesta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraPropuestaFacadeLocal {

    void create(FiguraPropuesta figuraPropuesta);

    void edit(FiguraPropuesta figuraPropuesta);

    void remove(FiguraPropuesta figuraPropuesta);

    FiguraPropuesta find(Object id);

    List<FiguraPropuesta> findAll();

    List<FiguraPropuesta> findRange(int[] range);

    int count();
    
}
