/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.EstadoAudiencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface EstadoAudienciaFacadeLocal {

    void create(EstadoAudiencia estadoAudiencia);

    void edit(EstadoAudiencia estadoAudiencia);

    void remove(EstadoAudiencia estadoAudiencia);

    EstadoAudiencia find(Object id);

    List<EstadoAudiencia> findAll();

    List<EstadoAudiencia> findRange(int[] range);

    int count();
    
}
