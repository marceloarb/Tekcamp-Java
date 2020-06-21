package songs;


class Song {
	// Attributes
	private String title = "";
	private String duration = "";
	
	//Constructor
	public Song(String title, String duration) {
		this.title = title;
		this.duration = duration;
	}

	public static  Song createSong(String title, String duration) {
		return new Song(title,duration);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}


	
	
	
	
	
	
}
