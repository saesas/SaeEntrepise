/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AlcanceProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AlcanceProyectoFacadeLocal {

    void create(AlcanceProyecto alcanceProyecto);

    void edit(AlcanceProyecto alcanceProyecto);

    void remove(AlcanceProyecto alcanceProyecto);

    AlcanceProyecto find(Object id);

    List<AlcanceProyecto> findAll();

    List<AlcanceProyecto> findRange(int[] range);

    int count();
    
}
