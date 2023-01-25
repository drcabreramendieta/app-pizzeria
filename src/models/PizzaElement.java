/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hola
 */
public abstract class PizzaElement {
    private String ingredient;
    private double cost;
    private String path;

    public PizzaElement(String ingredient, String path) throws IOException {
        this.ingredient = ingredient;
        this.path = path;
        this.cost = readCost(ingredient);
    }
    
    private double readCost(String ingredient) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            String[]columns = line.split("\t");
            if(columns[0].equals(ingredient)){
                return Double.parseDouble(columns[1]);
            }
            line = br.readLine();
        }
        throw new EOFException("Not Found Ingredient");
    }

    public double getCost() {
        return cost;
    }
    
    
}
