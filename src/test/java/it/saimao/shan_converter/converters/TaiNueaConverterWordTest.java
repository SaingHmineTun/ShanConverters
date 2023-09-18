package it.saimao.shan_converter.converters;

import org.junit.Assert;
import org.junit.Test;

import static it.saimao.shan_converter.converters.TaiNueaConverter.shn2tdd;


public class TaiNueaConverterWordTest {

    @Test
    public void Test1() {
        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        Assert.assertEquals("ᥓ", shn2tdd("ၸ"));
        Assert.assertEquals("ᥑ", shn2tdd("ၶ"));
        Assert.assertEquals("ᥒ", shn2tdd("င"));
        Assert.assertEquals("ᥠ", shn2tdd("ၶျ"));
        Assert.assertEquals("ᥙᥣ", shn2tdd("ပႃႊ"));
        Assert.assertEquals("ᥙᥣᥰ", shn2tdd("ပႃး"));

        Assert.assertEquals("ᥝᥣᥳ", shn2tdd("ဝႃႉ"));
        Assert.assertEquals("ᥗᥤᥲ", shn2tdd("ထီႈ"));
        Assert.assertEquals("ᥗᥤᥰ", shn2tdd("ထီး"));
        Assert.assertEquals("ᥞᥥᥴ", shn2tdd("ႁေ"));
        Assert.assertEquals("ᥞᥥᥰ", shn2tdd("ႁေး"));
        Assert.assertEquals("ᥛᥦᥴ", shn2tdd("မႄ"));
        Assert.assertEquals("ᥛᥦᥲ", shn2tdd("မႄႈ"));
        Assert.assertEquals("ᥜᥧᥰ", shn2tdd("ၾူး"));
        Assert.assertEquals("ᥜᥧ", shn2tdd("ၾူႊ"));
        Assert.assertEquals("ᥔᥨᥝᥴ", shn2tdd("သူဝ်"));
        Assert.assertEquals("ᥔᥨᥝᥰ", shn2tdd("သူဝ်း"));
        Assert.assertEquals("ᥘᥩᥴ", shn2tdd("လေႃ"));
        Assert.assertEquals("ᥘᥩᥱ", shn2tdd("လေႃႇ"));
        Assert.assertEquals("ᥡᥩᥱ", shn2tdd("သျေႃႇ"));
        Assert.assertEquals("ᥡᥩᥰ", shn2tdd("သျေႃး"));
        Assert.assertEquals("ᥘᥪᥲ", shn2tdd("လိုဝ်ႈ"));
        Assert.assertEquals("ᥘᥪᥰ", shn2tdd("လိုဝ်း"));
        Assert.assertEquals("ᥕᥫᥱ", shn2tdd("ယိူဝ်ႇ"));
        Assert.assertEquals("ᥕᥫᥰ", shn2tdd("ယိူဝ်း"));
    }

