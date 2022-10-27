public class House {
    private int windows;
    private int door;

    private Room myroom;

    public House(int windows, int door, Room myroom) {
        this.windows = windows;
        this.door = door;
        this.myroom = myroom;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoor() {
        return door;
    }

    public Room getMyroom() {
        return myroom;
    }

}
