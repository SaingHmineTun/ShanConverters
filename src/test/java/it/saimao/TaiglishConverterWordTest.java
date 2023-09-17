package it.saimao;

import org.junit.Test;

import static it.saimao.TaiglishConverter.taiToEng;
import static org.junit.Assert.*;


public class TaiglishConverterWordTest {

    @Test
    public void Test1() {
        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        assertEquals("tsa", taiToEng("ၸ"));
        assertEquals("kha", taiToEng(" ၶ"));
        assertEquals("nga", taiToEng("င "));
        assertEquals("kya", taiToEng("ၵျ"));
        assertEquals("khya", taiToEng("ၶျ"));
        assertEquals("kra", taiToEng("ၵြ"));
        assertEquals("pa\u030ca", taiToEng("ပႃ"));
        assertEquals("pa\u0301a", taiToEng("ပႃး"));

        assertEquals("sra\u030ca", taiToEng("သြႃ"));
        assertEquals("pya\u030ca", taiToEng("ပျႃ"));
        assertEquals("wa\u030ca", taiToEng("ဝႃ"));
        assertEquals("thi\u030ci", taiToEng("ထီ"));
        assertEquals("thi\u0301i", taiToEng("ထီး"));
        assertEquals("ri\u030ci", taiToEng("ရီ"));
        assertEquals("ha\u030ce", taiToEng("ႁေ"));
        assertEquals("ha\u0301e", taiToEng("ႁေး"));
        assertEquals("me\u030c", taiToEng("မႄ"));
        assertEquals("me\u0301", taiToEng("မႄး"));
        assertEquals("fu\u030c", taiToEng("ၾူ"));
        assertEquals("fu\u0301", taiToEng("ၾူး"));
        assertEquals("so\u030c", taiToEng("သူဝ်"));
        assertEquals("so\u0301", taiToEng("သူဝ်း"));
        assertEquals("la\u030cu", taiToEng("လေႃ"));
        assertEquals("la\u0301u", taiToEng("လေႃး"));
        assertEquals("kya\u030cu", taiToEng("ၵျေႃ"));
        assertEquals("kya\u0301u", taiToEng("ၵျေႃး"));
        assertEquals("lu\u030ce", taiToEng("လိုဝ်"));
        assertEquals("lu\u0301e", taiToEng("လိုဝ်း"));
        assertEquals("yo\u030ce", taiToEng("ယိူဝ်"));
        assertEquals("yo\u0301e", taiToEng("ယိူဝ်း"));
    }

