package it.saimao.shan_converter.breakers;

import org.junit.Test;

import static java.util.function.Predicate.isEqual;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TaiLeSyllableSegmentationTest {

    @Test
    public void test_segment_with_tone() {
        String input = "ᥖᥥᥲᥘᥭᥴᥑᥪᥢᥲᥛᥫᥰᥞᥩᥖᥲᥗᥪᥒᥴᥙᥣᥭᥚᥨᥭᥰᥞᥣᥳ";
        String output = TaiLeSyllableSegmentation.segmentAsStringWithDelimiter(input, " ");
        System.out.println(output);
    }

    @Test
    public void test_segment_without_tone() {
        String input = "ᥖᥥᥘᥭᥑᥪᥢᥛᥫᥞᥩᥖᥗᥪᥒᥙᥣᥭᥚᥨᥭᥞᥣ";
        String output = TaiLeSyllableSegmentation.segmentAsStringWithDelimiter(input, "|");
        System.out.println(output);
    }

    @Test
    public void test_segment1() {
//        String input = "ᥙᥥᥢᥴᥞᥪᥴᥐᥩᥲ ᥓᥣᥭᥰᥖᥥᥴᥘᥣᥖᥲᥢᥦᥴ ᥘᥩᥒᥲᥟᥢᥴᥙᥤᥲ ᥞᥐᥳᥛᥦᥢᥢᥫᥴᥢᥩᥒᥳᥕᥝᥳ၊ ᥢᥩᥒᥳᥞᥣᥒᥘᥤ ᥓᥣᥭᥰᥞᥐᥳᥢᥩᥒᥳ ᥘᥨᥢᥳᥘᥫᥴᥢᥣᥱᥕᥝᥳ။";
        String input = "ᥒᥣᥝᥰᥘᥣᥭᥰᥛᥣᥢᥲᥛᥫᥒᥰᥐᥩᥲ ᥓᥧᥛᥰᥟᥨᥭᥰᥘᥤᥴᥘᥦᥲ sspp ᥖᥥᥴᥞᥭᥱᥐᥢᥴᥕᥝᥳᥑᥣᥲᥕᥨᥝᥳ\n" +
                "ᥖᥤᥲᥢᥛᥳᥙᥣᥢᥰᥢᥛᥳᥔᥩᥢᥰ ᥟᥢᥴ sspp ᥑᥝᥴᥕᥧᥱᥝᥭᥳᥢᥢᥳ ᥘᥭᥲᥒᥤᥢᥰᥑᥣᥝᥴᥝᥭᥳᥝᥣᥲ ᥞᥬᥲᥙᥣᥭᥐᥣᥱᥖᥤᥲᥘᥩᥖᥲᥚᥥᥰᥢᥭᥴᥝᥣᥱ \n" +
                "ᥖᥤᥲᥗᥧᥒᥳᥛᥣᥝᥰᥢᥭᥳᥖᥥᥳ ᥐᥨᥢᥰᥖᥭᥰᥖᥧᥐᥳᥑᥞᥦᥒᥰᥢᥣᥱᥑᥣᥲ\n" +
                "ᥙᥤᥲᥢᥩᥒᥳᥑᥣᥲᥖᥤᥲᥢᥛᥳᥑᥛᥰᥐᥩᥲ ᥛᥣᥰᥕᥧᥱᥖᥤᥲᥞᥫᥢᥰᥑᥣᥲ ᥙᥩᥰᥘᥭᥲ 3 ᥝᥨᥒᥴᥙᥣᥭᥴᥕᥝᥳ";
        String output = TaiLeSyllableSegmentation.segmentAsStringWithDelimiter(input, "|");
        System.out.println(output);
    }

}