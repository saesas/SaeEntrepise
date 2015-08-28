/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MedioEnvioComunicado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MedioEnvioComunicadoFacadeLocal {

    void create(MedioEnvioComunicado medioEnvioComunicado);

    void edit(MedioEnvioComunicado medioEnvioComunicado);

    void remove(MedioEnvioComunicado medioEnvioComunicado);

    MedioEnvioComunicado find(Object id);

    List<MedioEnvioComunicado> findAll();

    List<MedioEnvioComunicado> findRange(int[] range);

    int count();
    
}
