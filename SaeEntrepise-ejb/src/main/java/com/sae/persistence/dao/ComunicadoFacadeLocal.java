/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Comunicado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ComunicadoFacadeLocal {

    void create(Comunicado comunicado);

    void edit(Comunicado comunicado);

    void remove(Comunicado comunicado);

    Comunicado find(Object id);

    List<Comunicado> findAll();

    List<Comunicado> findRange(int[] range);

    int count();
    
}
