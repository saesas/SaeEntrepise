/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hector Ivan
 */
@Entity
@Table(name = "tipo_clausula_contrato", catalog = "bdsae", schema = "talento_humano")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoClausulaContrato.findAll", query = "SELECT t FROM TipoClausulaContrato t"),
    @NamedQuery(name = "TipoClausulaContrato.findById", query = "SELECT t FROM TipoClausulaContrato t WHERE t.id = :id"),
    @NamedQuery(name = "TipoClausulaContrato.findByNombre", query = "SELECT t FROM TipoClausulaContrato t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TipoClausulaContrato.findByDescripcion", query = "SELECT t FROM TipoClausulaContrato t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoClausulaContrato.findByEstado", query = "SELECT t FROM TipoClausulaContrato t WHERE t.estado = :estado"),
    @NamedQuery(name = "TipoClausulaContrato.findByFechaRegistro", query = "SELECT t FROM TipoClausulaContrato t WHERE t.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "TipoClausulaContrato.findByIdUsuario", query = "SELECT t FROM TipoClausulaContrato t WHERE t.idUsuario = :idUsuario")})
public class TipoClausulaContrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @OneToMany(mappedBy = "idClausula")
    private List<ClausulaContrato> clausulaContratoList;

    public TipoClausulaContrato() {
    }

    public TipoClausulaContrato(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @XmlTransient
    public List<ClausulaContrato> getClausulaContratoList() {
        return clausulaContratoList;
    }

    public void setClausulaContratoList(List<ClausulaContrato> clausulaContratoList) {
        this.clausulaContratoList = clausulaContratoList;
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
        if (!(object instanceof TipoClausulaContrato)) {
            return false;
        }
        TipoClausulaContrato other = (TipoClausulaContrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sae.persistence.domain.TipoClausulaContrato[ id=" + id + " ]";
    }
    
}
