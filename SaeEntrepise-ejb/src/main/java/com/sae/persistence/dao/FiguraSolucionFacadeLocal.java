/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraSolucion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraSolucionFacadeLocal {

    void create(FiguraSolucion figuraSolucion);

    void edit(FiguraSolucion figuraSolucion);

    void remove(FiguraSolucion figuraSolucion);

    FiguraSolucion find(Object id);

    List<FiguraSolucion> findAll();

    List<FiguraSolucion> findRange(int[] range);

    int count();
    
}
