/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RequerimentoInsumo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RequerimentoInsumoFacadeLocal {

    void create(RequerimentoInsumo requerimentoInsumo);

    void edit(RequerimentoInsumo requerimentoInsumo);

    void remove(RequerimentoInsumo requerimentoInsumo);

    RequerimentoInsumo find(Object id);

    List<RequerimentoInsumo> findAll();

    List<RequerimentoInsumo> findRange(int[] range);

    int count();
    
}
