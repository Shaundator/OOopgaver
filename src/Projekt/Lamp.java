package Projekt;

public class Lamp {
    boolean tændt;

    public void trykPåKontakt(){
        tændt= !tændt;
    }

    public boolean lampeStatus(){
        return tændt;
    }


    public String toString(){
        if(tændt) {
            return "tændt";
        }
        else{
            return "slukket";
        }
    }
}
