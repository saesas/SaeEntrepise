/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RazonSocial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RazonSocialFacadeLocal {

    void create(RazonSocial razonSocial);

    void edit(RazonSocial razonSocial);

    void remove(RazonSocial razonSocial);

    RazonSocial find(Object id);

    List<RazonSocial> findAll();

    List<RazonSocial> findRange(int[] range);

    int count();
    
}
