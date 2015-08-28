/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ValorRetencion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ValorRetencionFacadeLocal {

    void create(ValorRetencion valorRetencion);

    void edit(ValorRetencion valorRetencion);

    void remove(ValorRetencion valorRetencion);

    ValorRetencion find(Object id);

    List<ValorRetencion> findAll();

    List<ValorRetencion> findRange(int[] range);

    int count();
    
}
