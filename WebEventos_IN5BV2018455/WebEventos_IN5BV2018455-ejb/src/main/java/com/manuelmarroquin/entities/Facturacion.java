/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")
    , @NamedQuery(name = "Facturacion.findByIdnumerodocumento", query = "SELECT f FROM Facturacion f WHERE f.idnumerodocumento = :idnumerodocumento")
    , @NamedQuery(name = "Facturacion.findByFechadocumento", query = "SELECT f FROM Facturacion f WHERE f.fechadocumento = :fechadocumento")
    , @NamedQuery(name = "Facturacion.findByFechaentrega", query = "SELECT f FROM Facturacion f WHERE f.fechaentrega = :fechaentrega")
    , @NamedQuery(name = "Facturacion.findByFacturacioncol", query = "SELECT f FROM Facturacion f WHERE f.facturacioncol = :facturacioncol")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnumerodocumento")
    private Integer idnumerodocumento;
    @Column(name = "fechadocumento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadocumento;
    @Column(name = "fechaentrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaentrega;
    @Size(max = 45)
    @Column(name = "facturacioncol")
    private String facturacioncol;
    @JoinColumn(name = "clientes_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes clientesIdclientes;
    @JoinColumn(name = "sucursales_idsucursales", referencedColumnName = "idsucursales")
    @ManyToOne(optional = false)
    private Sucursales sucursalesIdsucursales;

    public Facturacion() {
    }

    public Facturacion(Integer idnumerodocumento) {
        this.idnumerodocumento = idnumerodocumento;
    }

    public Integer getIdnumerodocumento() {
        return idnumerodocumento;
    }

    public void setIdnumerodocumento(Integer idnumerodocumento) {
        this.idnumerodocumento = idnumerodocumento;
    }

    public Date getFechadocumento() {
        return fechadocumento;
    }

    public void setFechadocumento(Date fechadocumento) {
        this.fechadocumento = fechadocumento;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getFacturacioncol() {
        return facturacioncol;
    }

    public void setFacturacioncol(String facturacioncol) {
        this.facturacioncol = facturacioncol;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnumerodocumento != null ? idnumerodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.idnumerodocumento == null && other.idnumerodocumento != null) || (this.idnumerodocumento != null && !this.idnumerodocumento.equals(other.idnumerodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Facturacion[ idnumerodocumento=" + idnumerodocumento + " ]";
    }
    
}
