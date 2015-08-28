/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TerceroRazonSocial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TerceroRazonSocialFacadeLocal {

    void create(TerceroRazonSocial terceroRazonSocial);

    void edit(TerceroRazonSocial terceroRazonSocial);

    void remove(TerceroRazonSocial terceroRazonSocial);

    TerceroRazonSocial find(Object id);

    List<TerceroRazonSocial> findAll();

    List<TerceroRazonSocial> findRange(int[] range);

    int count();
    
}
