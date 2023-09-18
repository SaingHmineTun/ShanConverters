package it.saimao.shan_converter.breakers;

import it.saimao.shan_converter.breakers.ShanSyllableBreaker;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShanSyllableBreakerTest {
    @Test
    public void Test1() {
        Assert.assertEquals("ၵ ၶႃ ငီ ၸေ ၸႄ တူ ထူဝ် သေႃ လိုဝ် ဢိူဝ်", ShanSyllableBreaker.syllable_break("ၵၶႃငီၸေၸႄတူထူဝ်သေႃလိုဝ်ဢိူဝ်"));
        Assert.assertEquals("ဢ ၶႃး လီႊ ၸေႉ မႄႈ ထူး လူဝ်ႇ သေႃး လိုဝ်ႉ ပိူဝ်ႈ", ShanSyllableBreaker.syllable_break("ဢၶႃးလီႊၸေႉမႄႈထူးလူဝ်ႇသေႃးလိုဝ်ႉပိူဝ်ႈ"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("ဢႆ ဢၢႆ ဢုၺ် ဢူၺ် ၵွႆ ဢိုၺ် ဢိူၺ်", ShanSyllableBreaker.syllable_break("ဢႆဢၢႆဢုၺ်ဢူၺ်ၵွႆဢိုၺ်ဢိူၺ်"));
        Assert.assertEquals("ၶၢႆ ၵႂၢႆး တူၺ်း သူၺ်ႊ လိုၺ်ႉ ႁိူၺ်ႉ", ShanSyllableBreaker.syllable_break("ၶၢႆၵႂၢႆးတူၺ်းသူၺ်ႊလိုၺ်ႉႁိူၺ်ႉ"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("ၵၵ်ႇ လၢၵ်ႊ လိၵ်ႈ ၾဵၵ်ႉ လႅၵ်ႈ ၽုၵ်ႇ ဢူၵ် တွၵ်ႈ တိုၵ်း လိူၵ်ႈ", ShanSyllableBreaker.syllable_break("ၵၵ်ႇလၢၵ်ႊလိၵ်ႈၾဵၵ်ႉလႅၵ်ႈၽုၵ်ႇဢူၵ်တွၵ်ႈတိုၵ်းလိူၵ်ႈ"));
        Assert.assertEquals("ၸတ် လၢတ်ႈ သိတ် လဵတ် မႅတ်ႈ သုတ်ႉ လူတ်ႇ ၵွတ်း ဢိုတ်း လိူတ်ႈ", ShanSyllableBreaker.syllable_break("ၸတ်လၢတ်ႈသိတ်လဵတ်မႅတ်ႈသုတ်ႉလူတ်ႇၵွတ်းဢိုတ်းလိူတ်ႈ"));
        Assert.assertEquals("ပပ်ႉ လၢပ်ႊ ဢိပ်ႉ လဵပ်ႈ ၵျႅပ်ႉ ဢုပ်ႇ ထူပ်း ၵွပ်ႈ ဢိုပ်း ႁိူပ်ႊ", ShanSyllableBreaker.syllable_break("ပပ်ႉလၢပ်ႊဢိပ်ႉလဵပ်ႈၵျႅပ်ႉဢုပ်ႇထူပ်းၵွပ်ႈဢိုပ်းႁိူပ်ႊ"));
    }

    @Test
    public void Test4() {
        Assert.assertEquals("ဢမ်ႇ ဢၢမ်ႊ သိမ်း ပဵမ်ႉ ၵႅမ်ႉ သုမ်း လူမ်း ၶွမ်း လိုမ်ႉ ၽိူမ်ႉ", ShanSyllableBreaker.syllable_break("ဢမ်ႇဢၢမ်ႊသိမ်းပဵမ်ႉၵႅမ်ႉသုမ်းလူမ်းၶွမ်းလိုမ်ႉၽိူမ်ႉ"));
        Assert.assertEquals("ဢၼ် ဢၢၼ်ႇ လိၼ် လဵၼ်ႈ လႅၼ်ႊ ဢုၼ်ႇ ဢူၼ် ဢွၼ်ႇ ပိုၼ်း ပိူၼ်ႈ", ShanSyllableBreaker.syllable_break("ဢၼ်ဢၢၼ်ႇလိၼ်လဵၼ်ႈလႅၼ်ႊဢုၼ်ႇဢူၼ်ဢွၼ်ႇပိုၼ်းပိူၼ်ႈ"));
        Assert.assertEquals("သင် ၵၢင်ႊ လိင်း ၶဵင်ႇ လႅင်း ဢုင်ႊ လူင်း ဢွင် ၶိုင် ၶိူင်ႊ", ShanSyllableBreaker.syllable_break("သင်ၵၢင်ႊလိင်းၶဵင်ႇလႅင်းဢုင်ႊလူင်းဢွင်ၶိုင်ၶိူင်ႊ"));
    }

    @Test
    public void Test5() {
        Assert.assertEquals("ၶႂၢင်း ပၼ် ႁဝ်း ဢိတ်း ၼိုင်ႈ", ShanSyllableBreaker.syllable_break("ၶႂၢင်းပၼ်ႁဝ်းဢိတ်းၼိုင်ႈ"));
        Assert.assertEquals("မႂ်ႇ သုင် မိူင်း တႆး ႁႂ်ႈ ၸဵဝ်း ၵတ်း ယဵၼ်", ShanSyllableBreaker.syllable_break("မႂ်ႇသုင်မိူင်းတႆး ႁႂ်ႈၸဵဝ်းၵတ်းယဵၼ်"));
        Assert.assertEquals("ၼိူဝ် လိၼ် မီး လိၼ် ၼိူဝ် ၾႃႉ မီး ၾႃႉ သူ သမ်ႉ တေ ၵႂႃႇ ၶွႆ ၽႂ် ႁူၺ်း", ShanSyllableBreaker.syllable_break("ၼိူဝ်လိၼ် မီးလိၼ် ၼိူဝ်ၾႃႉ မီးၾႃႉ သူသမ်ႉတေၵႂႃႇၶွႆၽႂ်ႁူၺ်း"));
        Assert.assertEquals("တူဝ် မႂ်း မီး ႁိမ်း ပီႈ ၵေႃႈ သူင်ႇ ဢွၵ်ႇ ၸႂ် ႁၵ်ႉ မႂ်း မီး တီႈ ၵႆ", ShanSyllableBreaker.syllable_break("တူဝ်မႂ်းမီးႁိမ်းပီႈၵေႃႈ သူင်ႇဢွၵ်ႇၸႂ်ႁၵ်ႉ မႂ်းမီးတီႈၵႆ"));
        Assert.assertEquals("ၼႂ်း ၸႂ် တႄႉ ဝူၼ်ႉ သွၼ်ႇ ၵူဝ် ပဵၼ် လွင်ႈ ၽိတ်း ပိူင်ႈ", ShanSyllableBreaker.syllable_break("ၼႂ်းၸႂ်တႄႉ ဝူၼ်ႉသွၼ်ႇ ၵူဝ်ပဵၼ်လွင်ႈၽိတ်းပိူင်ႈ"));
    }

    @Test
    public void Test6_Pangram() {
        Assert.assertEquals("ပေႃး ၶႂ်ႈ ၵျ ၶႅၼ်ႇ ၵႂႃႇ ၸိုင် တေ လႆႈ ႁွင်ႉ သြႃႇ လီ ရဵၼ်း ႁူႉ သွၼ် ၽိုၵ်း ၺႃး မိူဝ်ႈ ၾႃႉ ပၢင်ႇ ၸၢႆး သၢင်ႇ လႄႈ ယိင်း ဢိူၺ်ႉ ပေ ၼိုၵ်း သိူဝ်း ၵျေႃႇ တိုၵ်း ထႃႈ ၸံ လႄႈ တင်း ၵႆ ၼၼ်ႉ သႃႊ",
                ShanSyllableBreaker.syllable_break("ပေႃးၶႂ်ႈၵျၶႅၼ်ႇၵႂႃႇၸိုင် တေလႆႈႁွင်ႉသြႃႇလီရဵၼ်းႁူႉသွၼ်ၽိုၵ်း ၺႃးမိူဝ်ႈၾႃႉပၢင်ႇ ၸၢႆးသၢင်ႇလႄႈ ယိင်းဢိူၺ်ႉပေၼိုၵ်း သိူဝ်းၵျေႃႇတိုၵ်းထႃႈ ၸံလႄႈတင်းၵႆၼၼ်ႉသႃႊ"));
    }

}
