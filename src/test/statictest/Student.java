package test.statictest;

public class Student {
    // properties
    private String name;
    private String address;
    private int  standard;
    private int rollNo;
    private int age;

    private static int count = 0;

    public Student(){
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ){
            age = 0;
        }
        this.age = age;
    }

}
