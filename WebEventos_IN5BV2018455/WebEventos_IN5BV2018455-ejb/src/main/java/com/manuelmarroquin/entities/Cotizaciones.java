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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cotizaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c")
    , @NamedQuery(name = "Cotizaciones.findByIdcotizacion", query = "SELECT c FROM Cotizaciones c WHERE c.idcotizacion = :idcotizacion")
    , @NamedQuery(name = "Cotizaciones.findByFecha", query = "SELECT c FROM Cotizaciones c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cotizaciones.findByNombreafacturar", query = "SELECT c FROM Cotizaciones c WHERE c.nombreafacturar = :nombreafacturar")
    , @NamedQuery(name = "Cotizaciones.findByDireccionfacturar", query = "SELECT c FROM Cotizaciones c WHERE c.direccionfacturar = :direccionfacturar")})
public class Cotizaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcotizacion")
    private Integer idcotizacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "nombreafacturar")
    private String nombreafacturar;
    @Size(max = 45)
    @Column(name = "direccionfacturar")
    private String direccionfacturar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionesIdcotizacion")
    private List<Cotizaziondetalle> cotizaziondetalleList;
    @JoinColumn(name = "reservaciones_idreservacion", referencedColumnName = "idreservacion")
    @ManyToOne(optional = false)
    private Reservaciones reservacionesIdreservacion;

    public Cotizaciones() {
    }

    public Cotizaciones(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Integer getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreafacturar() {
        return nombreafacturar;
    }

    public void setNombreafacturar(String nombreafacturar) {
        this.nombreafacturar = nombreafacturar;
    }

    public String getDireccionfacturar() {
        return direccionfacturar;
    }

    public void setDireccionfacturar(String direccionfacturar) {
        this.direccionfacturar = direccionfacturar;
    }

    @XmlTransient
    public List<Cotizaziondetalle> getCotizaziondetalleList() {
        return cotizaziondetalleList;
    }

    public void setCotizaziondetalleList(List<Cotizaziondetalle> cotizaziondetalleList) {
        this.cotizaziondetalleList = cotizaziondetalleList;
    }

    public Reservaciones getReservacionesIdreservacion() {
        return reservacionesIdreservacion;
    }

    public void setReservacionesIdreservacion(Reservaciones reservacionesIdreservacion) {
        this.reservacionesIdreservacion = reservacionesIdreservacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizacion != null ? idcotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.idcotizacion == null && other.idcotizacion != null) || (this.idcotizacion != null && !this.idcotizacion.equals(other.idcotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Cotizaciones[ idcotizacion=" + idcotizacion + " ]";
    }
    
}
