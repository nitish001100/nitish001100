package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class RectanglesOverlap {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        /**
         l1      r1

         l2      r2
         **/

        Point p1 = new Point(0, 10);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(10, 0);
        Point p4 = new Point(15, 0);

        boolean overlap = checkOverLaps(p1, p2, p3, p4);
        System.out.println(overlap);
    }

    public static boolean checkOverLaps(Point p1, Point p2, Point p3, Point p4) {
        if (p1.x >= p2.x || p2.x >= p1.x)
            return false;

        if (p1.y <= p2.y || p2.y <= p1.y)
            return false;

        return true;
    }
}
