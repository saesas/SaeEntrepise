/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoAreaAfectadaNorma;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoAreaAfectadaNormaFacadeLocal {

    void create(TipoAreaAfectadaNorma tipoAreaAfectadaNorma);

    void edit(TipoAreaAfectadaNorma tipoAreaAfectadaNorma);

    void remove(TipoAreaAfectadaNorma tipoAreaAfectadaNorma);

    TipoAreaAfectadaNorma find(Object id);

    List<TipoAreaAfectadaNorma> findAll();

    List<TipoAreaAfectadaNorma> findRange(int[] range);

    int count();
    
}
