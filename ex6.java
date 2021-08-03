import java.util.ArrayList;
import java.awt.Point;

public class ex6 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        Point pt1 = new Point(3, 4);
        list.add( pt1 );
        Point pt2 = (Point) list.get( 0 );
        pt2.x = 23;
        if ( pt2 == pt1 ) {
          System.out.println( "Same object" );
        } else {
          System.out.println( "Different object" );
        }
        System.out.println(pt2);
        System.out.println(pt1);

        //exer2
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(3);
        x.add(5);
        x.add(8);
        x.add(9);

        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(6);
        y.add(7);
        y.add(1);
        y.add(2);

        for (int i=0; i<x.size(); i++) {
        x.set(i, y.get(i));
        y.set(i, x.get(i));
        }

        System.out.println(x);
        System.out.println(y);

        //exer3:Write a static method to get distinct elements from an array.
        //The method returns an ArrayList which contains distinct elements.

        int[] numbers = {25, 2, 5, 9, 10, 15, 8, 2, 5, 9};
        System.out.println(getUnique(numbers));
              
    }
    public static ArrayList<Integer> getUnique(int[] source){
            ArrayList<Integer> uniqueList = new ArrayList<Integer>();
            for (int value: source) {
                    if (!uniqueList.contains(value))
                    uniqueList.add(value);
            }
            return uniqueList;
        }
}