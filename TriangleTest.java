package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void testEquilateral() {
        TriangleType type = Triangle.classify(12, 12, 12);
        assertEquals(TriangleType.EQUILATERAL, type);
    }

    @Test
    void testScalene() {
        TriangleType type = Triangle.classify(7, 15, 12);
        assertEquals(TriangleType.SCALENE, type);
    }

    @Test
        //(trian == 1) && ((a + b) > c)
    void testIsosceles1() {
        TriangleType type = Triangle.classify(9, 9, 15);
        assertEquals(TriangleType.ISOSCELES, type);
    }
    @Test
        //(trian == 2) && ((a + c) > b)
    void testIsosceles2() {
        TriangleType type = Triangle.classify(9, 15, 9);
        assertEquals(TriangleType.ISOSCELES, type);
    }
    @Test
        //(trian == 3) && ((b + c) > a)
    void testIsosceles3() {
        TriangleType type = Triangle.classify(9, 15, 15);
        assertEquals(TriangleType.ISOSCELES, type);
    }

    @Test
    void testInvalid() {
        TriangleType type = Triangle.classify(-9, 15, 9);
        assertEquals(TriangleType.INVALID, type);
    }

}
