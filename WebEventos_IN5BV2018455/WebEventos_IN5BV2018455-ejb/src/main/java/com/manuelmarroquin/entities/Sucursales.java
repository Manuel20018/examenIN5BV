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
@Table(name = "sucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s")
    , @NamedQuery(name = "Sucursales.findByIdsucursales", query = "SELECT s FROM Sucursales s WHERE s.idsucursales = :idsucursales")
    , @NamedQuery(name = "Sucursales.findByNombre", query = "SELECT s FROM Sucursales s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "Sucursales.findByTelefono", query = "SELECT s FROM Sucursales s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "Sucursales.findByDireccion", query = "SELECT s FROM Sucursales s WHERE s.direccion = :direccion")})
public class Sucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsucursales")
    private Integer idsucursales;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @JoinColumn(name = "areas_idareas", referencedColumnName = "idareas")
    @ManyToOne(optional = false)
    private Areas areasIdareas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalesIdsucursales")
    private List<Facturacion> facturacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalesIdsucursales")
    private List<Reservaciones> reservacionesList;

    public Sucursales() {
    }

    public Sucursales(Integer idsucursales) {
        this.idsucursales = idsucursales;
    }

    public Integer getIdsucursales() {
        return idsucursales;
    }

    public void setIdsucursales(Integer idsucursales) {
        this.idsucursales = idsucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Areas getAreasIdareas() {
        return areasIdareas;
    }

    public void setAreasIdareas(Areas areasIdareas) {
        this.areasIdareas = areasIdareas;
    }

    @XmlTransient
    public List<Facturacion> getFacturacionList() {
        return facturacionList;
    }

    public void setFacturacionList(List<Facturacion> facturacionList) {
        this.facturacionList = facturacionList;
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
        hash += (idsucursales != null ? idsucursales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.idsucursales == null && other.idsucursales != null) || (this.idsucursales != null && !this.idsucursales.equals(other.idsucursales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.manuelmarroquin.entities.Sucursales[ idsucursales=" + idsucursales + " ]";
    }
    
}
