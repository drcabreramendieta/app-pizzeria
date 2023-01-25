/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author hola
 */
public class ItemsModel extends AbstractListModel{
    private ArrayList<String> items;
    private String path;

    public ItemsModel(String path) throws FileNotFoundException, IOException {
        this.path = path;
        items = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            String[]columns = line.split("\t");
            items.add(columns[0]);
            line = br.readLine();
        }
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
