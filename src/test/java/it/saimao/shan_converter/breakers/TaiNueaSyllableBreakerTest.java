package it.saimao.shan_converter.breakers;

import org.junit.Assert;
import org.junit.Test;

public class TaiNueaSyllableBreakerTest {

    @Test
    public void test_segment_with_tone() {
        String input = "ᥖᥥᥲᥘᥭᥴᥑᥪᥢᥲᥛᥫᥰᥞᥩᥖᥲᥗᥪᥒᥴᥙᥣᥭᥚᥨᥭᥰᥞᥣᥳ";
        String output = TaiNueaSyllableBreaker.syllable_break(input);
        Assert.assertEquals("ᥖᥥᥲ ᥘᥭᥴ ᥑᥪᥢᥲ ᥛᥫᥰ ᥞᥩᥖᥲ ᥗᥪᥒᥴ ᥙᥣᥭ ᥚᥨᥭᥰ ᥞᥣᥳ", output);
    }

    @Test
    public void test_segment_without_tone() {
        String input = "ᥖᥥᥘᥭᥑᥪᥢᥛᥫᥞᥩᥖᥗᥪᥒᥙᥣᥭᥚᥨᥭᥞᥣ";
        String output = TaiNueaSyllableBreaker.syllable_break(input);
        Assert.assertEquals("ᥖᥥ ᥘᥭ ᥑᥪᥢ ᥛᥫ ᥞᥩᥖ ᥗᥪᥒ ᥙᥣᥭ ᥚᥨᥭ ᥞᥣ", output);
    }

    @Test
    public void test_segment1() {
        String input = """
                ᥒᥣᥝᥰᥘᥣᥭᥰᥛᥣᥢᥲᥛᥫᥒᥰᥐᥩᥲ ᥓᥧᥛᥰᥟᥨᥭᥰᥘᥤᥴᥘᥦᥲ sspp ᥖᥥᥴᥞᥭᥱᥐᥢᥴᥕᥝᥳᥑᥣᥲᥕᥨᥝᥳ. ᥖᥤᥲᥢᥛᥳᥙᥣᥢᥰᥢᥛᥳᥔᥩᥢᥰ ᥟᥢᥴ sspp ᥑᥝᥴᥕᥧᥱᥝᥭᥳᥢᥢᥳ ᥘᥭᥲᥒᥤᥢᥰᥑᥣᥝᥴᥝᥭᥳᥝᥣᥲ ᥞᥬᥲᥙᥣᥭᥐᥣᥱᥖᥤᥲᥘᥩᥖᥲᥚᥥᥰᥢᥭᥴᥝᥣᥱ. ᥖᥤᥲᥗᥧᥒᥳᥛᥣᥝᥰᥢᥭᥳᥖᥥᥳ ᥐᥨᥢᥰᥖᥭᥰᥖᥧᥐᥳᥑᥣᥳᥞᥦᥒᥰᥢᥣᥱᥑᥣᥲ. ᥙᥤᥲᥢᥩᥒᥳᥑᥣᥲᥖᥤᥲᥢᥛᥳᥑᥛᥰᥐᥩᥲ ᥛᥣᥰᥕᥧᥱᥖᥤᥲᥞᥫᥢᥰᥑᥣᥲ ᥙᥩᥰᥘᥭᥲ 3 ᥝᥨᥒᥴᥙᥣᥭᥴᥕᥝᥳ
                """.strip();
        String output = TaiNueaSyllableBreaker.syllable_break(input);
        Assert.assertEquals("""
                ᥒᥣᥝᥰ ᥘᥣᥭᥰ ᥛᥣᥢᥲ ᥛᥫᥒᥰ ᥐᥩᥲ ᥓᥧᥛᥰ ᥟᥨᥭᥰ ᥘᥤᥴ ᥘᥦᥲ s s p p ᥖᥥᥴ ᥞᥭᥱ ᥐᥢᥴ ᥕᥝᥳ ᥑᥣᥲ ᥕᥨᥝᥳ . ᥖᥤᥲ ᥢᥛᥳ ᥙᥣᥢᥰ ᥢᥛᥳ ᥔᥩᥢᥰ ᥟᥢᥴ s s p p ᥑᥝᥴ ᥕᥧᥱ ᥝᥭᥳ ᥢᥢᥳ ᥘᥭᥲ ᥒᥤᥢᥰ ᥑᥣᥝᥴ ᥝᥭᥳ ᥝᥣᥲ ᥞᥬᥲ ᥙᥣᥭ ᥐᥣᥱ ᥖᥤᥲ ᥘᥩᥖᥲ ᥚᥥᥰ ᥢᥭᥴ ᥝᥣᥱ . ᥖᥤᥲ ᥗᥧᥒᥳ ᥛᥣᥝᥰ ᥢᥭᥳ ᥖᥥᥳ ᥐᥨᥢᥰ ᥖᥭᥰ ᥖᥧᥐᥳ ᥑᥣᥳ ᥞᥦᥒᥰ ᥢᥣᥱ ᥑᥣᥲ . ᥙᥤᥲ ᥢᥩᥒᥳ ᥑᥣᥲ ᥖᥤᥲ ᥢᥛᥳ ᥑᥛᥰ ᥐᥩᥲ ᥛᥣᥰ ᥕᥧᥱ ᥖᥤᥲ ᥞᥫᥢᥰ ᥑᥣᥲ ᥙᥩᥰ ᥘᥭᥲ 3 ᥝᥨᥒᥴ ᥙᥣᥭᥴ ᥕᥝᥳ
                """.strip(), output);
    }

}