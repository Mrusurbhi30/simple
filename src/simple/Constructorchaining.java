package simple;

public class Constructorchaining {
	
	
public Constructorchaining (int a,boolean c) {
	System.out.println("cons.1 is running");
	
}
public Constructorchaining (boolean c,int a) {
	this(20,true);
	System.out.println("cons.2 is running");
}
public static void main(String[]args) {
	new Constructorchaining(false,20);
}
}
