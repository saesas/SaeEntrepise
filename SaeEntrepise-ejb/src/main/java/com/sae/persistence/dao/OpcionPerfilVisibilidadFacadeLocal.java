/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.OpcionPerfilVisibilidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface OpcionPerfilVisibilidadFacadeLocal {

    void create(OpcionPerfilVisibilidad opcionPerfilVisibilidad);

    void edit(OpcionPerfilVisibilidad opcionPerfilVisibilidad);

    void remove(OpcionPerfilVisibilidad opcionPerfilVisibilidad);

    OpcionPerfilVisibilidad find(Object id);

    List<OpcionPerfilVisibilidad> findAll();

    List<OpcionPerfilVisibilidad> findRange(int[] range);

    int count();
    
}
