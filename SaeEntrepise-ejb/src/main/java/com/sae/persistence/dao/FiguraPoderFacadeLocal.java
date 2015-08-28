/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraPoder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraPoderFacadeLocal {

    void create(FiguraPoder figuraPoder);

    void edit(FiguraPoder figuraPoder);

    void remove(FiguraPoder figuraPoder);

    FiguraPoder find(Object id);

    List<FiguraPoder> findAll();

    List<FiguraPoder> findRange(int[] range);

    int count();
    
}
