package assignment;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

public class ArrayFlattenerTest {


    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};
        int[] result = ArrayFlattener.flattenArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] input = null;
        int[] result = ArrayFlattener.flattenArray(input);
        assertNull(result);
    }



}