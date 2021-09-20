package Projekt;

public class Room {
    public static void main(String[] args) {
        Lamp bedroomLamp = new Lamp();
        Lamp kitchenLamp = new Lamp();
        Lamp livingRoomLamp = new Lamp();


        System.out.println("\n* Lyset i soveværelset er " + bedroomLamp + " *");
        System.out.println("Nøj hvor er der mørkt her i soverværelset...");
        System.out.println("*Bruger trykker på kontakten*");
        bedroomLamp.trykPåKontakt();
        System.out.println("Lyset på soveværelset er " + bedroomLamp);


        System.out.println("\n* Lyset i køkkenet er " + kitchenLamp + " *");
        System.out.println("Nøj hvor er der mørkt her i køkkenet...");
        System.out.println("*Bruger trykker på kontakten*");
        kitchenLamp.trykPåKontakt();
        System.out.println("Lyset på soveværelset er " + kitchenLamp);

        System.out.println("\n* Lyset i stuen er " + livingRoomLamp + " *");
        System.out.println("Nøj hvor er der mørkt her i stuen...");
        System.out.println("*Bruger trykker på kontakten*");
        livingRoomLamp.trykPåKontakt();
        System.out.println("Lyset i stuen er " + livingRoomLamp);

        System.out.println("\nLyset på soveværelset er " + bedroomLamp +
                "\nLyset i køkkenet er " + kitchenLamp +
                "\nLyset i stuen er " + livingRoomLamp);

        System.out.println("Slukker lige stuen");
        livingRoomLamp.trykPåKontakt();
        System.out.println("\nLyset på soveværelset er " + bedroomLamp +
                "\nLyset i køkkenet er " + kitchenLamp +
                "\nLyset i stuen er " + livingRoomLamp);


}


}
