/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoReintegro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoReintegroFacadeLocal {

    void create(TipoReintegro tipoReintegro);

    void edit(TipoReintegro tipoReintegro);

    void remove(TipoReintegro tipoReintegro);

    TipoReintegro find(Object id);

    List<TipoReintegro> findAll();

    List<TipoReintegro> findRange(int[] range);

    int count();
    
}
