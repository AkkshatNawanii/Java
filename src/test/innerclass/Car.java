package test.innerclass;

public class Car {
    private String model ;
    private boolean isEngineOn;

    public Car( String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println("Engine is starting!! Brrrrrrrrrrrr");
            }else {
                System.out.println("Engine is already on!! Brrrrrrrrrrrr");
            }

        }
        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println("Engine is stopping!! Brrr Brr Br br ...");
            }else {
                System.out.println("Engine is already stopped!! ...");
            }

        }
    }

    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}
