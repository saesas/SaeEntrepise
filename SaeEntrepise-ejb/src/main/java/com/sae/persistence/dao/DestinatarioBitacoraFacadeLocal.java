/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.DestinatarioBitacora;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface DestinatarioBitacoraFacadeLocal {

    void create(DestinatarioBitacora destinatarioBitacora);

    void edit(DestinatarioBitacora destinatarioBitacora);

    void remove(DestinatarioBitacora destinatarioBitacora);

    DestinatarioBitacora find(Object id);

    List<DestinatarioBitacora> findAll();

    List<DestinatarioBitacora> findRange(int[] range);

    int count();
    
}
