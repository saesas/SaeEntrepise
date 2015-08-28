/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ItemContrato;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ItemContratoFacadeLocal {

    void create(ItemContrato itemContrato);

    void edit(ItemContrato itemContrato);

    void remove(ItemContrato itemContrato);

    ItemContrato find(Object id);

    List<ItemContrato> findAll();

    List<ItemContrato> findRange(int[] range);

    int count();
    
}
