/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
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
    
    public void addOrder(PreOrderModel pom, String clientName) throws IOException{
        Order order = new Order();
        for(int i=0; i < pom.getSize(); i++){
            Object item = pom.getElementAt(i);
            if(item.getClass().getName().equals("Pizza")){
                order.addPizza((Pizza) item);
            }
            else if(item.getClass().getName().equals("Extra")){
                order.addExtra((Extra)item);
            }
        }
        order.addClient(clientName);
        addOrder(order);
    }
    
    public void addOrder(Order order){
        int size = orders.size();
        orders.add(order);
        fireIntervalAdded(this,size,size);
    }
    
    public void removeOrder(Order order){
        int index = orders.indexOf(order);
        orders.remove(order);
        fireIntervalRemoved(this,index,index);
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        removeOrder((Order)pce.getSource());
    }
}
