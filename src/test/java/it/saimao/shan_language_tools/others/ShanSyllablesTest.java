package it.saimao.shan_language_tools.others;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShanSyllablesTest {

    @Test
    public void testConvertEngToShanNumber1() {
        String input = "0123456789";
        String expected = "\u1090\u1091\u1092\u1093\u1094\u1095\u1096\u1097\u1098\u1099";
        Assert.assertEquals(expected, ShanSyllables.convertEngToShanNumber(input));
    }

    @Test
    public void testConvertEngToShanNumber2() {
        int input = 1234567890;
        String expected = "\u1091\u1092\u1093\u1094\u1095\u1096\u1097\u1098\u1099\u1090";
        Assert.assertEquals(expected, ShanSyllables.convertEngToShanNumber(input));
    }

    @Test
    public void testIsShanNumber() {
        String input = "႐႑႒႓႔႕႖႗႘႙";
        Assert.assertTrue(ShanSyllables.isShanNumber(input));
        Assert.assertFalse(ShanSyllables.isShanNumber("0123456789"));
    }

    @Test
    public void testIsShanConsonant() {
        String input = "ၵၶငၸသၺတထၼပၽၾမယရလဝႁဢ";
        Assert.assertTrue(ShanSyllables.isShanConsonant(input));
        Assert.assertFalse(ShanSyllables.isShanConsonant("ကခဂဃင"));
    }

    @Test
    public void testConvertShanToEngNumberAsString() {
        String input = "႐႑႒႓႔႕႖႗႘႙";
        String expected = "0123456789";
        Assert.assertEquals(expected, ShanSyllables.convertShanToEngNumberAsString(input));
    }

    @Test
    public void testConvertShanToEngNumberAsInt() {
        String input = "႑႒႓႔႕႖႗႘႙႐";
        int expected = 1234567890;
        Assert.assertEquals(expected, ShanSyllables.convertShanToEngNumberAsInt(input));
    }

    @Test
    public void testConvertShanToEngNumberAsIntException() {

        String input = "ငိုၼ်းၸၢႆႇ ႑႒႓႔႕႖႗႘႙႐";
        Assert.assertThrows(IllegalArgumentException.class, () -> ShanSyllables.convertShanToEngNumberAsInt(input));
    }


}