/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContactoTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContactoTerceroFacadeLocal {

    void create(ContactoTercero contactoTercero);

    void edit(ContactoTercero contactoTercero);

    void remove(ContactoTercero contactoTercero);

    ContactoTercero find(Object id);

    List<ContactoTercero> findAll();

    List<ContactoTercero> findRange(int[] range);

    int count();
    
}
