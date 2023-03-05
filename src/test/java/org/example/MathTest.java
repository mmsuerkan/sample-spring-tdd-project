package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;


class MathTest {

    private static Math math;

    @BeforeAll
    static void setUp() {
        math = new Math();
    }

    @Test
    void sum() {
        assertEquals(3, math.sum(1, 2));
    }

    @Test
    void sumWithZero() {
        assertEquals(3, math.sum(-5, 3));
    }

    @Test
    void Diff(){
        assertEquals(2,math.diff(4,2));
    }
    @Test
    void sampleTest(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        assertThat(list,hasItem(1));
    }

}