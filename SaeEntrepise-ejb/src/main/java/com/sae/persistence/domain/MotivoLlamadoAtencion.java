/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hector Ivan
 */
@Entity
@Table(name = "motivo_llamado_atencion", catalog = "bdsae", schema = "juridico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivoLlamadoAtencion.findAll", query = "SELECT m FROM MotivoLlamadoAtencion m"),
    @NamedQuery(name = "MotivoLlamadoAtencion.findById", query = "SELECT m FROM MotivoLlamadoAtencion m WHERE m.id = :id"),
    @NamedQuery(name = "MotivoLlamadoAtencion.findByEstado", query = "SELECT m FROM MotivoLlamadoAtencion m WHERE m.estado = :estado"),
    @NamedQuery(name = "MotivoLlamadoAtencion.findByFechaRegistro", query = "SELECT m FROM MotivoLlamadoAtencion m WHERE m.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "MotivoLlamadoAtencion.findByIdUsuario", query = "SELECT m FROM MotivoLlamadoAtencion m WHERE m.idUsuario = :idUsuario")})
public class MotivoLlamadoAtencion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @JoinColumn(name = "id_motivo", referencedColumnName = "id")
    @ManyToOne
    private TipoMotivoLlamadoAtencion idMotivo;
    @JoinColumn(name = "id_llamado_atencion", referencedColumnName = "id")
    @ManyToOne
    private LlamadoAtencion idLlamadoAtencion;

    public MotivoLlamadoAtencion() {
    }

    public MotivoLlamadoAtencion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TipoMotivoLlamadoAtencion getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(TipoMotivoLlamadoAtencion idMotivo) {
        this.idMotivo = idMotivo;
    }

    public LlamadoAtencion getIdLlamadoAtencion() {
        return idLlamadoAtencion;
    }

    public void setIdLlamadoAtencion(LlamadoAtencion idLlamadoAtencion) {
        this.idLlamadoAtencion = idLlamadoAtencion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivoLlamadoAtencion)) {
            return false;
        }
        MotivoLlamadoAtencion other = (MotivoLlamadoAtencion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sae.persistence.domain.MotivoLlamadoAtencion[ id=" + id + " ]";
    }
    
}
