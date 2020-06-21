package songs;

import java.util.Scanner;

import cell_phone.Contact;

public class AlbumTest {
	private static Scanner scanner = new Scanner(System.in);
	private static Album album = new Album();
	
	public static void main(String[] args) {
		
		boolean stop = false;
		printActions();
		
		
		
		while(!stop) {
			System.out.println("\n Enter action: (5 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("\nShutting down..");
				stop = true;
				break;
			case 1:
				album.showSongs();
				break;
			case 2:
				addNewSong();
				break;
			case 3:
				updateSong();
				break;
			case 4:
				removeSong();
				break;
			case 5:
				album.playSong();
				break;
			case 6:
				album.playSong();
				break;
			case 7:
				album.previousSong();
				break;
			case 8:
				album.nextSong();
				break;
			}
			
			
		}
	}
	
	private static void addNewSong() {
		System.out.println("Enter new song: ");
		String title = scanner.nextLine();
		System.out.println("Enter song duration: ");
		String duration = scanner.nextLine();
		Song newSong = Song.createSong(title, duration);
		if(album.addPlayList(newSong)) {
			System.out.println("New song added: " + title + ", Duration "+ duration );
		}
		else {
			System.out.println("Cannot add "+ title + " already on file");
		}
		
	}
	private static void updateSong() {
		System.out.println("Enter existing song title: ");
		String song = scanner.nextLine();
		Song existingSong = album.querySong(song);
		if(existingSong == null) {
			System.out.println("Song not found.");
			return;
		}
		
		System.out.print(" Enter new song title: ");
		String newTitle = scanner.nextLine();
		System.out.print("Enter new song duration : ");
		String newDuration = scanner.nextLine();
		Song newSong = Song.createSong(newTitle, newDuration);
		if(album.UpdateSong(existingSong, newSong)) {
			System.out.println("Successfully updated");
		}
		else {
			System.out.println("Error updating record");
		}
		
	
	}
	
	
	private static void removeSong() {
		System.out.println("Enter existing contact name: ");
		String title = scanner.nextLine();
		Song existingSong = album.querySong(title);
		if(existingSong == null) {
			System.out.println("Contact not found.");
			return;
		}
		if(album.removeSong(existingSong)) {
			System.out.println("Sucessfully deleted");
		}
		else {
			System.out.println("Error deleting");
		}
		
	}
	private static void printActions() {
		System.out.println("\nAvailable action: \npress");
		System.out.println(
				"0 -  toshutdown\n"+
				"1 - Play list\n"+
				"2 - to add a new song\n"+
				"3 - to update an existent song\n"+
				"4 - to remove an existent remove\n"+
				"5 - play song\n"+
				"6 - repeat song\n"+
				"7 - previous song\n"+
				"8 - next song\n"
				);
		System.out.println("Choose your action: ");
		
	}
}
