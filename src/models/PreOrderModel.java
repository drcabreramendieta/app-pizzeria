/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
/**
 *
 * @author hola
 */
public class PreOrderModel extends AbstractListModel{
    private ArrayList<Object> items;

    public PreOrderModel() {
        items = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public Object getElementAt(int i) {
        return items.get(i);
    }
    
    public void addPizza(Item[] pizza) throws IOException{
        Pizza p;
        if(pizza[2] == null){
            p = new Pizza((int)pizza[1].getValue(), pizza[0].getName());
        }
        else{
            p = new Pizza((int)pizza[1].getValue(), pizza[0].getName(),pizza[2].getName());
        }
        int size = items.size();
        items.add(p);
        fireIntervalAdded(this, size,size);
    }
    
    public void addExtra(Item extra) throws IOException{
        Extra e = new Extra(extra.getName());
        int size = items.size();
        items.add(e);
        fireIntervalAdded(this, size,size);
    }
}
