package Encapsulation;

public class demotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo d = new Demo();
      d.show();
       d.display();

      int n = d.id();
     System.out.println( "the id value");
     int n1 = d.examfee();
     System.out.println( "the examfee");
     d.callvalue(40);
	}

}
