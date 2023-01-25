/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hola
 */
public class Pizza {
    private int size;
    private ArrayList<Slide> slides;
    private Border border;
    private double cost;
    
    public Pizza(int size, 
            String slidesIngredient) throws IOException{
        this.size = size;
        slides = new ArrayList<>();
        for(int i = 0; i < size; i++){
            slides.add(new Slide(slidesIngredient));
        }
        computeCost();
    }
    
    public Pizza(int size, 
            String slidesIngredient, 
            String borderIngredient) throws IOException{
        this.size = size;
        slides = new ArrayList<>();
        for(int i = 0; i < size; i++){
            slides.add(new Slide(slidesIngredient));
        }
        border = new Border(borderIngredient);
        computeCost();
    }
    
    private void computeCost(){
        double cost = 0;
        for(Slide slide:this.slides){
            cost += slide.getCost();
        }
        if(this.border != null){
            cost += this.border.getCost();
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    
    
}
