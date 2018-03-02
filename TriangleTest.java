package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    void testEquilateral() {
        TriangleType type = Triangle.classify(1, 1, 1);
        assertEquals(TriangleType.EQUILATERAL, type);
    }

}
