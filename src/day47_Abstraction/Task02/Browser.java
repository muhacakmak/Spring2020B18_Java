package day47_Abstraction.Task02;
/*
1. create an abstract class called Browser
					attribues: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
 */
public abstract class Browser {
    public String browserName;
    public abstract void get(String URL);
    public abstract String close();
    public abstract String maximize();


}
