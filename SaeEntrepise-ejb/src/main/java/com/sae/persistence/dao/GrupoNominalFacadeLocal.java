/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.GrupoNominal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface GrupoNominalFacadeLocal {

    void create(GrupoNominal grupoNominal);

    void edit(GrupoNominal grupoNominal);

    void remove(GrupoNominal grupoNominal);

    GrupoNominal find(Object id);

    List<GrupoNominal> findAll();

    List<GrupoNominal> findRange(int[] range);

    int count();
    
}
