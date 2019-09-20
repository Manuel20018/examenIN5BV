/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manuelmarroquin.sessionsbeans;

import com.manuelmarroquin.entities.Reservaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class ReservacionesFacade extends AbstractFacade<Reservaciones> implements ReservacionesFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV_2018455PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservacionesFacade() {
        super(Reservaciones.class);
    }
    
}
