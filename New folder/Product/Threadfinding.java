package Product;

class Threadfinding extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
		 Threadfinding t1=new Threadfinding();  
		 Threadfinding t2=new Threadfinding();  
	   
	//  t1.start(); 
	  t2.run();
	  t2.run();
	  t2.start();
	  
	//  t2.start();  
	 }
}