package OCA.Task01;

/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch

 */
public  class Cat extends Animal {
    String catName;

    public Cat(String catName, int age,String gender){
        this.catName=catName;
        this.gender=gender;
        this.age=age;

    }

//    @Override
//    public void eat(){
//        System.out.println("Cat "+catName+" is eating");
//    }
    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }
    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }

    @Override
    public String toString() {
        return
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}
