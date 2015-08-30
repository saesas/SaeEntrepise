/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.service;

import com.sae.persistence.domain.Convocatoria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SAE2
 */
@Local
public interface ConvocatoriaServiceLocal {
    
     public List<Convocatoria> getLlenarListConvocatoria(int idRazonSocial);
}
