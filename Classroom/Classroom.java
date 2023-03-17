package Building;

public class Classroom {
    private int roomNumber;
    private double length;
    private double width;
    private boolean lightsOn;
    private boolean doorOpen;

    public Classroom(int roomNumber, double length, double width, boolean lightsOn, boolean doorOpen) {
        this.roomNumber = roomNumber;
        this.length = length;
        this.width = width;
        this.lightsOn = lightsOn;
        this.doorOpen = doorOpen;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return width;
    }

    public boolean areLightsOn() {
        return lightsOn;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public double getSquareFootage() {
        return length * width;
    }

    public void flipLightSwitch() {
        lightsOn = !lightsOn;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void shutDoor() {
        doorOpen = false;
    }

    public String toString() {
        return "Classroom " + roomNumber + " (length: " + length + ", width: " + width + ", lights: " +
                (lightsOn ? "on" : "off") + ", door: " + (doorOpen ? "open" : "closed") + ")";
    }

 
    
}
