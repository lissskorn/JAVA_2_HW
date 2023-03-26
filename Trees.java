/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author olesiyakorgueva
 */
public class Trees extends Plant {
    
    private int height;
    private String leaves;
    private String garden;
    
    public Trees(int height, String leaves, String garden, String sort, String name, String fruits) {
        super(sort, name, fruits);
        this.height = height;
        this.leaves = leaves;
        this.garden = garden;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public String getLeaves() {
        return leaves;
    }
    
    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }
    
    public String getGarden() {
        return garden;
    }
    
    public void getGarden(String garden) {
        this.garden = garden;
    }
    
    public void askHeight() {
        System.out.println("This " + this.getSort() + " is " + height + " meters tall");
    }
    
    public void findGarden(String person) {
        System.out.println("This " + this.getName() + " grow in " + garden);
    }
    
    public String toString() {
        return "height = " + height + ", leaves = " + leaves + ", garden = " + garden 
                + ", sort = " + getSort() + ", name = " + getName() + ", fruits =  " + getFruits();
    }
}