    @Test
    public void Test2() {
//        assertEquals("hap", taiToEng("ႁပ်"));
        // မ် ၊ ၼ် ၊ င်
        // ဢမ် ၊ ဢၢမ် ၊ ဢိမ် ၊ ဢဵမ် ၊ ဢႅမ် ၊ ဢုမ် ၊ ဢူမ် ၊ ဢွမ် ၊ ဢိုမ် ၊ ဢိူမ်
        Assert.assertEquals("ya\u030cm", shn2tdd("ယမ်"));
        Assert.assertEquals("la\u030cn", shn2tdd("လၼ်"));
        Assert.assertEquals("la\u0301n", shn2tdd("လၼ်း"));
        Assert.assertEquals("la\u030cam", shn2tdd("လၢမ်"));
        Assert.assertEquals("la\u0301am", shn2tdd("လၢမ်း"));
        Assert.assertEquals("tsi\u030cng", shn2tdd("ၸိင်"));
        Assert.assertEquals("tsi\u0301ng", shn2tdd("ၸိင်း"));
        Assert.assertEquals("pa\u030cen", shn2tdd("ပဵၼ်"));
        Assert.assertEquals("pa\u0301en", shn2tdd("ပဵၼ်း"));
        Assert.assertEquals("the\u030cng", shn2tdd("ထႅင်"));
        Assert.assertEquals("the\u0301ng", shn2tdd("ထႅင်း"));
        Assert.assertEquals("ku\u030cn", shn2tdd("ၵုၼ်"));
        Assert.assertEquals("ku\u0301n", shn2tdd("ၵုၼ်း"));
        Assert.assertEquals("no\u030cm", shn2tdd("ၼူမ်"));
        Assert.assertEquals("no\u0301m", shn2tdd("ၼူမ်း"));
        Assert.assertEquals("ha\u030cum", shn2tdd("ႁွမ်"));
        Assert.assertEquals("ha\u0301um", shn2tdd("ႁွမ်း"));
        Assert.assertEquals("khu\u030cen", shn2tdd("ၶိုၼ်"));
        Assert.assertEquals("khu\u0301en", shn2tdd("ၶိုၼ်း"));
        Assert.assertEquals("pho\u030cen", shn2tdd("ၽိူၼ်"));
        Assert.assertEquals("pho\u0301en", shn2tdd("ၽိူၼ်း"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ၊ ဢၢဝ် ၊ ဢိဝ် ၊ ဢဵဝ် ၊ ဢႅဝ် ၊ ဢႂ်
        Assert.assertEquals("kha\u030co", shn2tdd("ၶဝ်"));
        Assert.assertEquals("kha\u0301o", shn2tdd("ၶဝ်း"));
        Assert.assertEquals("nga\u030co", shn2tdd("ငဝ်"));
        Assert.assertEquals("nga\u0301o", shn2tdd("ငဝ်း"));
        Assert.assertEquals("ka\u030cao", shn2tdd("ၵၢဝ်"));
        Assert.assertEquals("ka\u0301ao", shn2tdd("ၵၢဝ်း"));
        Assert.assertEquals("li\u030co", shn2tdd("လိဝ်"));
        Assert.assertEquals("li\u0301o", shn2tdd("လိဝ်း"));
        Assert.assertEquals("pha\u030ceo", shn2tdd("ၽဵဝ်"));
        Assert.assertEquals("pha\u0301eo", shn2tdd("ၽဵဝ်း"));
        Assert.assertEquals("khe\u030cao", shn2tdd("ၶႅဝ်"));
        Assert.assertEquals("khe\u0301ao", shn2tdd("ၶႅဝ်း"));
        Assert.assertEquals("tha\u030cue", shn2tdd("ထႂ်"));
        Assert.assertEquals("tha\u0301ue", shn2tdd("ထႂ်း"));
    }

    @Test
    public void Test4() {
        // ၵႆ ၊ ၵၺ်
        Assert.assertEquals("kha\u030ci", shn2tdd("ၶႆ"));
        Assert.assertEquals("kha\u0301i", shn2tdd("ၶႆး"));
        Assert.assertEquals("kha\u1dc8i", shn2tdd("ၶႆႊ"));
        Assert.assertEquals("wa\u030ci", shn2tdd("ဝႆ"));
        Assert.assertEquals("ka\u030cai", shn2tdd("ၵၢႆ"));
        Assert.assertEquals("ka\u0301ai", shn2tdd("ၵၢႆး"));
        Assert.assertEquals("lu\u030ci", shn2tdd("လုၺ်"));
        Assert.assertEquals("lu\u0301i", shn2tdd("လုၺ်း"));
        Assert.assertEquals("kho\u030ci", shn2tdd("ၶူၺ်"));
        Assert.assertEquals("kho\u0301i", shn2tdd("ၶူၺ်း"));
        Assert.assertEquals("kha\u030cui", shn2tdd("ၶွႆ"));
        Assert.assertEquals("kha\u0301ui", shn2tdd("ၶွႆး"));
        Assert.assertEquals("tsu\u030cei", shn2tdd("ၸိုၺ်"));
        Assert.assertEquals("tsu\u0301ei", shn2tdd("ၸိုၺ်း"));
        Assert.assertEquals("wo\u030cei", shn2tdd("ဝိူၺ်"));
        Assert.assertEquals("wo\u0301ei", shn2tdd("ဝိူၺ်း"));
    }

    @Test
    public void Test5() {
        // ႂ
        Assert.assertEquals("khwa\u030ca", shn2tdd("ၶႂႃ"));
        Assert.assertEquals("khwa\u0301a", shn2tdd("ၶႂႃး"));
        Assert.assertEquals("kwa\u030cai", shn2tdd("ၵႂၢႆ"));
        Assert.assertEquals("kwa\u0301ai", shn2tdd("ၵႂၢႆး"));
        Assert.assertEquals("khwa\u030cang", shn2tdd("ၶႂၢင်"));
        Assert.assertEquals("khwa\u0301ang", shn2tdd("ၶႂၢင်း"));
        Assert.assertEquals("kwa\u030cam", shn2tdd("ၵႂၢမ်"));
        Assert.assertEquals("kwa\u0301am", shn2tdd("ၵႂၢမ်း"));
        Assert.assertEquals("swa\u030cang", shn2tdd("သႂၢင်"));
    }


    @Test
    public void Test6() {
        // ပ် ၊ တ် ၊ ၵ်
        // ဢပ် ၊ ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
        Assert.assertEquals("pa\u030cp", shn2tdd("ပပ်"));
        Assert.assertEquals("pa\u0301p", shn2tdd("ပပ်း"));
        Assert.assertEquals("lát", shn2tdd("လတ်း"));
        Assert.assertEquals("la\u030cat", shn2tdd("လၢတ်"));
        Assert.assertEquals("la\u0301at", shn2tdd("လၢတ်း"));
        Assert.assertEquals("thi\u030cp", shn2tdd("ထိပ်"));
        Assert.assertEquals("thi\u0301p", shn2tdd("ထိပ်း"));
        Assert.assertEquals("sa\u030cep", shn2tdd("သဵပ်"));
        Assert.assertEquals("sa\u0301ep", shn2tdd("သဵပ်း"));
        Assert.assertEquals("we\u030cp", shn2tdd("ဝႅပ်"));
        Assert.assertEquals("we\u0301p", shn2tdd("ဝႅပ်း"));
        Assert.assertEquals("tu\u030cp", shn2tdd("တုပ်"));
        Assert.assertEquals("tu\u0301p", shn2tdd("တုပ်း"));
        Assert.assertEquals("ngo\u030cp", shn2tdd("ငူပ်"));
        Assert.assertEquals("ngo\u0301p", shn2tdd("ငူပ်း"));
        Assert.assertEquals("la\u030cuk", shn2tdd("လွၵ်"));
        Assert.assertEquals("la\u0301uk", shn2tdd("လွၵ်း"));
        Assert.assertEquals("tu\u030cek", shn2tdd("တိုၵ်"));
        Assert.assertEquals("tu\u0301ek", shn2tdd("တိုၵ်း"));
        Assert.assertEquals("po\u030cek", shn2tdd("ပိူၵ်"));
        Assert.assertEquals("po\u0301ek", shn2tdd("ပိူၵ်း"));
    }


}
