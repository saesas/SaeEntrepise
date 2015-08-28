/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraDerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraDerechoPeticionFacadeLocal {

    void create(FiguraDerechoPeticion figuraDerechoPeticion);

    void edit(FiguraDerechoPeticion figuraDerechoPeticion);

    void remove(FiguraDerechoPeticion figuraDerechoPeticion);

    FiguraDerechoPeticion find(Object id);

    List<FiguraDerechoPeticion> findAll();

    List<FiguraDerechoPeticion> findRange(int[] range);

    int count();
    
}
