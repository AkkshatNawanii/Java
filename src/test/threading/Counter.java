package test.threading;

public class Counter {

    private int count =0;


/*
    public  void increment(){
        synchronized(this) {
            count++;
        }
    }
*/

    public synchronized void increment(){
            count++;
    }

    public int getCount(){
        return count;
    }
}
