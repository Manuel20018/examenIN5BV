package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Tipoevento.class)
public class Tipoevento_ { 

    public static volatile SingularAttribute<Tipoevento, String> descripcion;
    public static volatile ListAttribute<Tipoevento, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Tipoevento, Integer> idtipoevento;

}