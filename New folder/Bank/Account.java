package Bank;

public class Account {
	protected String accName,accNo,bankName;
	
	public void setaccName(String na)
	{
		accName = na;	
	}
	public void setaccNo(String n)
	{
		accName = n;	
	}
	public void setbankName(String b)
	{
		accName = b;	
	}
	public String getaccName()
	{
		return accName;
	}
	public String getaccNo()
	{
		return accNo;
	}
	public String getbankName()
	{
		return bankName;
	}
	protected void Display()
	{
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}
	

}
