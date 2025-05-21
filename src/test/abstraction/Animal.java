package test.abstraction;

public abstract class Animal {


    private int age;
    private String name;

    public abstract void sayHello();

    public void sleep(){
        System.out.println("zzz");
    }
}
