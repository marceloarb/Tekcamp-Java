package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
	private static String glue = "Epoxy";
	String jello = "Jello";
	public static void main(String[] args) {
		
		Statically  statically = new Statically();
		statically.moveAndShake();
		stubborn(statically);
		explain(statically);
		
	}
	public void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }
	public static void stubborn(Statically statically) {
		statically.moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }
	
	public static void explain(Statically statically) {
		stubborn(statically);
        System.out.println(glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }
	
	
	
}
