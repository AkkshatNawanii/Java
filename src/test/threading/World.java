package test.threading;

public class World implements Runnable {

    final int SIZE;
    final int START;


    public  World(int start ,int size){
        START = start;
        SIZE = size;
    }
    @Override
    public void run(){
        for(int i = START ; i < SIZE; i++ ){
            System.out.println("Count: " + i);
        }
    }
}
