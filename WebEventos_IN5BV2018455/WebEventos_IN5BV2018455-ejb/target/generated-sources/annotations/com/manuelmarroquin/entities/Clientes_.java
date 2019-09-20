package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Facturacion;
import com.manuelmarroquin.entities.Facturaciondetalle;
import com.manuelmarroquin.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile ListAttribute<Clientes, Facturaciondetalle> facturaciondetalleList;
    public static volatile ListAttribute<Clientes, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, Integer> idclientes;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile ListAttribute<Clientes, Facturacion> facturacionList;
    public static volatile SingularAttribute<Clientes, String> nombres;

}