/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sae.persistence.dao;

import com.sae.persistence.domain.Convocatoria;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Hector Ivan
 */
@Stateless
public class ConvocatoriaFacade extends AbstractFacade<Convocatoria> implements ConvocatoriaFacadeLocal {

    @PersistenceContext(unitName = "com.sae_SaeEntrepise-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConvocatoriaFacade() {
        super(Convocatoria.class);
    }

    @Override
    public List<Convocatoria> getListConvocatoriaByRazonSocialBd(int idRazonSocial) {
        String jpql = "select con.* "
                + "from "
                + "Convocatoria con "
                + "inner join con.estadoConvocatoriaList estcon "
                + "where  estcon.fecha = (select max(estconb.fecha) "
                + "                from con.estadoConvocatoriaList estconb "
                + "                where estconb.idConvocatoria=estcon.idConvocatoria) and con.estado=true  and con.idRazonSocial= :idRazonSocial";
        Query query = em.createQuery(jpql).setParameter("idRazonSocial", idRazonSocial);
        return query.getResultList();
    }
}
