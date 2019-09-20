package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Areas;
import com.manuelmarroquin.entities.Facturacion;
import com.manuelmarroquin.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Sucursales.class)
public class Sucursales_ { 

    public static volatile SingularAttribute<Sucursales, Integer> idsucursales;
    public static volatile ListAttribute<Sucursales, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Sucursales, String> direccion;
    public static volatile SingularAttribute<Sucursales, Areas> areasIdareas;
    public static volatile SingularAttribute<Sucursales, String> telefono;
    public static volatile ListAttribute<Sucursales, Facturacion> facturacionList;
    public static volatile SingularAttribute<Sucursales, String> nombre;

}