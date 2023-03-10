package classroom;

public class Main {

	 public static void main(String[] args) {
	        Classroom classroom = new Classroom(101, 10.5, 8.5, false, true);
	        System.out.println(classroom);
	        System.out.println("Square footage: " + classroom.getSquareFootage());
	        classroom.flipLightSwitch();
	        classroom.openDoor();
	        System.out.println(classroom);
	    }

}
