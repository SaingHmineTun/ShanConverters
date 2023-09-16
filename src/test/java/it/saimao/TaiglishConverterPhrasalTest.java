package it.saimao;

import org.junit.Test;

import static it.saimao.TaiglishConverter.taiToEng;
import static org.junit.Assert.assertEquals;

public class TaiglishConverterPhrasalTest {
    @Test
    public void Test1() {
        assertEquals("ka kha nga za sa nya ta tha na pa pha fa ma ya ra la wa ha a",
                taiToEng("ၵၶငၸသၺတထၼပၽၾမယရလဝႁဢ"));
        assertEquals("ka waa kai kaup tai mai noe kaun", taiToEng("ၵဝႃၵႆ ၵွပ်တႆမႆၼိူဝ်ၵွၼ်"));
        assertEquals("kha waa khai me man pai maa ngaum", taiToEng("ၶဝႃၶႆ မႄမၼ်ပႆမႃငွမ်"));
        assertEquals("theng taun nueng nga waa ngu loen maa zu to khaet", taiToEng("ထႅင်တွၼ်ၼိုင် ငဝႃငူ လိူၼ်မႃၸူတူဝ်ၶဵတ်"));
        assertEquals("za waa zaang pai ung aang zaum taang kha", taiToEng("ၸဝႃၸၢင် ပႆဢုင်ဢၢင်ၸွမ်တၢင်ၶ"));
        assertEquals("a waa aui zaem zaui zaui kin waan", taiToEng("ဢဝႃဢွႆ ၸဵမ်ၸွႆၸွႆၵိၼ်ဝၢၼ်"));
    }
}
