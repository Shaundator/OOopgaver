package Projekt;

public class Lamp {
    boolean tændt;
    private int count;
    static int count1;

    public int getCount(){
        return count;
    }

    public void trykPåKontakt(){
        tændt= !tændt;
        count++;
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
