/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FuncionCargo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FuncionCargoFacadeLocal {

    void create(FuncionCargo funcionCargo);

    void edit(FuncionCargo funcionCargo);

    void remove(FuncionCargo funcionCargo);

    FuncionCargo find(Object id);

    List<FuncionCargo> findAll();

    List<FuncionCargo> findRange(int[] range);

    int count();
    
}
