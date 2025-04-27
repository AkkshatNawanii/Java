package test;

public class Car {
    private String brand;
    private String name;
    private String color;
    private int year;
    private int speed;

    public void accelerate(int increment){
        speed += increment;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void brake(int decrement) {
        if(speed == 0 || speed < 0 ){
            speed = 0 ;
            return;
        }
        speed -= decrement;

    }
}
