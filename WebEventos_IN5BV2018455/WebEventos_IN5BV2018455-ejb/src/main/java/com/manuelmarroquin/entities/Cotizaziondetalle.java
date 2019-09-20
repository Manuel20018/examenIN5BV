/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cotizaziondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaziondetalle.findAll", query = "SELECT c FROM Cotizaziondetalle c")
    , @NamedQuery(name = "Cotizaziondetalle.findByIdcotizaziondetalle", query = "SELECT c FROM Cotizaziondetalle c WHERE c.idcotizaziondetalle = :idcotizaziondetalle")
    , @NamedQuery(name = "Cotizaziondetalle.findByPrecantidad", query = "SELECT c FROM Cotizaziondetalle c WHERE c.precantidad = :precantidad")})
public class Cotizaziondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcotizaziondetalle")
    private Integer idcotizaziondetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precantidad")
    private Double precantidad;
    @JoinColumn(name = "cotizaciones_idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizaciones cotizacionesIdcotizacion;
    @JoinColumn(name = "productos_idproductos", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos productosIdproductos;

    public Cotizaziondetalle() {
    }

    public Cotizaziondetalle(Integer idcotizaziondetalle) {
        this.idcotizaziondetalle = idcotizaziondetalle;
    }

    public Integer getIdcotizaziondetalle() {
        return idcotizaziondetalle;
    }

    public void setIdcotizaziondetalle(Integer idcotizaziondetalle) {
        this.idcotizaziondetalle = idcotizaziondetalle;
    }

    public Double getPrecantidad() {
        return precantidad;
    }

    public void setPrecantidad(Double precantidad) {
        this.precantidad = precantidad;
    }

    public Cotizaciones getCotizacionesIdcotizacion() {
        return cotizacionesIdcotizacion;
    }

    public void setCotizacionesIdcotizacion(Cotizaciones cotizacionesIdcotizacion) {
        this.cotizacionesIdcotizacion = cotizacionesIdcotizacion;
    }

    public Productos getProductosIdproductos() {
        return productosIdproductos;
    }

    public void setProductosIdproductos(Productos productosIdproductos) {
        this.productosIdproductos = productosIdproductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizaziondetalle != null ? idcotizaziondetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaziondetalle)) {
            return false;
        }
        Cotizaziondetalle other = (Cotizaziondetalle) object;
        if ((this.idcotizaziondetalle == null && other.idcotizaziondetalle != null) || (this.idcotizaziondetalle != null && !this.idcotizaziondetalle.equals(other.idcotizaziondetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Cotizaziondetalle[ idcotizaziondetalle=" + idcotizaziondetalle + " ]";
    }
    
}
