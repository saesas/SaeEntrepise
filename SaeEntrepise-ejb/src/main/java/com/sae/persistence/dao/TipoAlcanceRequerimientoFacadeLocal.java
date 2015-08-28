/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoAlcanceRequerimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoAlcanceRequerimientoFacadeLocal {

    void create(TipoAlcanceRequerimiento tipoAlcanceRequerimiento);

    void edit(TipoAlcanceRequerimiento tipoAlcanceRequerimiento);

    void remove(TipoAlcanceRequerimiento tipoAlcanceRequerimiento);

    TipoAlcanceRequerimiento find(Object id);

    List<TipoAlcanceRequerimiento> findAll();

    List<TipoAlcanceRequerimiento> findRange(int[] range);

    int count();
    
}
