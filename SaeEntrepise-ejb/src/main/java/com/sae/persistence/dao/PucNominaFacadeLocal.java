/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.PucNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PucNominaFacadeLocal {

    void create(PucNomina pucNomina);

    void edit(PucNomina pucNomina);

    void remove(PucNomina pucNomina);

    PucNomina find(Object id);

    List<PucNomina> findAll();

    List<PucNomina> findRange(int[] range);

    int count();
    
}
