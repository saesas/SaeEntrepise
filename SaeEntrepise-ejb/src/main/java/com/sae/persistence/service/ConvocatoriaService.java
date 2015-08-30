/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sae.persistence.service;

import com.sae.persistence.dao.ConvocatoriaFacadeLocal;
import com.sae.persistence.domain.Convocatoria;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author SAE2
 */
@Stateless
public class ConvocatoriaService implements ConvocatoriaServiceLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private ConvocatoriaFacadeLocal convocatoriaFacade;

    @Override
    public List<Convocatoria> getLlenarListConvocatoria(int idRazonSocial) {
        List<Convocatoria> convocatorias = convocatoriaFacade.getListConvocatoriaByRazonSocialBd(idRazonSocial);
        if (!convocatorias.isEmpty()) {
            return convocatorias;
        } else {
            return null;
        }
    }
}
