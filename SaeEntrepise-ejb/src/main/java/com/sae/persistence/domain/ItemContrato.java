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
@Table(name = "item_contrato", catalog = "bdsae", schema = "juridico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemContrato.findAll", query = "SELECT i FROM ItemContrato i"),
    @NamedQuery(name = "ItemContrato.findById", query = "SELECT i FROM ItemContrato i WHERE i.id = :id"),
    @NamedQuery(name = "ItemContrato.findByNombre", query = "SELECT i FROM ItemContrato i WHERE i.nombre = :nombre"),
    @NamedQuery(name = "ItemContrato.findByEstado", query = "SELECT i FROM ItemContrato i WHERE i.estado = :estado"),
    @NamedQuery(name = "ItemContrato.findByFechaRegistro", query = "SELECT i FROM ItemContrato i WHERE i.fechaRegistro = :fechaRegistro")})
public class ItemContrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @OneToMany(mappedBy = "idItem")
    private List<RevisionContratoLaboral> revisionContratoLaboralList;

    public ItemContrato() {
    }

    public ItemContrato(Integer id) {
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

    @XmlTransient
    public List<RevisionContratoLaboral> getRevisionContratoLaboralList() {
        return revisionContratoLaboralList;
    }

    public void setRevisionContratoLaboralList(List<RevisionContratoLaboral> revisionContratoLaboralList) {
        this.revisionContratoLaboralList = revisionContratoLaboralList;
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
        if (!(object instanceof ItemContrato)) {
            return false;
        }
        ItemContrato other = (ItemContrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sae.persistence.domain.ItemContrato[ id=" + id + " ]";
    }
    
}
