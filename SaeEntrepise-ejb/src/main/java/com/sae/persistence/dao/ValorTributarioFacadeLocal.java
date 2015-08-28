/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ValorTributario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ValorTributarioFacadeLocal {

    void create(ValorTributario valorTributario);

    void edit(ValorTributario valorTributario);

    void remove(ValorTributario valorTributario);

    ValorTributario find(Object id);

    List<ValorTributario> findAll();

    List<ValorTributario> findRange(int[] range);

    int count();
    
}
