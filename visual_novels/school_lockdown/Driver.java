/* Michael Wilson 
 * CBGames inc. */

import java.util.*;
/* Used for the purpose of scanner */
import java.io.*;
public class Driver {
	/* List of files to be read through */
	public static final String[] CHARACTERS = {"Characters"};

	/* Keeps track of the list of students */
	private ArrayList<Student> students;

	{
		students = new ArrayList<Student>();
	}

	public static void main(String[] args) throws FileNotFoundException {		
		parseMainCharacters(CHARACTERS[0]); 
	}

	private static void parseMainCharacters(String theFile) throws FileNotFoundException {
		Scanner read = new Scanner(new File(theFile + ".txt"));

		while(read.hasNextLine()){
			// format: name, gender, age
			
			String[] info = read.nextLine().split("[|]");
			
			Student student = new Student(info[0], info[1], Integer.parseInt(info[2]));
		}
	}
}