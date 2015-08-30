/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sae.presentation.model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author SAE2
 */
@ManagedBean
@ViewScoped
public class ConvocatoriaModel {

    /**
     * Creates a new instance of ConvocatoriaModel
     */
    public ConvocatoriaModel() {
    }

    //  @ManagedProperty(value="#{selecCursosBean}")
    private int idConvocatoria;
    private String codigoConvocatoria;
    private int idEntidadContratante;
    private String entidadContratante;
    private int idTipoProceso;
    private String tipoProceso;
    private String url;
    private int idEstado;
    private String estado;
    private Date fecha;
    
    public ConvocatoriaModel(int idConvocatoria, String codigoConvocatoria, int idEntidadContratante, String entidadContratante, int idTipoProceso, String tipoProceso, String url, int idEstado, String estado, Date fecha) {
        this.idConvocatoria = idConvocatoria;
        this.codigoConvocatoria = codigoConvocatoria;
        this.idEntidadContratante = idEntidadContratante;
        this.entidadContratante = entidadContratante;
        this.idTipoProceso = idTipoProceso;
        this.tipoProceso = tipoProceso;
        this.url = url;
        this.idEstado = idEstado;
        this.estado = estado;
        this.fecha = fecha;
    }
    /**
     * @return the idEntidadContratante
     */
    public int getIdEntidadContratante() {
        return idEntidadContratante;
    }

    /**
     * @param idEntidadContratante the idEntidadContratante to set
     */
    public void setIdEntidadContratante(int idEntidadContratante) {
        this.idEntidadContratante = idEntidadContratante;
    }

    /**
     * @return the entidadContratante
     */
    public String getEntidadContratante() {
        return entidadContratante;
    }

    /**
     * @param entidadContratante the entidadContratante to set
     */
    public void setEntidadContratante(String entidadContratante) {
        this.entidadContratante = entidadContratante;
    }

    /**
     * @return the idTipoProceso
     */
    public int getIdTipoProceso() {
        return idTipoProceso;
    }

    /**
     * @param idTipoProceso the idTipoProceso to set
     */
    public void setIdTipoProceso(int idTipoProceso) {
        this.idTipoProceso = idTipoProceso;
    }

    /**
     * @return the tipoProceso
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * @param tipoProceso the tipoProceso to set
     */
    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idConvocatoria
     */
    public int getIdConvocatoria() {
        return idConvocatoria;
    }

    /**
     * @param idConvocatoria the idConvocatoria to set
     */
    public void setIdConvocatoria(int idConvocatoria) {
        this.idConvocatoria = idConvocatoria;
    }

    /**
     * @return the codigoConvocatoria
     */
    public String getCodigoConvocatoria() {
        return codigoConvocatoria;
    }

    /**
     * @param codigoConvocatoria the codigoConvocatoria to set
     */
    public void setCodigoConvocatoria(String codigoConvocatoria) {
        this.codigoConvocatoria = codigoConvocatoria;
    }

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
