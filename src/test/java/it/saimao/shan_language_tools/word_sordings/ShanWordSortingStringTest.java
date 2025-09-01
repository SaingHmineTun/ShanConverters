package it.saimao.shan_language_tools.word_sordings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShanWordSortingStringTest {

    ShanWordSorting shanWordSorting;

    @BeforeEach
    void init() {
        shanWordSorting = new ShanWordSorting();
    }

    @Test
    public void testConsonant() {
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

    @Test
    public void testConsonantVsMedian() {
        String w1 = "ၶလေး";
        String w2 = "ၶျၢင်း";
        assertEquals(w2, ShanWordSorting.compareWordString(w1, w2));
        assertEquals(w2, ShanWordSorting.compareWordString(w2, w1));
    }

    @Test
    public void testVowel() {
        String w1 = "ၶႃး";
        String w2 = "ၶီႇ";
        assertEquals(w1, ShanWordSorting.compareWordString(w2, w1));
        String w3 = "ၶူဝ်";
        String w4 = "ၶေႃ";
        assertEquals(w3, ShanWordSorting.compareWordString(w3, w4));
        String w5 = "ဢႄ";
        String w6 = "ဢိူဝ်";
        assertEquals(w5, ShanWordSorting.compareWordString(w6, w5));
    }

    @Test
    public void testTones1() {
        String w1 = "မီငိုၼ်း", w2 = "မီးငိုၼ်း";
        assertEquals(w1, ShanWordSorting.compareWordString(w2, w1));
//        w1 = "မီးငိုၼ်ႈ"; w2 = "မီးငိုၼ်";
//        assertEquals(w2, ShanWordSorting.compareWordString(w1, w2));
    }

    @Test
    public void testVowelWithTones() {
        String w1 = "ၵႃး";
        String w2 = "ၵႃႉ";
        assertEquals(w1, ShanWordSorting.compareWordString(w2, w1));

        String w3 = "ၶီႇ";
        String w4 = "ၶီႈ";
        assertEquals(w3, ShanWordSorting.compareWordString(w3, w4));
    }

    @Test
    public void testVowelArrI() {
        String w1 = "ဢႃ";
        String w2 = "ဢီ";
        assertEquals(w1, ShanWordSorting.compareWordString(w1, w2));
        assertEquals(w1, ShanWordSorting.compareWordString(w2, w1));
    }

    @Test
    public void testVowelVsMedian() {
        String w1 = "ၶျႃး";
        String w2 = "ၶီႇ";
        assertEquals(w1, ShanWordSorting.compareWordString(w1, w2));
    }

    @Test
    public void testVowelization() {
        String w1 = "ၶူၵ်";
        String w2 = "ၶုၵ်";
        assertEquals(w2, ShanWordSorting.compareWordString(w2, w1));
    }

    @Test
    public void testDeVowelization() {
        String w1 = "မၢၵ်ႇၵမ်ႇ";
        String w2 = "မၢၵ်ႇၵႅမ်ႈ";
        assertEquals(w1, ShanWordSorting.compareWordString(w1, w2));
    }

    @Test
    public void test() {
        String w1 = "ႁူဝ်ၸႂ်";
        String w2 = "ပူႇသၽႃႇဝ";
        assertEquals(w2, ShanWordSorting.compareWordString(w1, w2));
        w1 = "ပူႇၼၢႆး";
        w2 = "ပူႇမွၼ်ႇ";
        assertEquals(w1, ShanWordSorting.compareWordString(w1, w2));
    }


}