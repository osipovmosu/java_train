public class MyFirstProgram {

	public static void main (String[] args)
		{
			System.out.println("Hello, world!");

			Point p1 = new Point(3,2, 7, 8);

			System.out.println("Расстояние между двумя точками на плоскости с координатами (" + p1.a + ", " + p1.b + ")" + " и " + "(" + p1.c + ", " + p1.d + ")" + " равняется " + p1.distance());
		}
}