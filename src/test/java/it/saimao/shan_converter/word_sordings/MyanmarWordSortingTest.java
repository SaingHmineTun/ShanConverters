package it.saimao.shan_converter.word_sordings;

import it.saimao.shan_converter.breakers.MyanmarSyllableSegmentation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyanmarWordSortingTest {


    MyanmarWordSorting myanmarWordSorting = new MyanmarWordSorting();


    @Test
    void MW_Sorting() {
        String maxWeight = myanmarWordSorting.MW_Sorting("ကစားပွဲ", "ကပွဲ");
        String maxWeight2 = myanmarWordSorting.MW_Sorting("ရခိုင်", "ရှမ်း");
        String maxWeight3 = myanmarWordSorting.MW_Sorting("ရခိုင်း", "ရခိုင်");
        String maxWeight4 = myanmarWordSorting.MW_Sorting("အချစ်ခလေး", "အချစ်ကလေး");
        System.out.println(maxWeight3);
        System.out.println(maxWeight4);
        assertEquals(maxWeight, "ကစားပွဲ");
        assertEquals(maxWeight2, "ရှမ်း");
    }

    @Test
    void test_compareMedianWeight() {
        String maxWeight = myanmarWordSorting.MW_Sorting("ကျွ", "ကြွ");
        assertEquals("ကျွ", maxWeight);
    }

    @Test
    void test_devowelizer() {

        String str = "ခတ္တာ";
        System.out.println(MyanmarSyllableSegmentation.segment(str));
        str = str.substring(1, str.length() - 1);
        System.out.println(str);
    }

}