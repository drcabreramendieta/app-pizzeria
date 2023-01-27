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
import views.CookingWindow;
/**
 *
 * @author hola
 */
public class FinalizedController implements ActionListener{
    CookingWindow v;
    OrdersModel ipom, fom;
    
    public FinalizedController(CookingWindow v,OrdersModel ipom, OrdersModel fom) {
        this.v = v;
        this.ipom = ipom;
        this.fom = fom;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int index = v.getSelectedItem();
        Order order = ipom.getElementAt(index);
        fom.addOrder(order);
        ipom.removeOrder(order);
    }
}
