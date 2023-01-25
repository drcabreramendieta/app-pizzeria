/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author hola
 */
public class OrdersModel extends AbstractListModel implements PropertyChangeListener{
    ArrayList<Order> orders;

    public OrdersModel() {
        orders = new ArrayList<>();
    }
    
    
    
    @Override
    public int getSize() {
        return orders.size();
    }

    @Override
    public Order getElementAt(int i) {
        return orders.get(i);
    }
    
    public void addOrder(Order order){
        orders.add(order);
    }
    
    public void removeOrder(Order order){
        orders.remove(order);
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        removeOrder((Order)pce.getSource());
    }
}
