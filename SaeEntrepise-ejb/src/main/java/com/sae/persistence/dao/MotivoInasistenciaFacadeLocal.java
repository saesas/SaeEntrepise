/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MotivoInasistencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MotivoInasistenciaFacadeLocal {

    void create(MotivoInasistencia motivoInasistencia);

    void edit(MotivoInasistencia motivoInasistencia);

    void remove(MotivoInasistencia motivoInasistencia);

    MotivoInasistencia find(Object id);

    List<MotivoInasistencia> findAll();

    List<MotivoInasistencia> findRange(int[] range);

    int count();
    
}
