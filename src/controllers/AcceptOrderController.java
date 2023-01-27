/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import views.RegisterOrderWIndow;
import models.OrdersModel;
import models.PreOrderModel;
/**
 *
 * @author hola
 */
public class AcceptOrderController implements ActionListener{
    RegisterOrderWIndow v;
    OrdersModel om;
    PreOrderModel pom;

    public AcceptOrderController(RegisterOrderWIndow v, OrdersModel om, PreOrderModel pom) {
        this.v = v;
        this.om = om;
        this.pom = pom;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            om.addOrder(pom,v.getClient());
        } catch (IOException ex) {
            Logger.getLogger(AcceptOrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
