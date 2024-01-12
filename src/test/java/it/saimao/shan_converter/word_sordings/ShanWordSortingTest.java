package it.saimao.shan_converter.word_sordings;

import it.saimao.shan_converter.others.ShanSyllables;
import org.junit.Test;

public class ShanWordSortingTest {

    ShanSyllables shanWordSorting = new ShanSyllables();
    @Test
    public void printAllShanWords() {
        shanWordSorting.getEveryPossibleShanWordThatWeCanWriteDown();
    }

}