package it.saimao.shan_converter.converters;

import org.junit.Assert;
import org.junit.Test;

import static it.saimao.shan_converter.breakers.ShanSyllableBreaker.syllable_break;
import static it.saimao.shan_converter.converters.ShanTranslit.taiToEng;
import static org.junit.Assert.assertEquals;

public class ShanTranslitPhrasalTest {
    @Test
    public void Test_Major() {
        assertEquals("ka wāa kài kāup tài mâ̰i nǒe káun", taiToEng("ၵ ဝႃႈ ၵႆႇ ၵွပ်ႈတႆႇမႆႉၼိူဝ်ၵွၼ်း"));
        assertEquals("kha wāa khài mē mán pài máa ngáum", taiToEng("ၶ ဝႃႈ ၶႆႇ မႄႈမၼ်းပႆႇမႃးငွမ်း"));
        assertEquals("nga wāa ngú lōen máa jú tǒ khàet", taiToEng("င ဝႃႈ ငူး လိူၼ်ႈမႃးၸူးတူဝ်ၶဵတ်ႇ"));
        // a
        assertEquals("ja wāa jâ̰ang pǎi ʼô̰ng ʼâ̰ang jáum táang", taiToEng("ၸ ဝႃႈ ၸၢင်ႉ ပႆဢူင်ႉဢၢင်ႉၸွမ်းတၢင်း"));
        // mii & mi
        assertEquals("sa wāa sǒe míi yù nǒe làa hâ̰a", taiToEng("သ ဝႃႈ သိူဝ် မီးယူႇၼိူဝ်လႃႇႁႃႉ"));
        assertEquals("nya wāa nyáung sǎeng kǎung máung pán jàut", taiToEng("ၺ ဝႃႈ ၺွင်း သဵင်ၵွင်မွင်းပၼ်းၸွတ်ႇ"));
        // tii & ti
        assertEquals("ta wāa tào tīi yù kào hím nǎung", taiToEng("တ ဝႃႈ တဝ်ႇ တီႈယူႇၵဝ်ႇ ႁိမ်းၼွင်"));
        assertEquals("tha wāa thǎi tám yǎi wâ̰i sǎam māak", taiToEng("ထ ဝႃႈ ထႆ တမ်းယႆဝႆႉသၢမ်မၢၵ်ႈ"));
        assertEquals("na wāa nǔ máu jǔ jǔ jáum jâ̰uk", taiToEng("ၼ ဝႃႈ ၼူ မေႃးၸူၸူၸွမ်းၸွၵ်ႉ"));
        // a
        assertEquals("pa wāa pǎa ʼèao lúi hǎa kǐn yòe", taiToEng("ပ ဝႃႈ ပႃ ဢႅဝ်ႇလုၺ်းႁႃၵိၼ်ယိူဝ်ႇ"));
        assertEquals("pha wāa phūeng phâ̰um lùp yūeng háet hóng", taiToEng("ၽ ဝႃႈ ၽိုင်ႈ ၽွမ်ႉလုပ်ႇယိုင်ႈႁဵတ်းႁူင်း"));
        assertEquals("fa wāa fâ̰a nâ̰i pǎen fâ̰a kǎang hǎao", taiToEng("ၾ ဝႃႈ ၾႃႉ ၼႆႉပဵၼ်ၾႃႉၵၢင်ႁၢဝ်"));
        assertEquals("ma wāa mē sǎun yàen ngē lūk láang", taiToEng("မ ဝႃႈ မႄႈ သွၼ်ယဵၼ်ႇငႄႈလုၵ်ႈလၢင်း"));
        assertEquals("ya wāa yúng kǎang sút múng jàng lāut", taiToEng("ယ ဝႃႈ ယုင်း ၵၢင်သုတ်းမုင်းၸင်ႇလွတ်ႈ"));
        // a
        assertEquals("ra wāa ráen ʼàan sǎun háen tīi pàung", taiToEng("ရ ဝႃႈ ရဵၼ်း ဢၢၼ်ႇသွၼ်ႁဵၼ်းတီႈပွင်ႇ"));
        assertEquals("la wāa lâ̰u hāu kwàa tâ̰u khó sǒn", taiToEng("လ ဝႃႈ လေႃႉ ႁေႃႈၵႂႃႇတေႃႉၶူဝ်းသူၼ်"));
        assertEquals("wa wāa wó tǒ tâ̰u khó kwàa kàat", taiToEng("ဝ ဝႃႈ ဝူဝ်း တူဝ်တေႃႉၶူဝ်းၵႂႃႇၵၢတ်ႇ"));
        assertEquals("ha wāa hóe wāai lát móe khāam tāa", taiToEng("ႁ ဝႃႈ ႁိူဝ်း ဝၢႆႈလတ်းမိူဝ်းၶၢမ်ႈတႃႈ"));
        // a
        assertEquals("a wāa ʼāui jáem jāui jāui kǐn wǎan", taiToEng("ဢ ဝႃႈ ဢွႆႈ ၸဵမ်းၸွႆႈၸွႆႈၵိၼ်ဝၢၼ်"));
    }

