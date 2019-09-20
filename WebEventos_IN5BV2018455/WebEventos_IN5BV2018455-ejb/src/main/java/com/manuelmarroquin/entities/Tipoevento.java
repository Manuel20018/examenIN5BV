/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "tipoevento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoevento.findAll", query = "SELECT t FROM Tipoevento t")
    , @NamedQuery(name = "Tipoevento.findByIdtipoevento", query = "SELECT t FROM Tipoevento t WHERE t.idtipoevento = :idtipoevento")
    , @NamedQuery(name = "Tipoevento.findByDescripcion", query = "SELECT t FROM Tipoevento t WHERE t.descripcion = :descripcion")})
public class Tipoevento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtipoevento")
    private Integer idtipoevento;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoeventoIdtipoevento")
    private List<Reservaciones> reservacionesList;

    public Tipoevento() {
    }

    public Tipoevento(Integer idtipoevento) {
        this.idtipoevento = idtipoevento;
    }

    public Integer getIdtipoevento() {
        return idtipoevento;
    }

    public void setIdtipoevento(Integer idtipoevento) {
        this.idtipoevento = idtipoevento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Reservaciones> getReservacionesList() {
        return reservacionesList;
    }

    public void setReservacionesList(List<Reservaciones> reservacionesList) {
        this.reservacionesList = reservacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoevento != null ? idtipoevento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoevento)) {
            return false;
        }
        Tipoevento other = (Tipoevento) object;
        if ((this.idtipoevento == null && other.idtipoevento != null) || (this.idtipoevento != null && !this.idtipoevento.equals(other.idtipoevento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Tipoevento[ idtipoevento=" + idtipoevento + " ]";
    }
    
}
