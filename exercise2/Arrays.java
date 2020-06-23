package exercise2;

class Arrays {
	
    //Take the arrays.js file, and refactor the code into Java in this file.
    
    public static void main(String[] args) {
    int[] nums = {10,23,3,4,5,2,1};
    String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};
    	printNums(nums);
    	printGreetings(greetings);
    	printBinaries(binaries);
    }
    static void printNums(int[] nums) {
    	for(int i = 0; i<nums.length; i++ ) {
    		System.out.println(nums[i]);
    	}
    };
    static void printGreetings(String[] greetings) {
    	for(int i = 0; i<greetings.length; i++ ) {
    		System.out.println(greetings[i]);
    	}
    };
    static void printBinaries(boolean[] binaries) {
    	for(int i = 0; i<binaries.length; i++ ) {
    		System.out.println(binaries[i]);
    	}
    };
}







