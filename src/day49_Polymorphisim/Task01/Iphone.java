package day49_Polymorphisim.Task01;

public final class Iphone extends Phone implements AppleApps {
    static {
    brand="Apple";
    }

    public Iphone( String model, double price,String size) {
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading apps from " + AppStoreName);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to " + phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling to " + phoneNumber);
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Iphone is face timing to "+phoneNumber);
    }
}
/*
  5. create a class named iPhone that can inherit from AppleApps interface
actions that every iphone can do: texting(), calling(), faceTiming(), selfie()
 */