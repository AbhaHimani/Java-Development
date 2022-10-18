public class MiniCooper extends Car{
    private String version;
    private String sports;

    public MiniCooper(int speed, String name, int size, String color, int lights, int wheels, String model,int handsteering) {


        super(speed, name, size, color, lights, wheels, model,handsteering);
        this.sports=sports;
        this.version=version;

    }
    public void increaseSpeed(int speed){
        System.out.println("Move ahead by "+ speed);
        super.increaseSpeed(speed);

    }
}
