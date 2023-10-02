package assignment;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {9, 5, 4, 0, 3, 1};

        ArrayFlattenerService flattenerService = new MockArrayFlattenerService();
        ArrayReversor reversor = new ArrayReversor(flattenerService);

        int[] result = reversor.reverseArray(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] input = null;

        ArrayFlattenerService flattenerService = new MockArrayFlattenerService();
        ArrayReversor reversor = new ArrayReversor(flattenerService);

        int[] result = reversor.reverseArray(input);

        assertNull(result);
    }

}