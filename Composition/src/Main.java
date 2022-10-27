public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions= new Dimensions(20,20,5);
//        Case thecase= new Case("220B","Dell","20",dimensions);
//        Resolution resolution= new Resolution(200,250);
//        Motherboard motherboard= new Motherboard("220","DELL",220,3,"XDF");
//
//        Monitor myMonitor= new Monitor("220","DELL",200,resolution);
//        PC thePc= new PC(thecase,myMonitor,motherboard);
//        thePc.getMonitor().drawPixelAt(1500,200,"red");




       // <------------------------Challenge----------------->
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.
        Room myroom= new Room(1,2,3);
        House h= new House(10,20,myroom);
        h.getMyroom().pri();



    }
}