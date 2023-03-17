package Building;

public class Building {
	
	Classroom Classrooms[];
	public Building() {
		//int roomNumber, double length, double width, boolean lightsOn, boolean doorOpen
	    this.Classrooms = new Classroom[] {new Classroom(2, 3, 4, true, true), new Classroom(3, 4, 5, true, true)};
		
		//easier approach below, same as line 8 but more wordy
// 		this.Classrooms = new Classroom[2] ;
// 		this.Classrooms[0]=new Classroom(2, 3, 4, true, true);
// 		this.Classrooms[1]=new Classroom(3, 4, 5, true, true);
	}
	public Classroom getLargestClassroom() {
		Classroom largestClassroom=null;
		int largestRoom=0;
		for (Classroom i : Classrooms){
			if (i.getSquareFootage()>largestRoom) {
				largestClassroom=i;
				largestRoom=i.getRoomNumber();
			}
		}
		return largestClassroom;
	}
	
	public int CountRoomsWithLightsOn() {
		int numberOfRoomsWithLightsOn=0;
		for (Classroom i : Classrooms){
			if (i.areLightsOn()==true) {
				numberOfRoomsWithLightsOn+=1;
			}
		}
		return numberOfRoomsWithLightsOn;
		

		
	}
	public void closeAllDoors() {
		for (Classroom i : Classrooms){
			i.shutDoor();
		}
	}
}
