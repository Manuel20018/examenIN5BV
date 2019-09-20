package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Cotizaciones;
import com.manuelmarroquin.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Cotizaziondetalle.class)
public class Cotizaziondetalle_ { 

    public static volatile SingularAttribute<Cotizaziondetalle, Integer> idcotizaziondetalle;
    public static volatile SingularAttribute<Cotizaziondetalle, Cotizaciones> cotizacionesIdcotizacion;
    public static volatile SingularAttribute<Cotizaziondetalle, Double> precantidad;
    public static volatile SingularAttribute<Cotizaziondetalle, Productos> productosIdproductos;

}