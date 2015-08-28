/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.CitacionAudiencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface CitacionAudienciaFacadeLocal {

    void create(CitacionAudiencia citacionAudiencia);

    void edit(CitacionAudiencia citacionAudiencia);

    void remove(CitacionAudiencia citacionAudiencia);

    CitacionAudiencia find(Object id);

    List<CitacionAudiencia> findAll();

    List<CitacionAudiencia> findRange(int[] range);

    int count();
    
}
