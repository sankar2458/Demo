package Exam;

class Book
{
    private String code;
	private String title;
	private String author;
	private double price;
	private String category;
	
	public Book() { }
    
    public void setcode(String code){
        this.code = code;
    }
    
    public String getcode(){
        return code;
    }
     public void settitle(String title){
        this.title = title;
    }
    
    public String gettitle(){
        return title;
    }
     public void setauthor(String author){
        this.author = author;
    }
    
    public String getauthor(){
        return author;
    }
     public void setcategory(String category){
        this.category = category;
    }
    
    public String getcategory(){
        return category;
    }
     public void setprice(double price){
        this.price = price;
    }
    
    public double getprice(){
        return price;
    }
	
    public Book(String code, String title, String author, double price, String category)
    {
       this.code = code;
       this.title = title;
       this.author = author;
       this.price = price;
       this.category = category; 
    }
}