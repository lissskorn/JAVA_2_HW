/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author olesiyakorgueva
 */
public class GardenTrees extends Trees {
    
    private String fertilizer ;
    private String water;
    private String earth;
    
    public GardenTrees(String fertilizer, String water, String earth, int height, String leaves, String garden, String sort, String name, String fruits) {
        super(height, leaves, garden, sort, name, fruits);
        this.fertilizer = fertilizer;
        this.water = water;
        this.earth = earth;
    }
    
    public String getFertilizer() {
        return fertilizer;
    }
    
    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }
    
    public String getWater() {
        return water;
    }
    
    public void setWater(String water) {
        this.water = water;
    }
    
    public String getEarth() {
        return earth;
    }
    
    public void getEarth(String earth) {
        this.earth = earth;
    }
    
    public void waterPlant() {
        System.out.println("This " + this.getSort() + " need " + water + " liters of water");
    }
    
    public void dripEarth(String drip) {
        System.out.println("This " + this.getName() + " need " + drip + " every month");
    }
    
    public String toString() {
        return "fertilizer = " + fertilizer + ", water = " + water + ", earth = " + earth + ", height = " + getHeight() + ", leaves = " + getLeaves() + ", garden = " + getGarden() 
                + ", sort = " + getSort() + ", name = " + getName() + ", fruits =  " + getFruits();
    }
    
}

