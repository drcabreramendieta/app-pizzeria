/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
    
}
