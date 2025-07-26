abstract class Shape
{
	void displayShapeType(String shape)
	{
		System.out.println(shape);
	}
	abstract void area();
}
class Circle extends Shape{
	int r;
	Circle(int r1)
	{
		r = r1;
	}
	
	void area()
	{
		
		System.out.println("Area of circle = " + (3.14 * r * r));
	}
	
}
class Rectangle extends Shape{
	int l;
	int b;
	Rectangle(int l1,int b1){
		l=l1;
		b=b1;
	}
	void area()
	{
		System.out.println("Area of rectangle = " + (l*b));
	}
	
}
public class Task1 {
	public static void main(String[] args) {
		
		Circle obj = new Circle(3);
		obj.displayShapeType("circle");
		obj.area();
		
		Rectangle obj1 = new Rectangle(3,5);
		obj1.displayShapeType("Rectangle");
		obj1.area();
		
		
		
	}

}
