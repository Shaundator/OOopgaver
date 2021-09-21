package Projekt;

import java.text.DecimalFormat;

public class Cake {
    String[] ingredientsName1 = {"Eggs", "Sugar", "Cacao", "Flour", "Baking Powder", "Vanilla", "Milk", "Oil Margarine"};
    double[] ingredientsAmount1 = {5,7.1,1.8,6.5,0.38,0.35,4.29,0.2};
    String[] ingredientsName;
    double[] ingredientsAmount;
    int totalPeople;
    double totalWeight;
    double totalEnergy = 75.63;
    DecimalFormat grams = new DecimalFormat("0.00");
    public Cake(){}
    public Cake(int totalPeople,int totalIngredients){
        this.totalPeople = totalPeople;
        ingredientsName = new String[totalIngredients];
        ingredientsAmount = new double[totalIngredients];
        inputIngredientsName();
        inputIngredientsAmount();
        setTotalWeight();
        setTotalEnergy();
        setIngredientsGram();
    }

    public void inputIngredientsAmount(){
        int i;
        for(i = 0; i < ingredientsAmount.length; i++){
            ingredientsAmount[i] = ingredientsAmount1[i];
        }
    }
    public void inputIngredientsName(){
        int i;
        for(i = 0; i < ingredientsName.length; i++){
            ingredientsName[i] = ingredientsName1[i];
        }
    }
    public double getTotalWeight() {
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

