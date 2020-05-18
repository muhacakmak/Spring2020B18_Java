package day40_Encapsulation;

public class Person {
    public String name;
    private long SNN;
    private int ID;

    public Person(String name) {
        this.name = name;
    }
    public long getSNN() {
        return SNN;
    }
    public void setSNN(long SNN) {
        this.SNN = SNN;
    }

    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }

}
