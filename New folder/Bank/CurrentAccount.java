package Bank;

public class CurrentAccount extends Account {
	
	private String tinNumber;
	
	public void settinNumber(String t)
	{
		tinNumber = t;
	}
	public String gettinNumber()
	{
		return tinNumber;
	}
	CurrentAccount()
	{
		
	}
	 CurrentAccount(String accName,String accNo,String bankName,String tinNumber)
	 {
		 super();
		 this.tinNumber = tinNumber;
	 }

}
