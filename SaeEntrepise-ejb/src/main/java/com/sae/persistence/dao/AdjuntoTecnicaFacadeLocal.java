/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoTecnica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoTecnicaFacadeLocal {

    void create(AdjuntoTecnica adjuntoTecnica);

    void edit(AdjuntoTecnica adjuntoTecnica);

    void remove(AdjuntoTecnica adjuntoTecnica);

    AdjuntoTecnica find(Object id);

    List<AdjuntoTecnica> findAll();

    List<AdjuntoTecnica> findRange(int[] range);

    int count();
    
}
