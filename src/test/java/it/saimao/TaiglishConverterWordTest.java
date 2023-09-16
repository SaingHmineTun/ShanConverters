package it.saimao;

import org.junit.Test;

import static it.saimao.TaiglishConverter.taiToEng;
import static org.junit.Assert.*;


public class TaiglishConverterWordTest {

    @Test
    public void Test1() {
        // Test ဢႃ ၊ ဢီ ၊ ဢေ ၊ ဢႄ ၊ ဢူ ၊ ဢူဝ် ၊ ဢေႃ ၊ ဢိုဝ် ၊ ဢိူဝ်
        assertEquals("z", taiToEng("ၸ"));
        assertEquals("paa", taiToEng("ပႃ"));
        assertEquals("waa", taiToEng("ဝႃ"));
        assertEquals("thi", taiToEng("ထီ"));
        assertEquals("ri", taiToEng("ရီ"));
        assertEquals("hae", taiToEng("ႁေ"));
        assertEquals("me", taiToEng("မႄ"));
        assertEquals("fu", taiToEng("ၾူ"));
        assertEquals("so", taiToEng("သူဝ်"));
        assertEquals("lau", taiToEng("လေႃ"));
        assertEquals("lue", taiToEng("လိုဝ်"));
        assertEquals("yoe", taiToEng("ယိူဝ်"));
    }

    @Test
    public void Test2() {
//        assertEquals("hap", taiToEng("ႁပ်"));
        // မ် ၊ ၼ် ၊ င်
        // ဢမ် ၊ ဢၢမ် ၊ ဢိမ် ၊ ဢဵမ် ၊ ဢႅမ် ၊ ဢုမ် ၊ ဢူမ် ၊ ဢွမ် ၊ ဢိုမ် ၊ ဢိူမ်
        assertEquals("yam", taiToEng("ယမ်"));
        assertEquals("lan", taiToEng("လၼ်"));
        assertEquals("laam", taiToEng("လၢမ်"));
        assertEquals("zing", taiToEng("ၸိင်"));
        assertEquals("paen", taiToEng("ပဵၼ်"));
        assertEquals("theng", taiToEng("ထႅင်"));
        assertEquals("kun", taiToEng("ၵုၼ်"));
        assertEquals("nom", taiToEng("ၼူမ်"));
        assertEquals("haum", taiToEng("ႁွမ်"));
        assertEquals("khuen", taiToEng("ၶိုၼ်"));
        assertEquals("phoen", taiToEng("ၽိူၼ်"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ၊ ဢၢဝ် ၊ ဢိဝ် ၊ ဢဵဝ် ၊ ဢႅဝ် ၊ ဢႂ်
        assertEquals("khao", taiToEng("ၶဝ်"));
        assertEquals("ngao", taiToEng("ငဝ်"));
        assertEquals("kaao", taiToEng("ၵၢဝ်"));
        assertEquals("lio", taiToEng("လိဝ်"));
        assertEquals("phaeo", taiToEng("ၽဵဝ်"));
        assertEquals("kheao", taiToEng("ၶႅဝ်"));
        assertEquals("thaue", taiToEng("ထႂ်"));
    }

    @Test
    public void Test4() {
        // ၵႆ ၊ ၵၺ်
        assertEquals("khai", taiToEng("ၶႆ"));
        assertEquals("wai", taiToEng("ဝႆ"));
        assertEquals("kaai", taiToEng("ၵၢႆ"));
        assertEquals("lui", taiToEng("လုၺ်"));
        assertEquals("khoi", taiToEng("ၶူၺ်"));
        assertEquals("khaui", taiToEng("ၶွႆ"));
        assertEquals("zuei", taiToEng("ၸိုၺ်"));
        assertEquals("woei", taiToEng("ဝိူၺ်"));
    }

    @Test
    public void Test5() {
        // ႂ
        assertEquals("khwaa", taiToEng("ၶႂႃ"));
        assertEquals("kwaai", taiToEng("ၵႂၢႆ"));
        assertEquals("khwaang", taiToEng("ၶႂၢင်"));
        assertEquals("kwaam", taiToEng("ၵႂၢမ်"));
        assertEquals("swaang", taiToEng("သႂၢင်"));
    }


    @Test
    public void Test6() {
        // ပ် ၊ တ် ၊ ၵ်
        // ဢပ် ၊ ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
        assertEquals("pap", taiToEng("ပပ်"));
        assertEquals("laat", taiToEng("လၢတ်"));
        assertEquals("thip", taiToEng("ထိပ်"));
        assertEquals("saep", taiToEng("သဵပ်"));
        assertEquals("wep", taiToEng("ဝႅပ်"));
        assertEquals("tup", taiToEng("တုပ်"));
        assertEquals("ngop", taiToEng("ငူပ်"));
        assertEquals("lauk", taiToEng("လွၵ်"));
        assertEquals("tuek", taiToEng("တိုၵ်"));
        assertEquals("poek", taiToEng("ပိူၵ်"));
    }


}
