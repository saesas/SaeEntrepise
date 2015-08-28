/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ListaPrecio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ListaPrecioFacadeLocal {

    void create(ListaPrecio listaPrecio);

    void edit(ListaPrecio listaPrecio);

    void remove(ListaPrecio listaPrecio);

    ListaPrecio find(Object id);

    List<ListaPrecio> findAll();

    List<ListaPrecio> findRange(int[] range);

    int count();
    
}
