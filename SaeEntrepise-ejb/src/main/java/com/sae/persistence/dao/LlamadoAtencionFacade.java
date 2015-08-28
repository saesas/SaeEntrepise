/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.LlamadoAtencion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hector Ivan
 */
@Stateless
public class LlamadoAtencionFacade extends AbstractFacade<LlamadoAtencion> implements LlamadoAtencionFacadeLocal {
    @PersistenceContext(unitName = "com.sae_SaeEntrepise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LlamadoAtencionFacade() {
        super(LlamadoAtencion.class);
    }
    
}
