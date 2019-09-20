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
@Table(name = "facturaciondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturaciondetalle.findAll", query = "SELECT f FROM Facturaciondetalle f")
    , @NamedQuery(name = "Facturaciondetalle.findByIdfacturaciondetalle", query = "SELECT f FROM Facturaciondetalle f WHERE f.idfacturaciondetalle = :idfacturaciondetalle")})
public class Facturaciondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturaciondetalle")
    private Integer idfacturaciondetalle;
    @JoinColumn(name = "clientes_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes clientesIdclientes;
    @JoinColumn(name = "productos_idproductos1", referencedColumnName = "idproductos")
    @ManyToOne(optional = false)
    private Productos productosIdproductos1;

    public Facturaciondetalle() {
    }

    public Facturaciondetalle(Integer idfacturaciondetalle) {
        this.idfacturaciondetalle = idfacturaciondetalle;
    }

    public Integer getIdfacturaciondetalle() {
        return idfacturaciondetalle;
    }

    public void setIdfacturaciondetalle(Integer idfacturaciondetalle) {
        this.idfacturaciondetalle = idfacturaciondetalle;
    }

    public Clientes getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Clientes clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Productos getProductosIdproductos1() {
        return productosIdproductos1;
    }

    public void setProductosIdproductos1(Productos productosIdproductos1) {
        this.productosIdproductos1 = productosIdproductos1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturaciondetalle != null ? idfacturaciondetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturaciondetalle)) {
            return false;
        }
        Facturaciondetalle other = (Facturaciondetalle) object;
        if ((this.idfacturaciondetalle == null && other.idfacturaciondetalle != null) || (this.idfacturaciondetalle != null && !this.idfacturaciondetalle.equals(other.idfacturaciondetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Facturaciondetalle[ idfacturaciondetalle=" + idfacturaciondetalle + " ]";
    }
    
}
