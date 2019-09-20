package com.manuelmarroquin.entities;

import com.manuelmarroquin.entities.Clientes;
import com.manuelmarroquin.entities.Sucursales;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T16:24:59")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Date> fechaentrega;
    public static volatile SingularAttribute<Facturacion, Integer> idnumerodocumento;
    public static volatile SingularAttribute<Facturacion, Clientes> clientesIdclientes;
    public static volatile SingularAttribute<Facturacion, Sucursales> sucursalesIdsucursales;
    public static volatile SingularAttribute<Facturacion, String> facturacioncol;
    public static volatile SingularAttribute<Facturacion, Date> fechadocumento;

}