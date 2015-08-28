/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FormaPagoConvocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FormaPagoConvocatoriaFacadeLocal {

    void create(FormaPagoConvocatoria formaPagoConvocatoria);

    void edit(FormaPagoConvocatoria formaPagoConvocatoria);

    void remove(FormaPagoConvocatoria formaPagoConvocatoria);

    FormaPagoConvocatoria find(Object id);

    List<FormaPagoConvocatoria> findAll();

    List<FormaPagoConvocatoria> findRange(int[] range);

    int count();
    
}
