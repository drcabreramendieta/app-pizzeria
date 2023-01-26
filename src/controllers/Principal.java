/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.IOException;
import models.ItemsModel;
import models.PreOrderModel;
import models.OrdersModel;

import views.RegisterOrderWIndow;
/**
 *
 * @author hola
 */
public class Principal {
    public static void main(String[] args) throws IOException{
        ItemsModel pizzaType = new ItemsModel("slide.txt");
        ItemsModel pizzaSize = new ItemsModel("size.txt");
        ItemsModel pizzaBorder = new ItemsModel("border.txt");
        ItemsModel extras = new ItemsModel("extra.txt");
        
        PreOrderModel pom = new PreOrderModel();
        
        OrdersModel iom = new OrdersModel();
        OrdersModel ipom = new OrdersModel();
        OrdersModel fom = new OrdersModel();
        
        RegisterOrderWIndow v1 = new RegisterOrderWIndow();
        v1.setPizzaModels(pizzaType, pizzaSize, pizzaBorder, extras);
        v1.setPreOrderModel(pom);
        v1.setOrdersModels(iom, ipom, fom);
        
        AddPizzaController apc = new AddPizzaController(v1,pom);
        v1.addPizzaController(apc);
        
        v1.setVisible(true);
    }
}
