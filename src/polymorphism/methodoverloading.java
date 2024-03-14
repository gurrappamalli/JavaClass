package polymorphism;
class adition{
	public void add() {
		System.out.println("no Value");
	}
	public void add(int l, int k, int m) {
		System.out.println("the additional value="+(l+k -m));
	}
	public void add(int i, int j) {
		System.out.println("the additional value="+( i+j));
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adition ad= new adition();
		ad.add();
		ad.add(10,10,20);
		ad.add(50,30);
	}

}
