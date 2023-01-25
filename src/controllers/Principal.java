/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.IOException;
import models.Order;
/**
 *
 * @author hola
 */
public class Principal {
    public static void main(String[] args) throws IOException{
        Order order = new Order();
        order.addPizza(12, "mushroom");
        order.addPizza(20, "peperoni");
        order.addExtra("papita");
        System.out.println(order.getCost());
    }
}
