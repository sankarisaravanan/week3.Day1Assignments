package week3Day1Assignment3;

public class AxisBank extends BankInfo{
	
	public void deposit(String acctName){
		
		System.out.println("Inside Method deposit under class AxisBank with argument AccountName : "+acctName);
		
	}
	
	public static void main(String[] args) {
		AxisBank bank1=new AxisBank();
		
		System.out.println("*************Methods from class BankInfo****************");
		bank1.deposit();
		bank1.fixed();
		bank1.savings();
		
		System.out.println("******************Methods from class AxisBank***************");
		bank1.deposit("Sankari");

	}

}
