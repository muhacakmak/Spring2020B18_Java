package day40_Encapsulation.Day42;

public class TestDate {
    /*
    Name
    ID
     */
    private String name = "Bekir";//the data is not visible to other class
    private int ID = 897;

    public String getName() {// read the private data
        return name;
    }
    public int getID() {
        return ID;
    }
    // setter : to change the value
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID){
        this.ID=ID;

    }
}