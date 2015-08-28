/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.RepresentateLegalRazonSocial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface RepresentateLegalRazonSocialFacadeLocal {

    void create(RepresentateLegalRazonSocial representateLegalRazonSocial);

    void edit(RepresentateLegalRazonSocial representateLegalRazonSocial);

    void remove(RepresentateLegalRazonSocial representateLegalRazonSocial);

    RepresentateLegalRazonSocial find(Object id);

    List<RepresentateLegalRazonSocial> findAll();

    List<RepresentateLegalRazonSocial> findRange(int[] range);

    int count();
    
}
