package bank;

public class BankTest {
	public static void main(String[]  args) {
	
    Bank bank = new Bank("Chase");
    if (bank.addBranch("chase")) {
    	System.out.println("Branch is created");
    }

    bank.addCustomer("Chase", "Marcelo", 10.000);
    


}

}
