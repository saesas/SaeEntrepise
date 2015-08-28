/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Perfil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PerfilFacadeLocal {

    void create(Perfil perfil);

    void edit(Perfil perfil);

    void remove(Perfil perfil);

    Perfil find(Object id);

    List<Perfil> findAll();

    List<Perfil> findRange(int[] range);

    int count();
    
}
