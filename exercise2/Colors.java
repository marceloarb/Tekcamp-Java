package exercise2;

import java.util.ArrayList;

public class Colors {
	
	public static ArrayList<String> hasColor = new ArrayList<String>();

	String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.
    	//discard all the other strings.  If no strings start with a color in the input array, return an empty array.
		for(int i = 0; i<strings.length; i++) {
    		if(strings[i].contains("blue")) {
    			hasColor.add(strings[i]);
    		}
    		if(strings[i].contains("yellow")) {
    			hasColor.add(strings[i]);
    		}
    		if(strings[i].contains("black")) {
    			hasColor.add(strings[i]);
    		}
    		if(strings[i].contains("green")) {
    			hasColor.add(strings[i]);
    		}
    		if(strings[i].contains("pink")) {
    			hasColor.add(strings[i]);
    		}
    		if(strings[i].contains("red")) {
    			hasColor.add(strings[i]);
    		}
    		else {
    			
    		}
    		
    			
		        }
        return strings;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
        for(int i=0; i<hasColor.size(); i++) {
        	 System.out.println(hasColor.get(i));
        }
       
        
    }


}