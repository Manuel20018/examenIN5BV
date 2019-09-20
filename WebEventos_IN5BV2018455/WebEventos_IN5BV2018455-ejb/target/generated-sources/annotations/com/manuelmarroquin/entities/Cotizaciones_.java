package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Cotizaziondetalle;
import com.manuelmarroquin.entities.Reservaciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Cotizaciones.class)
public class Cotizaciones_ { 

    public static volatile SingularAttribute<Cotizaciones, Date> fecha;
    public static volatile SingularAttribute<Cotizaciones, String> direccionfacturar;
    public static volatile SingularAttribute<Cotizaciones, Integer> idcotizacion;
    public static volatile SingularAttribute<Cotizaciones, String> nombreafacturar;
    public static volatile ListAttribute<Cotizaciones, Cotizaziondetalle> cotizaziondetalleList;
    public static volatile SingularAttribute<Cotizaciones, Reservaciones> reservacionesIdreservacion;

}