/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.OrdersModel;
import models.Order;
/**
 *
 * @author hola
 */
public class InPreparationController implements ActionListener{
    OrdersModel iom, ipom;

    public InPreparationController(OrdersModel iom, OrdersModel ipom) {
        this.iom = iom;
        this.ipom = ipom;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Order order = iom.getElementAt(0);
        ipom.addOrder(order);
        iom.removeOrder(order);
    }
    
}
