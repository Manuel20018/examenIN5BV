/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "reservaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservaciones.findAll", query = "SELECT r FROM Reservaciones r")
    , @NamedQuery(name = "Reservaciones.findByIdreservacion", query = "SELECT r FROM Reservaciones r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservaciones.findByFechainicial", query = "SELECT r FROM Reservaciones r WHERE r.fechainicial = :fechainicial")
    , @NamedQuery(name = "Reservaciones.findByFechafinal", query = "SELECT r FROM Reservaciones r WHERE r.fechafinal = :fechafinal")})
public class Reservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Column(name = "fechainicial")
    @Temporal(TemporalType.DATE)
    private Date fechainicial;
    @Column(name = "fechafinal")
    @Temporal(TemporalType.DATE)
    private Date fechafinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservacionesIdreservacion")
    private List<Cotizaciones> cotizacionesList;
    @JoinColumn(name = "clientes_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes clientesIdclientes;
    @JoinColumn(name = "sucursales_idsucursales", referencedColumnName = "idsucursales")
    @ManyToOne(optional = false)
    private Sucursales sucursalesIdsucursales;
    @JoinColumn(name = "tipoevento_idtipoevento", referencedColumnName = "idtipoevento")
    @ManyToOne(optional = false)
    private Tipoevento tipoeventoIdtipoevento;

    public Reservaciones() {
    }

    public Reservaciones(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    @XmlTransient
    public List<Cotizaciones> getCotizacionesList() {
        return cotizacionesList;
    }

    public void setCotizacionesList(List<Cotizaciones> cotizacionesList) {
        this.cotizacionesList = cotizacionesList;
    }

    public Clientes getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Clientes clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Sucursales getSucursalesIdsucursales() {
        return sucursalesIdsucursales;
    }

    public void setSucursalesIdsucursales(Sucursales sucursalesIdsucursales) {
        this.sucursalesIdsucursales = sucursalesIdsucursales;
    }

    public Tipoevento getTipoeventoIdtipoevento() {
        return tipoeventoIdtipoevento;
    }

    public void setTipoeventoIdtipoevento(Tipoevento tipoeventoIdtipoevento) {
        this.tipoeventoIdtipoevento = tipoeventoIdtipoevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservaciones)) {
            return false;
        }
        Reservaciones other = (Reservaciones) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Reservaciones[ idreservacion=" + idreservacion + " ]";
    }
    
}
