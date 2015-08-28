/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ValorPagarNomina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ValorPagarNominaFacadeLocal {

    void create(ValorPagarNomina valorPagarNomina);

    void edit(ValorPagarNomina valorPagarNomina);

    void remove(ValorPagarNomina valorPagarNomina);

    ValorPagarNomina find(Object id);

    List<ValorPagarNomina> findAll();

    List<ValorPagarNomina> findRange(int[] range);

    int count();
    
}
