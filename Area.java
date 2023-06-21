
import java.io.*;
class Shape {

	static final double PI = Math.PI;
	
	void Area(float a)
	{
		float A = a * a;
		System.out.println("Area of the Square: " + A);
	}
	void Area(double a)
	{
		double A = PI * a * a;
		System.out.println("Area of the Circle: " + A);
	}

	
	void Area(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A);
	}
}

class Area{
	public static void main(String[] args)
	{
		Shape obj = new Shape();
		obj.Area(10.5);
		obj.Area(3);
		obj.Area(5, 4);
	}
}

