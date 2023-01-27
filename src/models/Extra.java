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
public class Extra extends PizzaElement{
    
    public Extra(String ingredient) throws IOException {
        super(ingredient, "extra.txt");
    }
    
    @Override
    public String toString(){
        return "Extra: "+this.getIngredient();
    }
}
