package it.saimao.shan_converter.word_sordings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ShanWordSortingStringTest {

    ShanWordSorting shanWordSorting;

    @BeforeEach
    void init() {
        shanWordSorting = new ShanWordSorting();
    }

    @Test
    public void testConsonantComparison() {
        String w1 = "ၵ";
        String w2 = "ၶ";
        assertEquals(w1, ShanWordSorting.compareWordString(w1, w2));
        assertEquals(w1, ShanWordSorting.compareWordString(w2, w1));
    }

    @Test
    public void testMedian() {
        String w1 = "ၶျၢင်း";
        String w2 = "ၶႂၢင်း";
        String w3 = "ၶွင်ႉ";
        String w4 = "ၶြႃႊ";
        assertEquals(w2, ShanWordSorting.compareWordString(w2, w3));
        assertEquals(w2, ShanWordSorting.compareWordString(w3, w2));
        assertEquals(w1, ShanWordSorting.compareWordString(w3, w1));
        assertEquals(w4, ShanWordSorting.compareWordString(w4, w2));
    }


}