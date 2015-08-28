/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.InsumoFacturaCompra;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface InsumoFacturaCompraFacadeLocal {

    void create(InsumoFacturaCompra insumoFacturaCompra);

    void edit(InsumoFacturaCompra insumoFacturaCompra);

    void remove(InsumoFacturaCompra insumoFacturaCompra);

    InsumoFacturaCompra find(Object id);

    List<InsumoFacturaCompra> findAll();

    List<InsumoFacturaCompra> findRange(int[] range);

    int count();
    
}
