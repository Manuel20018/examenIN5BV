package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Sucursales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, Integer> idareas;
    public static volatile SingularAttribute<Areas, String> nombre;
    public static volatile ListAttribute<Areas, Sucursales> sucursalesList;

}