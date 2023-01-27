/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import models.Order;

/**
 *
 * @author hola
 */
public class InitializedOrderRenderedCW implements ListCellRenderer<Order>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Order> jlist, Order e, int i, boolean bln, boolean bln1) {
        JLabel label = new JLabel(e.forCooking());
        return label;
    }
    
}
