public class Vehicle {
//    private int wheels;
    private int speed;
    private String name;
    private int size;
    private int handSteering;
    private String color;

    public Vehicle( int speed, String name, int size, String color, int handSteering) {
        this.handSteering=handSteering;
        this.speed = speed;
        this.name = name;
        this.size = size;
        this.color = color;
    }
    public void increaseSpeed(int speed){
        System.out.println("Increasing speed by"+ speed);
    }

}
