/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ContactoFiguraTercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ContactoFiguraTerceroFacadeLocal {

    void create(ContactoFiguraTercero contactoFiguraTercero);

    void edit(ContactoFiguraTercero contactoFiguraTercero);

    void remove(ContactoFiguraTercero contactoFiguraTercero);

    ContactoFiguraTercero find(Object id);

    List<ContactoFiguraTercero> findAll();

    List<ContactoFiguraTercero> findRange(int[] range);

    int count();
    
}
