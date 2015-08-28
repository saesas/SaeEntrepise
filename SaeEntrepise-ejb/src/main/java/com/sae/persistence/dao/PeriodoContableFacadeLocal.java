/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PeriodoContable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PeriodoContableFacadeLocal {

    void create(PeriodoContable periodoContable);

    void edit(PeriodoContable periodoContable);

    void remove(PeriodoContable periodoContable);

    PeriodoContable find(Object id);

    List<PeriodoContable> findAll();

    List<PeriodoContable> findRange(int[] range);

    int count();
    
}
