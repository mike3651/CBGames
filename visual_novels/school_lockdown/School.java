/* Michael Wilson
 * CBGames */

// DEFAULT SCHOOL NAME: KYOTO HIGH
import java.util.*;
import java.io.*;
public class School {
	/* Keeps track of the student body count */
	private int studentCount;

	/* Keeps track of the schools name */
	private String name;

	/* Reference to the normal classrooms */
	private ArrayList<ClassRoom> normal;

	/* Reference to the abnormal classrooms */
	private ArrayList<ClassRoom> abnormal;


	/* Constructs a school object 
	 * 
	 * @param name The name of the school
	 * @param count The current student body count 
	 * @param rooms Rooms that exist in the school */
	public School(String name, int count) {
		this.name = name;
		studentCount = count;
		parseRooms();
	}

	/* Method that deals with the creations of the classrooms */
	private void parseRooms() throws FileNotFoundException{
		Scanner read = new Scanner(new File("School.txt"));
		while(read.hasNextLine()) {
			// format: subject, capacity, floor
			String[] info = read.nextLine().split("[|]");
			ClassRoom room = new ClassRoom(info[0], Integer.parseInt(info[1]), 
				Integer.parseInt(info[2]));
			normal.add(room);
		}
	}
}