package javaclass;

public class gun {

 String gunname;
 int noofBulets;
 public gun(String gunname, int noofBulets) {
	 this.gunname=gunname;
	 this.noofBulets=noofBulets;
	 

	}
 public void shoot(){
	 for(int i=1;i<=noofBulets;i++) {
		 System.out.println("firee");
	 }
	 
 }

}
