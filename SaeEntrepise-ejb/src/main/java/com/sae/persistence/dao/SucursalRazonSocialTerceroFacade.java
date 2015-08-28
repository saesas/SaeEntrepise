/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SucursalRazonSocialTercero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hector Ivan
 */
@Stateless
public class SucursalRazonSocialTerceroFacade extends AbstractFacade<SucursalRazonSocialTercero> implements SucursalRazonSocialTerceroFacadeLocal {
    @PersistenceContext(unitName = "com.sae_SaeEntrepise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SucursalRazonSocialTerceroFacade() {
        super(SucursalRazonSocialTercero.class);
    }
    
}
