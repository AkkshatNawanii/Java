package test;

import test.statictest.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       operator();
//       stringCode();
//        arrayCode();
//        classCode();
//        System.out.println(factorial(4));
    }

    public static void operator () {
        Student student = new Student();
        student.setName("Ram");
        student.setAddress("Nali ke paar");
        student.setRollNo(1);
        student.setStandard(5);

        System.out.println(student.getName());

        String x = "Ram";
        String b = new String("Ram");
        String c = "Ram";
        System.out.println(x == c );
        int a = 1;

        System.out.println(a-- + --a + ++a +  ++a  + a++);
    }

    public static void stringCode(){
        String name = "This name";
        int length = name.length();
        String name2 = "this NamE";
        char  c = name.charAt(length-1);

        System.out.println(c);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        String str1 = "remote";
        String str2 = "car";

        int i = str1.compareTo(str2);
        System.out.println(i);

        String name3 = "Amar Panchal";
        String substring = name3.substring(5,8);
        System.out.println(substring);
    }

    public static void arrayCode(){
        int[] arr = new int[20] ;
        int[] arr1 = {72, -15, 34, 89, -62, 53, 21, -8, 11, 93, -27, 58, 44, -18, 67, 10};
        String s = "this is a string";
        int res = Integer.MIN_VALUE;
        for( int nums: arr1){
            if (nums > res){
                res = nums;
            }

        }
        System.out.println("Largest Number is :" + res);

    }

    public static void classCode(){
        Car car = new Car();
        car.setColor("blue");
        car.setBrand("Yonda");
        car.setName("Mity");
        car.setSpeed(0);
        car.setYear(1995);

        car.accelerate(10);
        System.out.println("Current speed is: " + car.getSpeed());
        car.brake(4);
        System.out.println("Current speed is: " + car.getSpeed());

    }

    public static int factorial( int n) {
        if( n == 1 ) {
            return 1;
        }
        return n * factorial( n - 1);
    }

}