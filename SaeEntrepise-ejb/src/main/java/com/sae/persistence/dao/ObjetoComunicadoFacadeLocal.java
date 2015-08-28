/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ObjetoComunicado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ObjetoComunicadoFacadeLocal {

    void create(ObjetoComunicado objetoComunicado);

    void edit(ObjetoComunicado objetoComunicado);

    void remove(ObjetoComunicado objetoComunicado);

    ObjetoComunicado find(Object id);

    List<ObjetoComunicado> findAll();

    List<ObjetoComunicado> findRange(int[] range);

    int count();
    
}