    @Test
    public void Test_Pangram() {
        assertEquals(
                "páu khāue kya khèn kwàa jǔeng tǎe lāi hâ̰ung sràa lǐi ráen hṵ̂ sǎun phúek nyáa mōe fâ̰a pàang jáai sàang lē yíng ʼô̰ei pǎe núek sóe kyàu túek thāa jǎm lē táng kǎi nâ̰n sa᷈a",
                taiToEng("ပေႃးၶႂ်ႈၵျၶႅၼ်ႇၵႂႃႇၸိုင် တေလႆႈႁွင်ႉသြႃႇလီရဵၼ်းႁူႉသွၼ်ၽိုၵ်း ၺႃးမိူဝ်ႈၾႃႉပၢင်ႇ ၸၢႆးသၢင်ႇလႄႈ ယိင်းဢိူၺ်ႉပေၼိုၵ်း သိူဝ်းၵျေႃႇတိုၵ်းထႃႈ ၸံလႄႈတင်းၵႆၼၼ်ႉသႃႊ"));
    }

    @Test
    public void Test1() {
        // ဢ ဢႃ ဢီ ဢေ ဢႄ ဢူ ဢူဝ် ဢေႃ ဢိုဝ် ဢိူဝ်
        assertEquals("ka khǎa khǐi ngǎe jě sǔ tǒ thǎu lǔe hǒe", taiToEng("ၵၶႃၶီငေၸႄသူတူဝ်ထေႃလိုဝ်ႁိူဝ်"));
        assertEquals("pǎa sàa thāa náa mâ̰a sa᷈a", taiToEng("ပႃသႃႇထႃႈၼႃးမႃႉသႃႊ"));
        assertEquals("sǐi mìi tīi jíi thḭ̂i li᷈i", taiToEng("သီမီႇတီႈၸီးထီႉလီႊ"));
        assertEquals("tǎe sàe māe jáe tâ̰e ha᷈e", taiToEng("တေသေႇမေႈၸေးတေႉႁေႊ"));
        assertEquals("tě lè mē mé pḛ̂ ke᷈", taiToEng("တႄလႄႇမႄႈမႄးပႄႉၵႄႊ"));
        Assert.assertEquals("ၼူ လူႇ ၵူႈ မူး ၸူႉ တူႊ", syllable_break("ၼူလူႇၵူႈမူးၸူႉတူႊ"));
        assertEquals("nǔ lù kū mú jṵ̂ tu᷈", taiToEng("ၼူလူႇၵူႈမူးၸူႉတူႊ"));
        assertEquals("khǒ thò kō só khô̰ mo᷈", taiToEng("ၶူဝ်ထူဝ်ႇၵူဝ်ႈသူဝ်းၶူဝ်ႉမူဝ်ႊ"));
        assertEquals("tǎu màu khāu láu sâ̰u ka᷈u", taiToEng("တေႃမေႃႇၶေႃႈလေႃးသေႃႉၵေႃႊ"));
        assertEquals("tǔe thùe mūe múe lṵ̂e khu᷈e", taiToEng("တိုဝ်ထိုဝ်ႇမိုဝ်ႈမိုဝ်းလိုဝ်ႉၶိုဝ်ႊ"));
        assertEquals("lǒe mòe sōe tóe khô̰e no᷈e", taiToEng("လိူဝ်မိူဝ်ႇသိူဝ်ႈတိူဝ်းၶိူဝ်ႉၼိူဝ်ႊ"));
    }

