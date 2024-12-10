package pkg2;
import pkg3.MyPackage1011;
class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}
public class lab10 {
    
	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		mypack1.display();
		
	}
    
    
}