    @Test
    public void Test2() {
//        assertEquals("hap", taiToEng("ႁပ်"));
        // မ် ၊ ၼ် ၊ င်
        // ဢမ် ၊ ဢၢမ် ၊ ဢိမ် ၊ ဢဵမ် ၊ ဢႅမ် ၊ ဢုမ် ၊ ဢူမ် ၊ ဢွမ် ၊ ဢိုမ် ၊ ဢိူမ်
        assertEquals("ya\u030cm", taiToEng("ယမ်"));
        assertEquals("la\u030cn", taiToEng("လၼ်"));
        assertEquals("la\u0301n", taiToEng("လၼ်း"));
        assertEquals("la\u030cam", taiToEng("လၢမ်"));
        assertEquals("la\u0301am", taiToEng("လၢမ်း"));
        assertEquals("tsi\u030cng", taiToEng("ၸိင်"));
        assertEquals("tsi\u0301ng", taiToEng("ၸိင်း"));
        assertEquals("pa\u030cen", taiToEng("ပဵၼ်"));
        assertEquals("pa\u0301en", taiToEng("ပဵၼ်း"));
        assertEquals("the\u030cng", taiToEng("ထႅင်"));
        assertEquals("the\u0301ng", taiToEng("ထႅင်း"));
        assertEquals("ku\u030cn", taiToEng("ၵုၼ်"));
        assertEquals("ku\u0301n", taiToEng("ၵုၼ်း"));
        assertEquals("no\u030cm", taiToEng("ၼူမ်"));
        assertEquals("no\u0301m", taiToEng("ၼူမ်း"));
        assertEquals("ha\u030cum", taiToEng("ႁွမ်"));
        assertEquals("ha\u0301um", taiToEng("ႁွမ်း"));
        assertEquals("khu\u030cen", taiToEng("ၶိုၼ်"));
        assertEquals("khu\u0301en", taiToEng("ၶိုၼ်း"));
        assertEquals("pho\u030cen", taiToEng("ၽိူၼ်"));
        assertEquals("pho\u0301en", taiToEng("ၽိူၼ်း"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ၊ ဢၢဝ် ၊ ဢိဝ် ၊ ဢဵဝ် ၊ ဢႅဝ် ၊ ဢႂ်
        assertEquals("kha\u030co", taiToEng("ၶဝ်"));
        assertEquals("kha\u0301o", taiToEng("ၶဝ်း"));
        assertEquals("nga\u030co", taiToEng("ငဝ်"));
        assertEquals("nga\u0301o", taiToEng("ငဝ်း"));
        assertEquals("ka\u030cao", taiToEng("ၵၢဝ်"));
        assertEquals("ka\u0301ao", taiToEng("ၵၢဝ်း"));
        assertEquals("li\u030co", taiToEng("လိဝ်"));
        assertEquals("li\u0301o", taiToEng("လိဝ်း"));
        assertEquals("pha\u030ceo", taiToEng("ၽဵဝ်"));
        assertEquals("pha\u0301eo", taiToEng("ၽဵဝ်း"));
        assertEquals("khe\u030cao", taiToEng("ၶႅဝ်"));
        assertEquals("khe\u0301ao", taiToEng("ၶႅဝ်း"));
        assertEquals("tha\u030cue", taiToEng("ထႂ်"));
        assertEquals("tha\u0301ue", taiToEng("ထႂ်း"));
    }

    @Test
    public void Test4() {
        // ၵႆ ၊ ၵၺ်
        assertEquals("kha\u030ci", taiToEng("ၶႆ"));
        assertEquals("kha\u0301i", taiToEng("ၶႆး"));
        assertEquals("kha\u1dc8i", taiToEng("ၶႆႊ"));
        assertEquals("wa\u030ci", taiToEng("ဝႆ"));
        assertEquals("ka\u030cai", taiToEng("ၵၢႆ"));
        assertEquals("ka\u0301ai", taiToEng("ၵၢႆး"));
        assertEquals("lu\u030ci", taiToEng("လုၺ်"));
        assertEquals("lu\u0301i", taiToEng("လုၺ်း"));
        assertEquals("kho\u030ci", taiToEng("ၶူၺ်"));
        assertEquals("kho\u0301i", taiToEng("ၶူၺ်း"));
        assertEquals("kha\u030cui", taiToEng("ၶွႆ"));
        assertEquals("kha\u0301ui", taiToEng("ၶွႆး"));
        assertEquals("tsu\u030cei", taiToEng("ၸိုၺ်"));
        assertEquals("tsu\u0301ei", taiToEng("ၸိုၺ်း"));
        assertEquals("wo\u030cei", taiToEng("ဝိူၺ်"));
        assertEquals("wo\u0301ei", taiToEng("ဝိူၺ်း"));
    }

    @Test
    public void Test5() {
        // ႂ
        assertEquals("khwa\u030ca", taiToEng("ၶႂႃ"));
        assertEquals("khwa\u0301a", taiToEng("ၶႂႃး"));
        assertEquals("kwa\u030cai", taiToEng("ၵႂၢႆ"));
        assertEquals("kwa\u0301ai", taiToEng("ၵႂၢႆး"));
        assertEquals("khwa\u030cang", taiToEng("ၶႂၢင်"));
        assertEquals("khwa\u0301ang", taiToEng("ၶႂၢင်း"));
        assertEquals("kwa\u030cam", taiToEng("ၵႂၢမ်"));
        assertEquals("kwa\u0301am", taiToEng("ၵႂၢမ်း"));
        assertEquals("swa\u030cang", taiToEng("သႂၢင်"));
    }


    @Test
    public void Test6() {
        // ပ် ၊ တ် ၊ ၵ်
        // ဢပ် ၊ ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
        assertEquals("pa\u030cp", taiToEng("ပပ်"));
        assertEquals("pa\u0301p", taiToEng("ပပ်း"));
        assertEquals("lát", taiToEng("လတ်း"));
        assertEquals("la\u030cat", taiToEng("လၢတ်"));
        assertEquals("la\u0301at", taiToEng("လၢတ်း"));
        assertEquals("thi\u030cp", taiToEng("ထိပ်"));
        assertEquals("thi\u0301p", taiToEng("ထိပ်း"));
        assertEquals("sa\u030cep", taiToEng("သဵပ်"));
        assertEquals("sa\u0301ep", taiToEng("သဵပ်း"));
        assertEquals("we\u030cp", taiToEng("ဝႅပ်"));
        assertEquals("we\u0301p", taiToEng("ဝႅပ်း"));
        assertEquals("tu\u030cp", taiToEng("တုပ်"));
        assertEquals("tu\u0301p", taiToEng("တုပ်း"));
        assertEquals("ngo\u030cp", taiToEng("ငူပ်"));
        assertEquals("ngo\u0301p", taiToEng("ငူပ်း"));
        assertEquals("la\u030cuk", taiToEng("လွၵ်"));
        assertEquals("la\u0301uk", taiToEng("လွၵ်း"));
        assertEquals("tu\u030cek", taiToEng("တိုၵ်"));
        assertEquals("tu\u0301ek", taiToEng("တိုၵ်း"));
        assertEquals("po\u030cek", taiToEng("ပိူၵ်"));
        assertEquals("po\u0301ek", taiToEng("ပိူၵ်း"));
    }


}
