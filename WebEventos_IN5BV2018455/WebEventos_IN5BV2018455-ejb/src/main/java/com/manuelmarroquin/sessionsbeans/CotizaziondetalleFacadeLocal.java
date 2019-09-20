/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.sessionsbeans;

import com.manuelmarroquin.entities.Cotizaziondetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface CotizaziondetalleFacadeLocal {

    void create(Cotizaziondetalle cotizaziondetalle);

    void edit(Cotizaziondetalle cotizaziondetalle);

    void remove(Cotizaziondetalle cotizaziondetalle);

    Cotizaziondetalle find(Object id);

    List<Cotizaziondetalle> findAll();

    List<Cotizaziondetalle> findRange(int[] range);

    int count();
    
}
