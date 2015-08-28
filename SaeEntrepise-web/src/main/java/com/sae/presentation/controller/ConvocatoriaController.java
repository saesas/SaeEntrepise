/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.presentation.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.sae.persistence.dao.ConvocatoriaFacade;
import com.sae.persistence.dao.ConvocatoriaFacadeLocal;
import com.sae.persistence.domain.Convocatoria;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hector Ivan
 */
@ManagedBean
@ViewScoped
public class ConvocatoriaController {
    @EJB
    private ConvocatoriaFacadeLocal convocatoriaFacade;

     private Convocatoria convocatoria;
    private List< Convocatoria > convocatorias;

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public List<Convocatoria> getConvocatorias() {
        return convocatorias;
    }

    public void setConvocatorias(List<Convocatoria> convocatorias) {
        this.convocatorias = convocatorias;
    }

    
    @PostConstruct
    public void init() {
        convocatoria = new Convocatoria();
    }
     
    public void listar() {
        convocatorias = convocatoriaFacade.findAll();
    }
     
    public void agregar() {
        convocatoriaFacade.create(convocatoria);
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro agregado.",  "Se añadió la unidad en " + new Date());  
        FacesContext.getCurrentInstance().addMessage(null, message);
        convocatoria = new Convocatoria();
        listar();
    }
    
}
