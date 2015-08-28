/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.NivelComunicado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface NivelComunicadoFacadeLocal {

    void create(NivelComunicado nivelComunicado);

    void edit(NivelComunicado nivelComunicado);

    void remove(NivelComunicado nivelComunicado);

    NivelComunicado find(Object id);

    List<NivelComunicado> findAll();

    List<NivelComunicado> findRange(int[] range);

    int count();
    
}
