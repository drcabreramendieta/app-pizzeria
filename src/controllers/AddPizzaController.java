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
import models.PreOrderModel;

/**
 *
 * @author hola
 */
public class AddPizzaController implements ActionListener{
    RegisterOrderWIndow v;
    PreOrderModel m;

    public AddPizzaController(RegisterOrderWIndow v, PreOrderModel m) {
        this.v = v;
        this.m = m;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            m.addPizza(v.getPizza());
        } catch (IOException ex) {
            Logger.getLogger(AddPizzaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
