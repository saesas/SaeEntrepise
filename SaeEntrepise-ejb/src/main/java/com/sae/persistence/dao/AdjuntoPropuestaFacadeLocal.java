/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoPropuesta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoPropuestaFacadeLocal {

    void create(AdjuntoPropuesta adjuntoPropuesta);

    void edit(AdjuntoPropuesta adjuntoPropuesta);

    void remove(AdjuntoPropuesta adjuntoPropuesta);

    AdjuntoPropuesta find(Object id);

    List<AdjuntoPropuesta> findAll();

    List<AdjuntoPropuesta> findRange(int[] range);

    int count();
    
}
