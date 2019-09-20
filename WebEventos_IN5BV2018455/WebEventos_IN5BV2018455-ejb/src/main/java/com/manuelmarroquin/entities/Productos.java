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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByIdproductos", query = "SELECT p FROM Productos p WHERE p.idproductos = :idproductos")
    , @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Productos.findByPrecioventa", query = "SELECT p FROM Productos p WHERE p.precioventa = :precioventa")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproductos")
    private Integer idproductos;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioventa")
    private Double precioventa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosIdproductos1")
    private List<Facturaciondetalle> facturaciondetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosIdproductos")
    private List<Cotizaziondetalle> cotizaziondetalleList;
    @JoinColumn(name = "tipoproducto_idtipoproducto", referencedColumnName = "idtipoproducto")
    @ManyToOne(optional = false)
    private Tipoproducto tipoproductoIdtipoproducto;

    public Productos() {
    }

    public Productos(Integer idproductos) {
        this.idproductos = idproductos;
    }

    public Integer getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(Integer idproductos) {
        this.idproductos = idproductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    @XmlTransient
    public List<Facturaciondetalle> getFacturaciondetalleList() {
        return facturaciondetalleList;
    }

    public void setFacturaciondetalleList(List<Facturaciondetalle> facturaciondetalleList) {
        this.facturaciondetalleList = facturaciondetalleList;
    }

    @XmlTransient
    public List<Cotizaziondetalle> getCotizaziondetalleList() {
        return cotizaziondetalleList;
    }

    public void setCotizaziondetalleList(List<Cotizaziondetalle> cotizaziondetalleList) {
        this.cotizaziondetalleList = cotizaziondetalleList;
    }

    public Tipoproducto getTipoproductoIdtipoproducto() {
        return tipoproductoIdtipoproducto;
    }

    public void setTipoproductoIdtipoproducto(Tipoproducto tipoproductoIdtipoproducto) {
        this.tipoproductoIdtipoproducto = tipoproductoIdtipoproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproductos != null ? idproductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idproductos == null && other.idproductos != null) || (this.idproductos != null && !this.idproductos.equals(other.idproductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Productos[ idproductos=" + idproductos + " ]";
    }
    
}
