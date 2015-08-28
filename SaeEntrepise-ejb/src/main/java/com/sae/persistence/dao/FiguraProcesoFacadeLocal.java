/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraProcesoFacadeLocal {

    void create(FiguraProceso figuraProceso);

    void edit(FiguraProceso figuraProceso);

    void remove(FiguraProceso figuraProceso);

    FiguraProceso find(Object id);

    List<FiguraProceso> findAll();

    List<FiguraProceso> findRange(int[] range);

    int count();
    
}
