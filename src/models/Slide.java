/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;

/**
 *
 * @author hola
 */
public class Slide extends PizzaElement{
   
    public Slide(String ingredient) throws IOException {
        super(ingredient, "slide.txt");
    }  
}
