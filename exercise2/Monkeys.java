package exercise2;

class Monkeys {

    boolean monkeyBusiness(Monkey[] monkeys) {
    //BONUS EXERCISE
    //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.
	//Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.
	//If it is a tie, return true.  
        return true;
    }

    static class Monkey { 
    	String name;
        boolean smile;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isSmile() {
			return smile;
		}
		public void setSmile(boolean smile) {
			this.smile = smile;
		}
        
    	
       
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.  
    	Monkey Rafigi = new Monkey();
    	Monkey George = new Monkey();
    	Monkey KingKong = new Monkey();
    	Rafigi.setName("Rafigi");
    	Rafigi.setSmile(true);
    	George.setName("Curious George");
    	George.setSmile(true);
    	KingKong.setName("King Kong");
    	KingKong.setSmile(false);
    	
    	
        Monkey[] monkeyList = {Rafigi,George,KingKong};
        int smiling = 0;
        int notSmiling = 0;
        for(int i = 0; i<monkeyList.length; i++) {
        	 if(monkeyList[i].isSmile()) {
        		 smiling +=1;
        	 }
        	 else {
        		 notSmiling +=1;
        	 }
        }
        if(smiling>=notSmiling) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
        
       
        
    }

    
}