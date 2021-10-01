package Product;
public class ItemType {
    private String name;
    private Double deposit;
    private Double costPerDay;
    
    ItemType(){
        
    }
    ItemType(String name,double deposit, double costPerDay){
        name=name;
        deposit=deposit;
        costPerDay=costPerDay;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Double getdeposit(){
        return deposit;
    }
    public void setDeposit(double deposit){
        this.deposit=deposit;
    }
    public Double getCostPerDay(){
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay){
        this.costPerDay=costPerDay;
    }
    
    public String toString(){
        return name+'\t'+'\t'+deposit+'\t'+'\t'+costPerDay;
    }
    //write your code here
}