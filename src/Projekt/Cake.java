package Projekt;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Cake {
    String[] ingredientsName = {"Eggs", "Sugar", "Cacao", "Flour", "Baking Powder", "Vanilla", "Milk", "Oil Margarine"};
    double[] ingredientsAmount = {5,7.1,1.8,6.5,0.38,0.35,4.29,0.2};
    int totalPeople;
    double totalWeight;
    double totalEnergy = 75.63;
    DecimalFormat grams = new DecimalFormat("0.00");

    public Cake(int totalPeople){
        this.totalPeople = totalPeople;
        setTotalWeight();
        setTotalEnergy();
        setIngredientsGram();
    }

    public double getTotalWeight(){
        return totalWeight;
    }
    public void setTotalWeight(){
        int i;
        totalWeight = 0;
        for(i = 0; i < ingredientsAmount.length; i++){
            totalWeight=totalWeight+(totalPeople * ingredientsAmount[i]);
        }
        totalWeight = totalWeight * 0.90;
    }
    public double getTotalEnergy(){
        return totalEnergy;
    }
    public void setTotalEnergy(){
        totalEnergy *= totalPeople;

    }
    public void setIngredientsGram(){
        int i;
        for(i = 0; i < ingredientsAmount.length; i++){
            ingredientsAmount[i] *= totalPeople;
        }
    }
    public void printIngredientsList(){
        int i;
        String distance = "               ";
        String distance2 = "      ";
        for(i = 0; i < ingredientsAmount.length; i++){
            System.out.println(ingredientsName[i] + ": " + distance.substring(0,distance.length() - ingredientsName[i].length()) +
                    grams.format(ingredientsAmount[i]) +  " Gram");
        }
        System.out.print("\n");
    }

    public String toString(){
        return "Total weight: " + grams.format(totalWeight) +
                "\nTotal Energy: " + grams.format(totalEnergy);
    }
}
