/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoContratoProyecto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoContratoProyectoFacadeLocal {

    void create(TipoContratoProyecto tipoContratoProyecto);

    void edit(TipoContratoProyecto tipoContratoProyecto);

    void remove(TipoContratoProyecto tipoContratoProyecto);

    TipoContratoProyecto find(Object id);

    List<TipoContratoProyecto> findAll();

    List<TipoContratoProyecto> findRange(int[] range);

    int count();
    
}