    @Test
    public void Test2() {
        // ဢႆ ဢၢႆ ဢုၺ် ဢူၺ် ဢွႆ ဢိုၺ် ဢိူၺ်
        assertEquals("kǎi khǎai kǔi khǒi khǎui tǔei tǒei mǎue", taiToEng("ၵႆၶၢႆၵုၺ်ၶူၺ်ၶွႆတိုၺ်တိူၺ်မႂ်"));
        assertEquals("kǎi kài māi tái sâ\u0330i ha᷈i", taiToEng("ၵႆၵႆႇမႆႈတႆးသႆႉႁႆႊ"));
        assertEquals("khǎai jàai ngāai jáai sâ\u0330ai la᷈ai", taiToEng("ၶၢႆၸၢႆႇငၢႆႈၸၢႆးသၢႆႉလၢႆႊ"));
        assertEquals("tǔi tùi thūi lúi kû\u0330i ku᷈i", taiToEng("တုၺ်တုၺ်ႇထုၺ်ႈလုၺ်းၵုၺ်ႉၵုၺ်ႊ"));
        assertEquals("mǒi tòi lōi tói thô\u0330i ko᷈i", taiToEng("မူၺ်တူၺ်ႇလူၺ်ႈတူၺ်းထူၺ်ႉၵူၺ်ႊ"));
        assertEquals("khǎui sàui kāui táui sâ\u0330ui kha᷈ui", taiToEng("ၶွႆသွႆႇၵွႆႈတွႆးသွႆႉၶွႆႊ"));
        assertEquals("kǔei khùei ngūei júei sû\u0330ei tu᷈ei", taiToEng("ၵိုၺ်ၶိုၺ်ႇငိုၺ်ႈၸိုၺ်းသိုၺ်ႉတိုၺ်ႊ"));
        assertEquals("tǒei thòei nōei póei phô\u0330ei mo᷈ei", taiToEng("တိူၺ်ထိူၺ်ႇၼိူၺ်ႈပိူၺ်းၽိူၺ်ႉမိူၺ်ႊ"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ဢၢဝ် ဢိဝ် ဢဵဝ် ဢႅဝ် ဢႂ်
        assertEquals("kǎo khǎao lǐo khǎeo lěao khǎue", taiToEng("ၵဝ်ၶၢဝ်လိဝ်ၶဵဝ်လႅဝ်ၶႂ်"));
        assertEquals("kǎo khào jāo sáo lâ\u0330o ma᷈o", taiToEng("ၵဝ်ၶဝ်ႇၸဝ်ႈသဝ်းလဝ်ႉမဝ်ႊ"));
        assertEquals("khǎao kàao pāao háao tâ\u0330ao sa᷈ao", taiToEng("ၶၢဝ်ၵၢဝ်ႇပၢဝ်ႈႁၢဝ်းတၢဝ်ႉသၢဝ်ႊ"));
        assertEquals("sǐo lìo kīo khío lî\u0330o ti᷈o", taiToEng("သိဝ်လိဝ်ႇၵိဝ်ႈၶိဝ်းလိဝ်ႉတိဝ်ႊ"));
        assertEquals("lǎeo pàeo kāeo máeo lâ\u0330eo ka᷈eo", taiToEng("လဵဝ်ပဵဝ်ႇၵဵဝ်ႈမဵဝ်းလဵဝ်ႉၵဵဝ်ႊ"));
        assertEquals("lěao kèao kēao léao khê\u0330ao je᷈ao", taiToEng("လႅဝ်ၵႅဝ်ႇၵႅဝ်ႈလႅဝ်းၶႅဝ်ႉၸႅဝ်ႊ"));
        assertEquals("lǎue sàue kāue náue nâ\u0330ue la᷈ue", taiToEng("လႂ်သႂ်ႇၵႂ်ႈၼႂ်းၼႂ်ႉလႂ်ႊ"));
    }

    @Test
    public void Test4() {
        // တူဝ်ၽႅတ်းသဵင်လင် - ဢမ်, ဢၼ်, ဢင်
        assertEquals("khǎn kǎam lǐng khǎen kěm khǔn sǒn pǎung sǔeng lǒem", taiToEng("ၶၼ်ၵၢမ်လိင်ၶဵၼ်ၵႅမ်ၶုၼ်သူၼ်ပွင်သိုင်လိူမ်"));
        assertEquals("kǎn khàng jām jáng nâ\u0330m tha᷈ng", taiToEng("ၵၼ်ၶင်ႇၸမ်ႈၸင်းၼမ်ႉထင်ႊ"));
        assertEquals("lǎan sàang khāang táang mâ\u0330an tha᷈am", taiToEng("လၢၼ်သၢင်ႇၶၢင်ႈတၢင်းမၢၼ်ႉထၢမ်ႊ"));
        assertEquals("lǐn sìm pīn khíng lî\u0330m ki᷈n", taiToEng("လိၼ်သိမ်ႇပိၼ်ႈၶိင်းလိမ်ႉၵိၼ်ႊ"));
        assertEquals("khǎen làeng sāen káem lâ\u0330eng pa᷈em", taiToEng("ၶဵၼ်လဵင်ႇသဵၼ်ႈၵဵမ်းလဵင်ႉပဵမ်ႊ"));
        assertEquals("měn jèng khēm léng tê\u0330m te᷈ng", taiToEng("မႅၼ်ၸႅင်ႇၶႅမ်ႈလႅင်းတႅမ်ႉတႅင်ႊ"));
        assertEquals("khǔn kùng jūng júm khû\u0330n pu᷈n", taiToEng("ၶုၼ်ၵုင်ႇၸုင်ႈၸုမ်းၶုၼ်ႉပုၼ်ႊ"));
        assertEquals("sǒn lòm khōng lóm kô\u0330n to᷈ng", taiToEng("သူၼ်လူမ်ႇၶူင်ႈလူမ်းၵူၼ်ႉတူင်ႊ"));
        assertEquals("sǎun làun jāung kyáung lâ\u0330um ja᷈um", taiToEng("သွၼ်လွၼ်ႇၸွင်ႈၵျွင်းလွမ်ႉၸွမ်ႊ"));
        assertEquals("khǔeng jùen tūen kúem thû\u0330eng ju᷈eng", taiToEng("ၶိုင်ၸိုၼ်ႇတိုၼ်ႈၵိုမ်းထိုင်ႉၸိုင်ႊ"));
        assertEquals("pǒen khòeng ngōem lóeng jô\u0330eng kho᷈eng", taiToEng("ပိူၼ်ၶိူင်ႇငိူမ်ႈလိူင်းၸိူင်ႉၶိူင်ႊ"));
    }

    @Test
    public void Test5() {
        // တူဝ်ၽႅတ်းသဵင်ၶၢတ်ႇ - ဢၵ်, ဢပ်, ဢတ်
        assertEquals("khǎt lǎat lǐk lǎep lěp lǔk tǒt pǎuk khǔet kǒet", taiToEng("ၶတ်လၢတ်လိၵ်လဵပ်လႅပ်လုၵ်တူတ်ပွၵ်ၶိုတ်ၵိူတ်"));
        assertEquals("khǎt jàk sāt sáp lâ\u0330p ta᷈k", taiToEng("ၶတ်ၸၵ်ႇသတ်ႈသပ်းလပ်ႉတၵ်ႊ"));
        assertEquals("khǎat làap lāat máak sâ\u0330ak tha᷈at", taiToEng("ၶၢတ်လၢပ်ႇလၢတ်ႈမၢၵ်းသၢၵ်ႉထၢတ်ႊ"));
        assertEquals("pǐk tàet māet lâ\u0330ek lép khe᷈k", taiToEng("ပိၵ်တဵတ်ႇမဵတ်ႈလဵၵ်ႉလႅပ်းၶႅၵ်ႊ"));
        assertEquals("jǔp thùk nōt káup lô\u0330t ta᷈up", taiToEng("ၸုပ်ထုၵ်ႇၼူတ်ႈၵွပ်းလူတ်ႉတွပ်ႊ"));
        assertEquals("lǒet sùep thōek kúek khû\u0330ek ko᷈et", taiToEng("လိူတ်သိုပ်ႇထိူၵ်ႈၵိုၵ်းၶိုၵ်ႉၵိူတ်ႊ"));
    }


}
