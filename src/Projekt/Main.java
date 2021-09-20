package Projekt;

public class Main {

    public static void main(String[] args) {

        //Person Opgave
        Person person1 = new Person("Oliver",22);
        System.out.println(person1.getAlder());
        System.out.println("Tillykke!");
        person1.hasBirthday();
        System.out.println("Du er nu " + person1.getAlder() + " år");
        System.out.println("Tillykke!");
        person1.hasBirthday();
        System.out.println("Du er nu " + person1.getAlder() + " år!");
        System.out.println(person1);

        //Terning Opgave
        Dice dice = new Dice();
        dice.roll();
        System.out.println("Terningkast:");
        System.out.println("Du kastede en " + dice.getFaceValue());
        int diceValue = 0;
        System.out.println("Fem kast i streg:");
        for(int i = 1; i <= 5; i++){
            dice.roll();
            diceValue = diceValue + dice.getFaceValue();
            System.out.println(i + ": " + dice.getFaceValue());
        }
        System.out.println("Total sum af kast: " + diceValue);

        //Lampe Opgave
        Lamp lamp = new Lamp();
        System.out.println("\nLampe :o ?");
        System.out.println(lamp.lampeStatus());
        System.out.println("\nTrykker på kontakten");
        lamp.trykPåKontakt();
        System.out.println(lamp.lampeStatus());
        System.out.println(lamp);
        System.out.println("\nTrykker på kontakten 2");
        lamp.trykPåKontakt();
        System.out.println(lamp.lampeStatus());
        System.out.println(lamp);
        System.out.println("\nTrykker på kontakten 3");
        lamp.trykPåKontakt();
        System.out.println(lamp.lampeStatus());
        System.out.println(lamp);

        //Kage Opgave
        //Jeg satte den ind i "KagerTester" for at gøre den lidt mere overskuelig at se



    }
}
