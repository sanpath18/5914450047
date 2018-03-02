package triangle;

//This file is taken from hcoles/triangle-example
public class Triangle {

    public static TriangleType classify(final int a, final int b, final int c) {
        int trian;
        trian = 0;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("TriangleType.INVALID");
            return TriangleType.INVALID;
        } else {
            if (a == b) {
                System.out.println("a == b");
                trian = trian + 1;
                System.out.println("trian = " + trian);
            }
            if (a == c) {
                System.out.println("a == c");
                trian = trian + 2;
                System.out.println("trian = " + trian);
            }
            if (b == c) {
                System.out.println("b == c");
                trian = trian + 3;
                System.out.println("trian = " + trian);
            }
            if (trian == 0) {
                if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                    return TriangleType.INVALID;
                } else {
                    return TriangleType.SCALENE;
                }
            } else if (trian > 3) {
                System.out.println("trian > 3");
                System.out.println("TriangleType.EQUILATERAL");
                return TriangleType.EQUILATERAL;
            } else if ((trian == 1) && ((a + b) > c)) {
                System.out.println("(trian == 1) && ((a + b) > c)");
                System.out.println("TriangleType.ISOSCELES");
                return TriangleType.ISOSCELES;
            } else if ((trian == 2) && ((a + c) > b)) {
                System.out.println("(trian == 2) && ((a + c) > b)");
                System.out.println("TriangleType.ISOSCELES");
                return TriangleType.ISOSCELES;
            } else if ((trian == 3) && ((b + c) > a)) {
                System.out.println("(trian == 3) && ((b + c) > a)");
                System.out.println("TriangleType.ISOSCELES");
                return TriangleType.ISOSCELES;
            }
        }
        return TriangleType.INVALID;
    }
}