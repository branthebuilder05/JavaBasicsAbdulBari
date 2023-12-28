import java.util.*;
public class Main
{
     static class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {

        return this.x-o.x;
    }
     public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
    
    
	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 			TreeSet<Integer> t=new TreeSet<>(List.of(1,5,2,8,3));
// 		System.out.println(t);

  Point p1 = new Point(2,6);
    Point p2 = new Point(4,8);
    Point p3 = new Point(1,6);
    TreeSet<Point> t=new TreeSet<>();
    t.add(p1);
    t.add(p2);
    t.add(p3);
    	System.out.println(t);
    
	
	}
}
