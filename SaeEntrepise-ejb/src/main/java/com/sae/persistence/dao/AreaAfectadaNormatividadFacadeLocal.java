/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AreaAfectadaNormatividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AreaAfectadaNormatividadFacadeLocal {

    void create(AreaAfectadaNormatividad areaAfectadaNormatividad);

    void edit(AreaAfectadaNormatividad areaAfectadaNormatividad);

    void remove(AreaAfectadaNormatividad areaAfectadaNormatividad);

    AreaAfectadaNormatividad find(Object id);

    List<AreaAfectadaNormatividad> findAll();

    List<AreaAfectadaNormatividad> findRange(int[] range);

    int count();
    
}
