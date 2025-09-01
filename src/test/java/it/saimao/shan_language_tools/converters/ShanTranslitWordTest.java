package it.saimao.shan_language_tools.converters;

import org.junit.Assert;
import org.junit.Test;


public class ShanTranslitWordTest {

    @Test
    public void Test1() {
        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        Assert.assertEquals("ja", ShanTranslit.taiToEng("ၸ"));
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
    public void Test1ett() {

        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        Assert.assertEquals("ၸ", ShanTranslit.engToTai("tsa"));
        Assert.assertEquals("ၶ", ShanTranslit.engToTai("kha"));
        Assert.assertEquals("င", ShanTranslit.engToTai("nga"));
        Assert.assertEquals("ထ", ShanTranslit.engToTai("tha"));
        Assert.assertEquals("ၼ", ShanTranslit.engToTai("na"));
        Assert.assertEquals("ၽ", ShanTranslit.engToTai("pha"));
        Assert.assertEquals("လ", ShanTranslit.engToTai("la"));
        Assert.assertEquals("ဝ", ShanTranslit.engToTai("wa"));
        Assert.assertEquals("ႁ", ShanTranslit.engToTai("ha"));
        Assert.assertEquals("ဢ", ShanTranslit.engToTai("a"));
        Assert.assertEquals("ၵျ", ShanTranslit.engToTai("kya"));
        Assert.assertEquals("ၶျ", ShanTranslit.engToTai("khya"));
        Assert.assertEquals("ၵြ", ShanTranslit.engToTai("kra"));
        Assert.assertEquals("တြ", ShanTranslit.engToTai("tra"));
        Assert.assertEquals("ပျ", ShanTranslit.engToTai("pya"));


        // ဢႃ
        Assert.assertEquals("ပႃ", ShanTranslit.engToTai("pa\u030ca"));
        Assert.assertEquals("ပႃး", ShanTranslit.engToTai("pa\u0301a"));
        Assert.assertEquals("သြႃ", ShanTranslit.engToTai("sra\u030ca"));
        Assert.assertEquals("ပျႃ", ShanTranslit.engToTai("pya\u030ca"));
        Assert.assertEquals("ဝႃ", ShanTranslit.engToTai("wa\u030ca"));


        // ဢီ
        Assert.assertEquals("ထီ", ShanTranslit.engToTai("thi\u030ci"));
        Assert.assertEquals("ထီး", ShanTranslit.engToTai("thi\u0301i"));
        Assert.assertEquals("ရီ", ShanTranslit.engToTai("ri\u030ci"));
        Assert.assertEquals("ၾီး", ShanTranslit.engToTai("fi\u0301i"));


        // ဢေ ၊ ဢႄ
        Assert.assertEquals("ႁေ", ShanTranslit.engToTai("ha\u030ce"));
        Assert.assertEquals("ႁေး", ShanTranslit.engToTai("ha\u0301e"));
        Assert.assertEquals("မႄ", ShanTranslit.engToTai("me\u030c"));
        Assert.assertEquals("မႄႈ", ShanTranslit.engToTai("me\u0304"));


        // ဢူ ၊ ဢူဝ် ၊ ဢေႃ
        Assert.assertEquals("ၾူ", ShanTranslit.engToTai("fu\u030c"));
        Assert.assertEquals("ၾူး", ShanTranslit.engToTai("fu\u0301"));
        Assert.assertEquals("သူဝ်", ShanTranslit.engToTai("so\u030c"));
        Assert.assertEquals("သူဝ်း", ShanTranslit.engToTai("so\u0301"));
        Assert.assertEquals("လေႃ", ShanTranslit.engToTai("la\u030cu"));
        Assert.assertEquals("လေႃး", ShanTranslit.engToTai("la\u0301u"));


        // ဢိုဝ် ၊ ဢိူဝ်
        Assert.assertEquals("လိုဝ်", ShanTranslit.engToTai("lu\u030ce"));
        Assert.assertEquals("လိုဝ်း", ShanTranslit.engToTai("lu\u0301e"));
        Assert.assertEquals("ယိူဝ်", ShanTranslit.engToTai("yo\u030ce"));
        Assert.assertEquals("ယိူဝ်း", ShanTranslit.engToTai("yo\u0301e"));

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
        Assert.assertEquals("ji\u030cng", ShanTranslit.taiToEng("ၸိင်"));
        Assert.assertEquals("ji\u0301ng", ShanTranslit.taiToEng("ၸိင်း"));
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
    public void Test2ett() {

        // မ် ၊ ၼ် ၊ င်
        // ဢမ် ၊ ဢၢမ် ၊ ဢိမ် ၊ ဢဵမ် ၊ ဢႅမ် ၊ ဢုမ် ၊ ဢူမ် ၊ ဢွမ် ၊ ဢိုမ် ၊ ဢိူမ်
        Assert.assertEquals("ယမ်", ShanTranslit.engToTai("ya\u030cm"));
        Assert.assertEquals("မၼ်ႊ", ShanTranslit.engToTai("ma\u1dc8n"));
        Assert.assertEquals("လၼ်", ShanTranslit.engToTai("la\u030cn"));
        Assert.assertEquals("လၼ်း", ShanTranslit.engToTai("la\u0301n"));
        Assert.assertEquals("လၢမ်", ShanTranslit.engToTai("la\u030cam"));
        Assert.assertEquals("လၢမ်း", ShanTranslit.engToTai("la\u0301am"));
        Assert.assertEquals("ၸိင်", ShanTranslit.engToTai("tsi\u030cng"));
        Assert.assertEquals("ၸိင်း", ShanTranslit.engToTai("tsi\u0301ng"));
        Assert.assertEquals("ပဵၼ်", ShanTranslit.engToTai("pa\u030cen"));
        Assert.assertEquals("ထႅင်း", ShanTranslit.engToTai("the\u0301ng"));
        Assert.assertEquals("ၵုၼ်း", ShanTranslit.engToTai("ku\u0301n"));
        Assert.assertEquals("ၼူမ်", ShanTranslit.engToTai("no\u030cm"));
        Assert.assertEquals("ႁွမ်", ShanTranslit.engToTai("ha\u030cum"));
        Assert.assertEquals("ၶိုၼ်း", ShanTranslit.engToTai("khu\u0301en"));
        Assert.assertEquals("ၽိူၼ်း", ShanTranslit.engToTai("pho\u0301en"));
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
    public void Test3ett() {

        // ဢဝ် ၊ ဢၢဝ် ၊ ဢိဝ် ၊ ဢဵဝ် ၊ ဢႅဝ် ၊ ဢႂ်
        Assert.assertEquals("ၶဝ်", ShanTranslit.engToTai("kha\u030co"));
        Assert.assertEquals("ၶဝ်း", ShanTranslit.engToTai("kha\u0301o"));
        Assert.assertEquals("ငဝ်", ShanTranslit.engToTai("nga\u030co"));
        Assert.assertEquals("ၵၢဝ်း", ShanTranslit.engToTai("ka\u0301ao"));
        Assert.assertEquals("လိဝ်း", ShanTranslit.engToTai("li\u0301o"));
        Assert.assertEquals("ၽဵဝ်း", ShanTranslit.engToTai("pha\u0301eo"));
        Assert.assertEquals("ၶႅဝ်", ShanTranslit.engToTai("khe\u030cao"));
        Assert.assertEquals("ထႂ်", ShanTranslit.engToTai("tha\u030cue"));
        Assert.assertEquals("ထႂ်း", ShanTranslit.engToTai("tha\u0301ue"));
    }

    @Test
    public void Test4() {
        // ၵႆ ၊ ၵၺ်
        Assert.assertEquals("kha\u030ci", ShanTranslit.taiToEng("ၶႆ"));
        Assert.assertEquals("ka\u0300i", ShanTranslit.taiToEng("ၵႆႇ"));
        Assert.assertEquals("ma\u0304i", ShanTranslit.taiToEng("မႆႈ"));
        Assert.assertEquals("kha\u0301i", ShanTranslit.taiToEng("ၶႆး"));
        Assert.assertEquals("la\u0302\u0330i", ShanTranslit.taiToEng("လႆႉ"));
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
        Assert.assertEquals("ju\u030cei", ShanTranslit.taiToEng("ၸိုၺ်"));
        Assert.assertEquals("ju\u0301ei", ShanTranslit.taiToEng("ၸိုၺ်း"));
        Assert.assertEquals("wo\u030cei", ShanTranslit.taiToEng("ဝိူၺ်"));
        Assert.assertEquals("wo\u0301ei", ShanTranslit.taiToEng("ဝိူၺ်း"));
    }

    @Test
    public void Test4ett() {
        // ၵႆ ၊ ၵၺ်
        Assert.assertEquals("ၶႆႊ", ShanTranslit.engToTai("kha\u1dc8i"));
        Assert.assertEquals("ဝႆ", ShanTranslit.engToTai("wa\u030ci"));
        Assert.assertEquals("ၵၢႆး", ShanTranslit.engToTai("ka\u0301ai"));
        Assert.assertEquals("လုၺ်", ShanTranslit.engToTai("lu\u030ci"));
        Assert.assertEquals("ၶူၺ်", ShanTranslit.engToTai("kho\u030ci"));
        Assert.assertEquals("ၶွႆး", ShanTranslit.engToTai("kha\u0301ui"));
        Assert.assertEquals("ၸိုၺ်", ShanTranslit.engToTai("tsu\u030cei"));
        Assert.assertEquals("ဝိူၺ်", ShanTranslit.engToTai("wo\u030cei"));
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
    public void Test5ett() {
        // ႂ
        Assert.assertEquals("ၶႂႃး", ShanTranslit.engToTai("khwa\u0301a"));
        Assert.assertEquals("ၵႂၢႆ", ShanTranslit.engToTai("kwa\u030cai"));
        Assert.assertEquals("ၶႂၢင်း", ShanTranslit.engToTai("khwa\u0301ang"));
        Assert.assertEquals("ၵႂၢမ်း", ShanTranslit.engToTai("kwa\u0301am"));
        Assert.assertEquals("သႂၢင်", ShanTranslit.engToTai("swa\u030cang"));
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


    @Test
    public void Test6ett() {
        // ပ် ၊ တ် ၊ ၵ်
        // ဢပ် ၊ ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
        Assert.assertEquals("ပပ်း", ShanTranslit.engToTai("pa\u0301p"));
        Assert.assertEquals("လၢတ်း", ShanTranslit.engToTai("la\u0301at"));
        Assert.assertEquals("ထိပ်", ShanTranslit.engToTai("thi\u030cp"));
        Assert.assertEquals("သဵပ်", ShanTranslit.engToTai("sa\u030cep"));
        Assert.assertEquals("ဝႅပ်း", ShanTranslit.engToTai("we\u0301p"));
        Assert.assertEquals("တုပ်း", ShanTranslit.engToTai("tu\u0301p"));
        Assert.assertEquals("ငူပ်", ShanTranslit.engToTai("ngo\u030cp"));
        Assert.assertEquals("လွၵ်း", ShanTranslit.engToTai("la\u0301uk"));
        Assert.assertEquals("တိုၵ်း", ShanTranslit.engToTai("tu\u0301ek"));
        Assert.assertEquals("ပိူၵ်", ShanTranslit.engToTai("po\u030cek"));
    }


}
