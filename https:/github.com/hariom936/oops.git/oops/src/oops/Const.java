package oops;
class Std{
	String name;
	int age;
	
	public void printInfo(String name){
		System.out.println(name);
	}	
	public void printInfo(int age){
		System.out.println(age);
	}
	public void printInfo(String name , int age){
		System.out.println(name+ " "+age);
		
	}
}

public class Const {
	public static void main(String[] args) {
		Std s1 = new Std();
		s1.name = "Aman";
		s1.age = 24;
		
		s1.printInfo(s1.name, s1.age);
	}
}
