package Projekt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KageTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat grams = new DecimalFormat("#.00");
        Cake tempCake = new Cake();

        System.out.println("Velkommen til kage opskrifteren2000\nHvor mange ingredienser vil du have? (Max. " + tempCake.ingredientsAmount1.length +")");
        int userAmount1 = sc.nextInt();
        if(userAmount1 > tempCake.ingredientsAmount1.length){
            System.out.println("Wow du indtastede " + tempCake.ingredientsAmount1.length);
            userAmount1 = tempCake.ingredientsAmount1.length;
        }

        System.out.println("Hvor mange personer er kagen til?");
        int userAmount2 = sc.nextInt();
        Cake cake = new Cake(userAmount2,userAmount1);

        int userChoice;
        boolean cakeMenu = true;
        while(cakeMenu){
            System.out.println("""
                    Vælg en kategori:
                    1: Kages Vægt
                    2: Kages Energi
                    3: Kages Ingredientser
                    4: toString
                    0: Afslut program""");
            userChoice = sc.nextInt();
            if(userChoice == 1){
                System.out.println("Vægten af kagen er: " + grams.format(cake.getTotalWeight()) + " gram\n");
            }
            if(userChoice == 2){
                System.out.println("Den samlede energi i kagen er: " + grams.format(cake.getTotalEnergy()) + " kcal\n");
            }
            if(userChoice == 3){
                cake.printIngredientsList();
                System.out.println("\n");
            }
            if(userChoice == 0){
                System.out.println("Afslutter");
                cakeMenu = false;
            }
            if(userChoice == 4){
                System.out.println(cake);
            }
        }
    }
}
