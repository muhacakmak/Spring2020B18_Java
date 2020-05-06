package day34_CustomClass.WarmUPTask;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost() {
        double totalPrice = (width + length )* unitPrice;
        if (!isPersian) {
            return totalPrice;
        } else {
            return totalPrice+200;
        }
    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;

    }

    public String toString() {
        return "Width: " + width +
                "\nLength: " + length +
                "\nUnit Price: $" + unitPrice +
                "\nTotal Cost: $" + calcCost();
    }

}
