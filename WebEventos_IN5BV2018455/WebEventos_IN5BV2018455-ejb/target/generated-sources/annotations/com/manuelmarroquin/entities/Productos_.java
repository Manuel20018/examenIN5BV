package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Cotizaziondetalle;
import com.manuelmarroquin.entities.Facturaciondetalle;
import com.manuelmarroquin.entities.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile ListAttribute<Productos, Facturaciondetalle> facturaciondetalleList;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Cotizaziondetalle> cotizaziondetalleList;
    public static volatile SingularAttribute<Productos, Double> precioventa;
    public static volatile SingularAttribute<Productos, Tipoproducto> tipoproductoIdtipoproducto;

}