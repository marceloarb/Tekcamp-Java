package songs;

import java.util.ArrayList;

class Album {
	
	private ArrayList<Song> mySongs;

	public Album() {
		this.mySongs = new ArrayList<Song>();
	}
	
	
	
	public boolean addPlayList(Song song) {
		if(findSong(song.getTitle()) > 0) {
			System.out.println("Song is already on play list");
			return false;
		}
		mySongs.add(song);
		return true;
	}

	private int findSong(Song song) {
		return this.mySongs.indexOf(song);
		
	}
	private int findSong(String songTitle) {
		for(int i = 0; i<this.mySongs.size(); i++){
			Song song = this.mySongs.get(i);
			if(song.getTitle().equals(songTitle)) {
				return i;
			}
		}
		return -1;
	}
	
	public void showSongs() {
		System.out.println("Play List");
		for(int i = 0; i<this.mySongs.size(); i++) {
			System.out.println("Title: "+ this.mySongs.get(i).getTitle() + ", Duration: " + this.mySongs.get(i).getDuration());
		}
	}
	
	public  boolean UpdateSong(Song oldSong, Song newSong) {
		int foundPosition = findSong(oldSong);
		if(foundPosition < 0) {
			System.out.println(oldSong.getTitle() + ", was not found");
			return false;
		}
		else if(findSong(newSong.getTitle()) != -1) {
			System.out.println("Song title  " + newSong.getTitle() + " already exists. Update was not secessfull");
			return false;
		}
		
		this.mySongs.set(foundPosition, newSong);
		System.out.println(oldSong.getTitle()+ ", was replaced with" + newSong.getTitle());
		return true;
	}
	
	public String querySong(Song song) {
		if(findSong(song)>=0) {
			return song.getTitle();
		}
		return null;
	}
	
	public Song querySong(String title) {
		int position = findSong(title);
		if(position >=0) {
			return this.mySongs.get(position);
			
		}
		return null;
				
	}
	
	public void playSong() {
		System.out.println("Song playing: ");
		i = 0;
			System.out.println("Title: " + this.mySongs.get(i).getTitle() + ", Duration: " + this.mySongs.get(i).getDuration());
	}
	int i = 0;
	public void previousSong() {
		System.out.println("Previous song playing: ");
		if(i == 0) {
			System.out.println("Title: " + this.mySongs.get(i).getTitle() + ", Duration: " + this.mySongs.get(i).getDuration());
			
		}else {
			System.out.println("Title: " + this.mySongs.get(i).getTitle() + ", Duration: " + this.mySongs.get(i).getDuration());
		i = i -1;}
	}
	public void nextSong() {
		System.out.println("Next song playing: ");
		
			System.out.println("Title: " + this.mySongs.get(i+1).getTitle() + ", Duration: " + this.mySongs.get(i).getDuration());
		i = i +1;
	}
	
	
	public boolean removeSong(Song song) {
		int foundPosition = findSong(song);
		if(foundPosition < 0) {
			System.out.println(song.getTitle() + ", was not found");
			return false;
		}
		
		this.mySongs.remove(foundPosition);
		System.out.println(song.getTitle()+ ", was replaced with" + song.getTitle());
		return true;
	}
}
