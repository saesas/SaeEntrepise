/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.GrupoServicios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface GrupoServiciosFacadeLocal {

    void create(GrupoServicios grupoServicios);

    void edit(GrupoServicios grupoServicios);

    void remove(GrupoServicios grupoServicios);

    GrupoServicios find(Object id);

    List<GrupoServicios> findAll();

    List<GrupoServicios> findRange(int[] range);

    int count();
    
}
