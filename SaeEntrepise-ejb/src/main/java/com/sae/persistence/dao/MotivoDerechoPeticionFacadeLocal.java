/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MotivoDerechoPeticion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MotivoDerechoPeticionFacadeLocal {

    void create(MotivoDerechoPeticion motivoDerechoPeticion);

    void edit(MotivoDerechoPeticion motivoDerechoPeticion);

    void remove(MotivoDerechoPeticion motivoDerechoPeticion);

    MotivoDerechoPeticion find(Object id);

    List<MotivoDerechoPeticion> findAll();

    List<MotivoDerechoPeticion> findRange(int[] range);

    int count();
    
}
