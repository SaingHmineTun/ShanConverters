package it.saimao;

import org.junit.Test;

import static it.saimao.TaiglishConverter.taiToEng;
import static org.junit.Assert.assertEquals;

public class TaiglishConverterPhrasalTest {
    @Test
    public void Test1() {
        assertEquals("kwaammaan", taiToEng("ၵႂၢမ်မၢၼ်"));
    }
}
