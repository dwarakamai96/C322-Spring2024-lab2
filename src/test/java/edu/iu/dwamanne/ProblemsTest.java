package edu.iu.dwamanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {

    @Test
    void problem1() {
        int n = 9;
        boolean expected = true;

        Problems problems = new Problems();
        boolean output = problems.problem1(n);

        assertEquals(expected, output);
    }

    @Test
    void problem2() {
        int n = 9;
        int[] expected = {-1, -1};

        Problems problems = new Problems();
        int[] output = problems.problem2(n);

        assertArrayEquals(expected, output);
    }
}