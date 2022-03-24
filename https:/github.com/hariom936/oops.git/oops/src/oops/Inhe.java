package oops;
// base class
class Shape{
	String color;
	public void area() {
		System.out.println("display area : "); 
	}
}
//single inheritance
class Triangle extends Shape{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
// multiple inheritance
class EquliateralTriangle extends Triangle{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}
//Hierarchical inheritance
class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}

public class Inhe {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.color = "red";
	}

}
