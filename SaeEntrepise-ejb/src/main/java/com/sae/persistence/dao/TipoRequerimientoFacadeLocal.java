/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TipoRequerimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TipoRequerimientoFacadeLocal {

    void create(TipoRequerimiento tipoRequerimiento);

    void edit(TipoRequerimiento tipoRequerimiento);

    void remove(TipoRequerimiento tipoRequerimiento);

    TipoRequerimiento find(Object id);

    List<TipoRequerimiento> findAll();

    List<TipoRequerimiento> findRange(int[] range);

    int count();
    
}
