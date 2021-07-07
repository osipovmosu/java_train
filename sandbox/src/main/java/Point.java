public class Point {

    public double a;
    public double b;
    public double c;
    public double d;

    public Point(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double distance (){

        return Math.sqrt(Math.pow((this.c - this.a),2) + Math.pow((this.d - this.b),2));
    }
}
