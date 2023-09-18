package it.saimao.shan_converter.converters;

import org.junit.Assert;
import org.junit.Test;


public class ShanTranslitWordTest {

    @Test
    public void Test1() {
        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        Assert.assertEquals("tsa", ShanTranslit.taiToEng("ၸ"));
        Assert.assertEquals("kha", ShanTranslit.taiToEng(" ၶ"));
        Assert.assertEquals("nga", ShanTranslit.taiToEng("င "));
        Assert.assertEquals("kya", ShanTranslit.taiToEng("ၵျ"));
        Assert.assertEquals("khya", ShanTranslit.taiToEng("ၶျ"));
        Assert.assertEquals("kra", ShanTranslit.taiToEng("ၵြ"));
        Assert.assertEquals("pa\u030ca", ShanTranslit.taiToEng("ပႃ"));
        Assert.assertEquals("pa\u0301a", ShanTranslit.taiToEng("ပႃး"));

        Assert.assertEquals("sra\u030ca", ShanTranslit.taiToEng("သြႃ"));
        Assert.assertEquals("pya\u030ca", ShanTranslit.taiToEng("ပျႃ"));
        Assert.assertEquals("wa\u030ca", ShanTranslit.taiToEng("ဝႃ"));
        Assert.assertEquals("thi\u030ci", ShanTranslit.taiToEng("ထီ"));
        Assert.assertEquals("thi\u0301i", ShanTranslit.taiToEng("ထီး"));
        Assert.assertEquals("ri\u030ci", ShanTranslit.taiToEng("ရီ"));
        Assert.assertEquals("ha\u030ce", ShanTranslit.taiToEng("ႁေ"));
        Assert.assertEquals("ha\u0301e", ShanTranslit.taiToEng("ႁေး"));
        Assert.assertEquals("me\u030c", ShanTranslit.taiToEng("မႄ"));
        Assert.assertEquals("me\u0301", ShanTranslit.taiToEng("မႄး"));
        Assert.assertEquals("fu\u030c", ShanTranslit.taiToEng("ၾူ"));
        Assert.assertEquals("fu\u0301", ShanTranslit.taiToEng("ၾူး"));
        Assert.assertEquals("so\u030c", ShanTranslit.taiToEng("သူဝ်"));
        Assert.assertEquals("so\u0301", ShanTranslit.taiToEng("သူဝ်း"));
        Assert.assertEquals("la\u030cu", ShanTranslit.taiToEng("လေႃ"));
        Assert.assertEquals("la\u0301u", ShanTranslit.taiToEng("လေႃး"));
        Assert.assertEquals("kya\u030cu", ShanTranslit.taiToEng("ၵျေႃ"));
        Assert.assertEquals("kya\u0301u", ShanTranslit.taiToEng("ၵျေႃး"));
        Assert.assertEquals("lu\u030ce", ShanTranslit.taiToEng("လိုဝ်"));
        Assert.assertEquals("lu\u0301e", ShanTranslit.taiToEng("လိုဝ်း"));
        Assert.assertEquals("yo\u030ce", ShanTranslit.taiToEng("ယိူဝ်"));
        Assert.assertEquals("yo\u0301e", ShanTranslit.taiToEng("ယိူဝ်း"));
    }

