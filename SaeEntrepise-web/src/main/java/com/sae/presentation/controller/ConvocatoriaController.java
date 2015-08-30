/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sae.presentation.controller;

import com.sae.persistence.domain.Convocatoria;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.sae.persistence.service.ConvocatoriaServiceLocal;
import com.sae.presentation.model.ConvocatoriaModel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 *
 * @author SAE2
 */
@ManagedBean
@ViewScoped
public class ConvocatoriaController {

    /**
     * Creates a new instance of ConvocatoriaController
     */
    public ConvocatoriaController() {
    }

    @EJB
    ConvocatoriaServiceLocal convocatoriaService;

    private ConvocatoriaModel convocatoriaModel;

    private List<ConvocatoriaModel> convocatorias;
   
    private List<ConvocatoriaModel> convocatoriasFiltro;

    @PostConstruct
    public void init() {
        setConvocatoriaModel(new ConvocatoriaModel());
        setConvocatorias(new ArrayList<ConvocatoriaModel>());
    }

    public void mtdLlenarListConvocatorias() {
        List<Convocatoria> convocatoriasAux = convocatoriaService.getLlenarListConvocatoria(1);
        mtdConversionConvocatoria(convocatoriasAux);
    }

    public void mtdConversionConvocatoria(List<Convocatoria> convocatoriasAux) {
        for (int i = 0; i < convocatoriasAux.size(); i++) {
            Convocatoria convocatoriaAux = convocatoriasAux.get(i);
            this.getConvocatorias().add(new ConvocatoriaModel(convocatoriaAux.getId(), convocatoriaAux.getCodigo(), convocatoriaAux.getEntidadContratante(), "Enitdad Contratante", convocatoriaAux.getIdTipoProceso().getId(), convocatoriaAux.getIdTipoProceso().getNombre(), convocatoriaAux.getUrl(), convocatoriaAux.getEstadoConvocatoriaList().get(0).getIdEstadoConvocatoria().getId(), convocatoriaAux.getEstadoConvocatoriaList().get(0).getIdEstadoConvocatoria().getNombre(),convocatoriaAux.getFechaRegistro()));
        }
    }

    /**
     * @return the convocatorias
     */
    public List<ConvocatoriaModel> getConvocatorias() {
        return convocatorias;
    }

    /**
     * @param convocatorias the convocatorias to set
     */
    public void setConvocatorias(List<ConvocatoriaModel> convocatorias) {
        this.convocatorias = convocatorias;
    }

    /**
     * @return the convocatoriasFiltro
     */
    public List<ConvocatoriaModel> getConvocatoriasFiltro() {
        return convocatoriasFiltro;
    }

    /**
     * @param convocatoriasFiltro the convocatoriasFiltro to set
     */
    public void setConvocatoriasFiltro(List<ConvocatoriaModel> convocatoriasFiltro) {
        this.convocatoriasFiltro = convocatoriasFiltro;
    }

    /**
     * @return the convocatoriaModel
     */
    public ConvocatoriaModel getConvocatoriaModel() {
        return convocatoriaModel;
    }

    /**
     * @param convocatoriaModel the convocatoriaModel to set
     */
    public void setConvocatoriaModel(ConvocatoriaModel convocatoriaModel) {
        this.convocatoriaModel = convocatoriaModel;
    }

}
