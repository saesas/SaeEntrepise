/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CopiaComunicado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CopiaComunicadoFacadeLocal {

    void create(CopiaComunicado copiaComunicado);

    void edit(CopiaComunicado copiaComunicado);

    void remove(CopiaComunicado copiaComunicado);

    CopiaComunicado find(Object id);

    List<CopiaComunicado> findAll();

    List<CopiaComunicado> findRange(int[] range);

    int count();
    
}
