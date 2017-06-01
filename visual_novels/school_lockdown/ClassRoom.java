/* Michael Wilson
 * CBGames */

public ClassRoom {
	/* Keeps track of the normality status of the room */
	private boolean normal;

	/* The subject matter of this class */
	private String subject;

	/* Floor corresponding to this room */
	private int floor;

	/* Capacity of the room */
	private int capacity;

	/* Constructs a class room 
	 * 
	 * @param subject The subject that goes along with this classroom
	 * @param capacity The number of people that may fit into this room 
	 * @param floor The floor that this room is on*/
	public ClassRoom(String subject, int capacity, int floor) {
		this.subject = subject;
		this.capacity = capacity;
		this.floor = floor;
		normal = true;
	}

	/* Method that toggles formality */
	public void toggleNormality() {
		normal = !normal;
	}

	/* Gets the normality of this room 
	 *
	 * @return String describing normality */
	public String normality() {
		return normal ? "normal" : "abnormal";
	}

	/* Gets the subject of this room 
	 * 
	 * @return The subject */
	public String getSubject() {
		return subject;
	}

	/* Gets the capacity of this room 
	 * 
	 * @return The maximum amount of people that may be allowed in the room */
	public int getCapacity() {
		return capacity;
	}



}
