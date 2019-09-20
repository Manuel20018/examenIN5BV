package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Clientes;
import com.manuelmarroquin.entities.Cotizaciones;
import com.manuelmarroquin.entities.Sucursales;
import com.manuelmarroquin.entities.Tipoevento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Reservaciones.class)
public class Reservaciones_ { 

    public static volatile SingularAttribute<Reservaciones, Clientes> clientesIdclientes;
    public static volatile SingularAttribute<Reservaciones, Sucursales> sucursalesIdsucursales;
    public static volatile SingularAttribute<Reservaciones, Date> fechainicial;
    public static volatile ListAttribute<Reservaciones, Cotizaciones> cotizacionesList;
    public static volatile SingularAttribute<Reservaciones, Tipoevento> tipoeventoIdtipoevento;
    public static volatile SingularAttribute<Reservaciones, Integer> idreservacion;
    public static volatile SingularAttribute<Reservaciones, Date> fechafinal;

}