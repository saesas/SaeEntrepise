/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SucursalRazonSocialTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SucursalRazonSocialTerceroFacadeLocal {

    void create(SucursalRazonSocialTercero sucursalRazonSocialTercero);

    void edit(SucursalRazonSocialTercero sucursalRazonSocialTercero);

    void remove(SucursalRazonSocialTercero sucursalRazonSocialTercero);

    SucursalRazonSocialTercero find(Object id);

    List<SucursalRazonSocialTercero> findAll();

    List<SucursalRazonSocialTercero> findRange(int[] range);

    int count();
    
}
