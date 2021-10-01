package New;

public class Hall {
	private String name,contactNumber,ownerName;
    private Double costPerDay;
    public Hall(){
        
    }
    public Hall(String name,String contactNumber,double costPerDay,String ownerName)
    {
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getContactNumber()
    {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public double getCostPerDay()
    {
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay)
    {
        this.costPerDay=costPerDay;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public void setOwnerName(String ownerName)
    {
        this.ownerName=ownerName;
    }
}