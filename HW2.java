/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hw2;

import java.util.Scanner;
/**
 *
 * @author olesiyakorgueva
 */
public class HW2 {

    public static void main(String[] args) {
    System.out.println("Вариант 4, РИБО-04-21, Коргуева Олеся");
    Scanner myObj = new Scanner(System.in);
    System.out.println("Plant, Tree or Garden tree? ");
    String plantType = myObj.nextLine();
    
    System.out.println("What sort? ");
    String sort = myObj.nextLine();
    
    System.out.println("What name? ");
    String name = myObj.nextLine();
    
    System.out.println("Does it have fruits? ");
    String fruits = myObj.nextLine();
    
    if (plantType.equals("Plant")){
        Plant plant = new Plant(sort, name, fruits);
        System.out.println(plant.toString());
        }
    
    else if (plantType.equals("Tree")){
        System.out.println("What tree height? ");
        int height = Integer.parseInt(myObj.nextLine());

        System.out.println("Trees have leaves or needles ? ");
        String leaves = myObj.nextLine();

        System.out.println("Is this tree a garden tree or not?");
        String garden = myObj.nextLine();
        
        Trees plant = new Trees(height, leaves, garden, sort, name, fruits);
        System.out.println(plant.toString());
    }
       
    else if (plantType.equals("Garden tree")){
        System.out.println("What tree height? ");
        int height = Integer.parseInt(myObj.nextLine());

        System.out.println("Trees have leaves or needles ? ");
        String leaves = myObj.nextLine();

        System.out.println("Is this tree a garden tree or not?");
        String garden = myObj.nextLine();
        
        System.out.println("What fertilizers? ");
        String fertilizer = myObj.nextLine();

        System.out.println("How often to water?");
        String water = myObj.nextLine();

        System.out.println("How often to dig?");
        String earth = myObj.nextLine();
        
        GardenTrees plant = new GardenTrees(fertilizer, water, earth,
                height, leaves, garden, sort, name, fruits);
        System.out.println(plant.toString());
    }
    }
}