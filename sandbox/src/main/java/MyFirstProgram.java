public class MyFirstProgram {

	public static void main (String[] args)
		{
			System.out.println("Hello, world!");

			Point p1 = new Point(3,2);
			Point p2 = new Point(7,8);
			System.out.println("Расстояние между двумя точками на плоскости с координатами (" + p1.a + ", " + p1.b + ")" + " и " + "(" + p2.a + ", " + p2.b + ")" + " равняется " + distance(p1,p2));


		}


		public static double distance (Point p1, Point p2){

			return Math.sqrt(Math.pow((p2.a - p1.a),2) + Math.pow((p2.b - p1.b),2));


		}
}