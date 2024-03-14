package javaclass;


class X {
	public void x1() {
		System.out.println(" am gj");
	}
		
}
class Y extends X {
	public void y1() {
		System.out.println(" am y1j");
	}
		
}
class z extends Y{
	public void z1() {
		System.out.println(" am z1");
	}
		
}
public class multi_levelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		x.x1();
		System.out.println("KJwdnk");
       Y y = new Y();
       y.y1();
       y.x1();
       System.out.println("KJwdnk");
       
     z z = new z();
       z.x1();
       z.y1();
       z.z1();
       System.out.println("KJwdnk");
       
       
       
	}

}
