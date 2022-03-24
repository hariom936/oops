package oops;
class Pen{
	String color;
	String type;
	
	public void write() {
	 System.out.println("writing....");
	}
	public void printColor() {
		System.out.println(this.color);
	}
	public void printType() {
		System.out.println(this.type);
	}
}
class Student{
	String name;
	int age;
	public void printInfo() {
		System.out.print(this.name);
		System.out.print(this.age);
	}
	//constructor
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class Class {
	public static void main(String[] args) {
		/*Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		Pen pen2 = new Pen();
		pen2.color="black";
		pen2.type ="ballpoint";
		
		pen1.printColor();
		pen1.printType();
		pen2.printColor();
		pen2.printType();*/
		Student s1 = new Student("Aman    ",45);
		
		
		s1.printInfo();
	}

}