    @Test
    public void Test2() {
//        assertEquals("hap", taiToEng("ႁပ်"));
        // မ် ၊ ၼ် ၊ င်
        // ဢမ် ၊ ဢၢမ် ၊ ဢိမ် ၊ ဢဵမ် ၊ ဢႅမ် ၊ ဢုမ် ၊ ဢူမ် ၊ ဢွမ် ၊ ဢိုမ် ၊ ဢိူမ်
        Assert.assertEquals("ya\u030cm", ShanTranslit.taiToEng("ယမ်"));
        Assert.assertEquals("la\u030cn", ShanTranslit.taiToEng("လၼ်"));
        Assert.assertEquals("la\u0301n", ShanTranslit.taiToEng("လၼ်း"));
        Assert.assertEquals("la\u030cam", ShanTranslit.taiToEng("လၢမ်"));
        Assert.assertEquals("la\u0301am", ShanTranslit.taiToEng("လၢမ်း"));
        Assert.assertEquals("tsi\u030cng", ShanTranslit.taiToEng("ၸိင်"));
        Assert.assertEquals("tsi\u0301ng", ShanTranslit.taiToEng("ၸိင်း"));
        Assert.assertEquals("pa\u030cen", ShanTranslit.taiToEng("ပဵၼ်"));
        Assert.assertEquals("pa\u0301en", ShanTranslit.taiToEng("ပဵၼ်း"));
        Assert.assertEquals("the\u030cng", ShanTranslit.taiToEng("ထႅင်"));
        Assert.assertEquals("the\u0301ng", ShanTranslit.taiToEng("ထႅင်း"));
        Assert.assertEquals("ku\u030cn", ShanTranslit.taiToEng("ၵုၼ်"));
        Assert.assertEquals("ku\u0301n", ShanTranslit.taiToEng("ၵုၼ်း"));
        Assert.assertEquals("no\u030cm", ShanTranslit.taiToEng("ၼူမ်"));
        Assert.assertEquals("no\u0301m", ShanTranslit.taiToEng("ၼူမ်း"));
        Assert.assertEquals("ha\u030cum", ShanTranslit.taiToEng("ႁွမ်"));
        Assert.assertEquals("ha\u0301um", ShanTranslit.taiToEng("ႁွမ်း"));
        Assert.assertEquals("khu\u030cen", ShanTranslit.taiToEng("ၶိုၼ်"));
        Assert.assertEquals("khu\u0301en", ShanTranslit.taiToEng("ၶိုၼ်း"));
        Assert.assertEquals("pho\u030cen", ShanTranslit.taiToEng("ၽိူၼ်"));
        Assert.assertEquals("pho\u0301en", ShanTranslit.taiToEng("ၽိူၼ်း"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ၊ ဢၢဝ် ၊ ဢိဝ် ၊ ဢဵဝ် ၊ ဢႅဝ် ၊ ဢႂ်
        Assert.assertEquals("kha\u030co", ShanTranslit.taiToEng("ၶဝ်"));
        Assert.assertEquals("kha\u0301o", ShanTranslit.taiToEng("ၶဝ်း"));
        Assert.assertEquals("nga\u030co", ShanTranslit.taiToEng("ငဝ်"));
        Assert.assertEquals("nga\u0301o", ShanTranslit.taiToEng("ငဝ်း"));
        Assert.assertEquals("ka\u030cao", ShanTranslit.taiToEng("ၵၢဝ်"));
        Assert.assertEquals("ka\u0301ao", ShanTranslit.taiToEng("ၵၢဝ်း"));
        Assert.assertEquals("li\u030co", ShanTranslit.taiToEng("လိဝ်"));
        Assert.assertEquals("li\u0301o", ShanTranslit.taiToEng("လိဝ်း"));
        Assert.assertEquals("pha\u030ceo", ShanTranslit.taiToEng("ၽဵဝ်"));
        Assert.assertEquals("pha\u0301eo", ShanTranslit.taiToEng("ၽဵဝ်း"));
        Assert.assertEquals("khe\u030cao", ShanTranslit.taiToEng("ၶႅဝ်"));
        Assert.assertEquals("khe\u0301ao", ShanTranslit.taiToEng("ၶႅဝ်း"));
        Assert.assertEquals("tha\u030cue", ShanTranslit.taiToEng("ထႂ်"));
        Assert.assertEquals("tha\u0301ue", ShanTranslit.taiToEng("ထႂ်း"));
    }

    @Test
    public void Test4() {
        // ၵႆ ၊ ၵၺ်
        Assert.assertEquals("kha\u030ci", ShanTranslit.taiToEng("ၶႆ"));
        Assert.assertEquals("kha\u0301i", ShanTranslit.taiToEng("ၶႆး"));
        Assert.assertEquals("kha\u1dc8i", ShanTranslit.taiToEng("ၶႆႊ"));
        Assert.assertEquals("wa\u030ci", ShanTranslit.taiToEng("ဝႆ"));
        Assert.assertEquals("ka\u030cai", ShanTranslit.taiToEng("ၵၢႆ"));
        Assert.assertEquals("ka\u0301ai", ShanTranslit.taiToEng("ၵၢႆး"));
        Assert.assertEquals("lu\u030ci", ShanTranslit.taiToEng("လုၺ်"));
        Assert.assertEquals("lu\u0301i", ShanTranslit.taiToEng("လုၺ်း"));
        Assert.assertEquals("kho\u030ci", ShanTranslit.taiToEng("ၶူၺ်"));
        Assert.assertEquals("kho\u0301i", ShanTranslit.taiToEng("ၶူၺ်း"));
        Assert.assertEquals("kha\u030cui", ShanTranslit.taiToEng("ၶွႆ"));
        Assert.assertEquals("kha\u0301ui", ShanTranslit.taiToEng("ၶွႆး"));
        Assert.assertEquals("tsu\u030cei", ShanTranslit.taiToEng("ၸိုၺ်"));
        Assert.assertEquals("tsu\u0301ei", ShanTranslit.taiToEng("ၸိုၺ်း"));
        Assert.assertEquals("wo\u030cei", ShanTranslit.taiToEng("ဝိူၺ်"));
        Assert.assertEquals("wo\u0301ei", ShanTranslit.taiToEng("ဝိူၺ်း"));
    }

    @Test
    public void Test5() {
        // ႂ
        Assert.assertEquals("khwa\u030ca", ShanTranslit.taiToEng("ၶႂႃ"));
        Assert.assertEquals("khwa\u0301a", ShanTranslit.taiToEng("ၶႂႃး"));
        Assert.assertEquals("kwa\u030cai", ShanTranslit.taiToEng("ၵႂၢႆ"));
        Assert.assertEquals("kwa\u0301ai", ShanTranslit.taiToEng("ၵႂၢႆး"));
        Assert.assertEquals("khwa\u030cang", ShanTranslit.taiToEng("ၶႂၢင်"));
        Assert.assertEquals("khwa\u0301ang", ShanTranslit.taiToEng("ၶႂၢင်း"));
        Assert.assertEquals("kwa\u030cam", ShanTranslit.taiToEng("ၵႂၢမ်"));
        Assert.assertEquals("kwa\u0301am", ShanTranslit.taiToEng("ၵႂၢမ်း"));
        Assert.assertEquals("swa\u030cang", ShanTranslit.taiToEng("သႂၢင်"));
    }


    @Test
    public void Test6() {
        // ပ် ၊ တ် ၊ ၵ်
        // ဢပ် ၊ ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
        Assert.assertEquals("pa\u030cp", ShanTranslit.taiToEng("ပပ်"));
        Assert.assertEquals("pa\u0301p", ShanTranslit.taiToEng("ပပ်း"));
        Assert.assertEquals("lát", ShanTranslit.taiToEng("လတ်း"));
        Assert.assertEquals("la\u030cat", ShanTranslit.taiToEng("လၢတ်"));
        Assert.assertEquals("la\u0301at", ShanTranslit.taiToEng("လၢတ်း"));
        Assert.assertEquals("thi\u030cp", ShanTranslit.taiToEng("ထိပ်"));
        Assert.assertEquals("thi\u0301p", ShanTranslit.taiToEng("ထိပ်း"));
        Assert.assertEquals("sa\u030cep", ShanTranslit.taiToEng("သဵပ်"));
        Assert.assertEquals("sa\u0301ep", ShanTranslit.taiToEng("သဵပ်း"));
        Assert.assertEquals("we\u030cp", ShanTranslit.taiToEng("ဝႅပ်"));
        Assert.assertEquals("we\u0301p", ShanTranslit.taiToEng("ဝႅပ်း"));
        Assert.assertEquals("tu\u030cp", ShanTranslit.taiToEng("တုပ်"));
        Assert.assertEquals("tu\u0301p", ShanTranslit.taiToEng("တုပ်း"));
        Assert.assertEquals("ngo\u030cp", ShanTranslit.taiToEng("ငူပ်"));
        Assert.assertEquals("ngo\u0301p", ShanTranslit.taiToEng("ငူပ်း"));
        Assert.assertEquals("la\u030cuk", ShanTranslit.taiToEng("လွၵ်"));
        Assert.assertEquals("la\u0301uk", ShanTranslit.taiToEng("လွၵ်း"));
        Assert.assertEquals("tu\u030cek", ShanTranslit.taiToEng("တိုၵ်"));
        Assert.assertEquals("tu\u0301ek", ShanTranslit.taiToEng("တိုၵ်း"));
        Assert.assertEquals("po\u030cek", ShanTranslit.taiToEng("ပိူၵ်"));
        Assert.assertEquals("po\u0301ek", ShanTranslit.taiToEng("ပိူၵ်း"));
    }


}
