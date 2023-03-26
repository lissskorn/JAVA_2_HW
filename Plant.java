/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author olesiyakorgueva
 */
public class Plant {
    
    private String sort;
    private String name;
    private String fruits;
    
    public Plant(String sort, String name, String fruits) {
        this.sort = sort;
        this.name = name;
        this.fruits = fruits;
    }
    
    public String getSort() {
        return sort;
    }
    
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFruits() {
        return fruits;
    }
    
    public void setFruits(String fruits) {
        this.fruits = fruits;
    }
    
    public void findLocation(String place) {
        System.out.println(sort + " is located in the " + place);
    }
     public void sayBeatiful(String score) {
         System.out.println("Wow! This " + name + " is so " + score);
     }
     
     public String toString() {
         return "sort = " + sort + ", name = " + name + ", fruits =  " + fruits; 
     }
}

