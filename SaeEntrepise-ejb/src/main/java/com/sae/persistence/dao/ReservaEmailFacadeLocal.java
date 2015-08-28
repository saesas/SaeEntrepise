/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ReservaEmail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ReservaEmailFacadeLocal {

    void create(ReservaEmail reservaEmail);

    void edit(ReservaEmail reservaEmail);

    void remove(ReservaEmail reservaEmail);

    ReservaEmail find(Object id);

    List<ReservaEmail> findAll();

    List<ReservaEmail> findRange(int[] range);

    int count();
    
}
