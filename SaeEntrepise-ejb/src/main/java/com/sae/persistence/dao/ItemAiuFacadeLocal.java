/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ItemAiu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ItemAiuFacadeLocal {

    void create(ItemAiu itemAiu);

    void edit(ItemAiu itemAiu);

    void remove(ItemAiu itemAiu);

    ItemAiu find(Object id);

    List<ItemAiu> findAll();

    List<ItemAiu> findRange(int[] range);

    int count();
    
}
