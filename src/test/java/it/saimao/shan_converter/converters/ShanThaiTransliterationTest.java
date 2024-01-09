package it.saimao.shan_converter.converters;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShanThaiTransliterationTest {

    @Test
    public void shan2Thai_Consonant_Test() {
        String shan = "ၵၶင ၸသၺ တထၼ ပၽၾ မယရ လဝႁ ဢ";
        System.out.println("Shan : " + shan);
        String thai = ShanThaiTransliterationKt.shan2thai_script(shan);
        System.out.println("Thai : " + thai);
        String shan2 = ShanThaiTransliterationKt.thai2shan_script(thai);
        System.out.println("Shan again : " + shan2);
        assertEquals(shan, shan2);
    }

}
