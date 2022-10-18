public class Car extends Vehicle{
    private int lights;
    private int wheels;
    private String model;
    public Car( int speed, String name, int size, String color,int lights,int wheels, String model,int handsteering) {

        super(speed, name, size, color,handsteering);
        this.model=model;
        this.wheels=wheels;
        this.lights=lights;
    }
    public void increaseSpeed(int speed){
        System.out.println("Increase of car called");
        super.increaseSpeed(speed);
    }


}
