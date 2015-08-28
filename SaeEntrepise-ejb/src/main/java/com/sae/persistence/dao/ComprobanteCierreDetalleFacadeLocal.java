/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ComprobanteCierreDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ComprobanteCierreDetalleFacadeLocal {

    void create(ComprobanteCierreDetalle comprobanteCierreDetalle);

    void edit(ComprobanteCierreDetalle comprobanteCierreDetalle);

    void remove(ComprobanteCierreDetalle comprobanteCierreDetalle);

    ComprobanteCierreDetalle find(Object id);

    List<ComprobanteCierreDetalle> findAll();

    List<ComprobanteCierreDetalle> findRange(int[] range);

    int count();
    
}
