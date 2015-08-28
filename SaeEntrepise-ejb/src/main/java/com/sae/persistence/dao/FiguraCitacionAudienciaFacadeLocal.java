/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.FiguraCitacionAudiencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface FiguraCitacionAudienciaFacadeLocal {

    void create(FiguraCitacionAudiencia figuraCitacionAudiencia);

    void edit(FiguraCitacionAudiencia figuraCitacionAudiencia);

    void remove(FiguraCitacionAudiencia figuraCitacionAudiencia);

    FiguraCitacionAudiencia find(Object id);

    List<FiguraCitacionAudiencia> findAll();

    List<FiguraCitacionAudiencia> findRange(int[] range);

    int count();
    
}
