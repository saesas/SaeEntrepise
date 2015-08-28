/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ProcesoComprobante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ProcesoComprobanteFacadeLocal {

    void create(ProcesoComprobante procesoComprobante);

    void edit(ProcesoComprobante procesoComprobante);

    void remove(ProcesoComprobante procesoComprobante);

    ProcesoComprobante find(Object id);

    List<ProcesoComprobante> findAll();

    List<ProcesoComprobante> findRange(int[] range);

    int count();
    
}
