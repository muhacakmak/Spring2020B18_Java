package day35_Static.review;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;




    public void setOfferInfo(String location,String company,double salary,boolean isFullTime){

        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;

    }

    public String toString(){
        return "Location: "+location
                +", Company: " +company
                +", Salary: $"+salary
                + ", Is full time: " +isFullTime;
    }


}
