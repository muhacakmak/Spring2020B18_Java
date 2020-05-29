package day40_Encapsulation;

public class Encapsulation {
    private long SSN = 123;


    // getter : read only
    public long getSSN() {// read only

        return SSN;
    }

    // setter : write only
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
}


class testtt {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setSSN(2356);
        System.out.println(obj.getSSN());
    }
}
