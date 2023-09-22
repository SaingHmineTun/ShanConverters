package it.saimao.shan_converter.converters;

import org.junit.Assert;
import org.junit.Test;

import static it.saimao.shan_converter.breakers.ShanSyllableBreaker.syllable_break;
import static it.saimao.shan_converter.converters.ShanTranslit.*;
import static org.junit.Assert.assertEquals;

public class ShanTranslitPhrasalTest {
    @Test
    public void Test_Major() {
        assertEquals("ka wāa kài kāup tài mâ̰i nǒe káun", taiToEng("ၵ ဝႃႈ ၵႆႇ ၵွပ်ႈတႆႇမႆႉၼိူဝ်ၵွၼ်း"));
        assertEquals("kha wāa khài mē mán pài máa ngáum", taiToEng("ၶ ဝႃႈ ၶႆႇ မႄႈမၼ်းပႆႇမႃးငွမ်း"));
        assertEquals("nga wāa ngú lōen máa tsú tǒ khàet", taiToEng("င ဝႃႈ ငူး လိူၼ်ႈမႃးၸူးတူဝ်ၶဵတ်ႇ"));
        // a
        assertEquals("tsa wāa tsâ̰ang pǎi ʼô̰ng ʼâ̰ang tsáum táang. tsa wāa tsâ̰ang pǎi ʼô̰ng ʼâ̰ang tsáum táang.", taiToEng("ၸ ဝႃႈ ၸၢင်ႉ ပႆဢူင်ႉဢၢင်ႉၸွမ်းတၢင်း။ ၸ ဝႃႈ ၸၢင်ႉ ပႆဢူင်ႉဢၢင်ႉၸွမ်းတၢင်း။"));
        // mii & mi
        assertEquals("sa wāa sǒe míi yù nǒe làa hâ̰a", taiToEng("သ ဝႃႈ သိူဝ် မီးယူႇၼိူဝ်လႃႇႁႃႉ"));
        assertEquals("nya wāa nyáung sǎeng kǎung máung pán tsàut", taiToEng("ၺ ဝႃႈ ၺွင်း သဵင်ၵွင်မွင်းပၼ်းၸွတ်ႇ"));
        // tii & ti
        assertEquals("ta wāa tào tīi yù kào hím nǎung", taiToEng("တ ဝႃႈ တဝ်ႇ တီႈယူႇၵဝ်ႇ ႁိမ်းၼွင်"));
        assertEquals("tha wāa thǎi tám yǎi wâ̰i sǎam māak", taiToEng("ထ ဝႃႈ ထႆ တမ်းယႆဝႆႉသၢမ်မၢၵ်ႈ"));
        assertEquals("na wāa nǔ máu tsǔ tsǔ tsáum tsâ̰uk", taiToEng("ၼ ဝႃႈ ၼူ မေႃးၸူၸူၸွမ်းၸွၵ်ႉ"));
        // a
        assertEquals("pa wāa pǎa ʼèao lúi hǎa kǐn yòe", taiToEng("ပ ဝႃႈ ပႃ ဢႅဝ်ႇလုၺ်းႁႃၵိၼ်ယိူဝ်ႇ"));
        assertEquals("pha wāa phūeng phâ̰um lùp yūeng háet hóng", taiToEng("ၽ ဝႃႈ ၽိုင်ႈ ၽွမ်ႉလုပ်ႇယိုင်ႈႁဵတ်းႁူင်း"));
        assertEquals("fa wāa fâ̰a nâ̰i pǎen fâ̰a kǎang hǎao", taiToEng("ၾ ဝႃႈ ၾႃႉ ၼႆႉပဵၼ်ၾႃႉၵၢင်ႁၢဝ်"));
        assertEquals("ma wāa mē sǎun yàen ngē lūk láang", taiToEng("မ ဝႃႈ မႄႈ သွၼ်ယဵၼ်ႇငႄႈလုၵ်ႈလၢင်း"));
        assertEquals("ya wāa yúng kǎang sút múng tsàng lāut", taiToEng("ယ ဝႃႈ ယုင်း ၵၢင်သုတ်းမုင်းၸင်ႇလွတ်ႈ"));
        // a
        assertEquals("ra wāa ráen ʼàan sǎun háen tīi pàung", taiToEng("ရ ဝႃႈ ရဵၼ်း ဢၢၼ်ႇသွၼ်ႁဵၼ်းတီႈပွင်ႇ"));
        assertEquals("la wāa lâ̰u hāu kwàa tâ̰u khó sǒn", taiToEng("လ ဝႃႈ လေႃႉ ႁေႃႈၵႂႃႇတေႃႉၶူဝ်းသူၼ်"));
        assertEquals("wa wāa wó tǒ tâ̰u khó kwàa kàat", taiToEng("ဝ ဝႃႈ ဝူဝ်း တူဝ်တေႃႉၶူဝ်းၵႂႃႇၵၢတ်ႇ"));
        assertEquals("ha wāa hóe wāai lát móe khāam tāa", taiToEng("ႁ ဝႃႈ ႁိူဝ်း ဝၢႆႈလတ်းမိူဝ်းၶၢမ်ႈတႃႈ"));
        // a
        assertEquals("a wāa ʼāui tsáem tsāui tsāui kǐn wǎan", taiToEng("ဢ ဝႃႈ ဢွႆႈ ၸဵမ်းၸွႆႈၸွႆႈၵိၼ်ဝၢၼ်"));
    }

    @Test
    public void Test_Pangram() {
        assertEquals(
                "páu khāue kya khèn kwàa tsǔeng tǎe lāi hâ̰ung sràa lǐi ráen hṵ̂ sǎun phúek nyáa mōe fâ̰a pàang tsáai sàang lē yíng ʼô̰ei pǎe núek sóe kyàu túek thāa tsǎm lē táng kǎi nâ̰n sa᷈a",
                taiToEng("ပေႃးၶႂ်ႈၵျၶႅၼ်ႇၵႂႃႇၸိုင် တေလႆႈႁွင်ႉသြႃႇလီရဵၼ်းႁူႉသွၼ်ၽိုၵ်း ၺႃးမိူဝ်ႈၾႃႉပၢင်ႇ ၸၢႆးသၢင်ႇလႄႈ ယိင်းဢိူၺ်ႉပေၼိုၵ်း သိူဝ်းၵျေႃႇတိုၵ်းထႃႈ ၸံလႄႈတင်းၵႆၼၼ်ႉသႃႊ"));
    }

    @Test
    public void Test_Pangram_ETT() {
        assertEquals(
                "ပေႃး ၶႂ်ႈ ၵျ ၶႅၼ်ႇ ၵႂႃႇ ၸိုင် တေ လႆႈ ႁွင်ႉ သြႃႇ လီ ရဵၼ်း ႁူႉ သွၼ် ၽိုၵ်း ၺႃး မိူဝ်ႈ ၾႃႉ ပၢင်ႇ ၸၢႆး သၢင်ႇ လႄႈ ယိင်း ဢိူၺ်ႉ ပေ ၼိုၵ်း သိူဝ်း ၵျေႃႇ တိုၵ်း ထႃႈ ၸမ် လႄႈ တင်း ၵႆ ၼၼ်ႉ သႃႊ",
                engToTai("páu khāue kya khèn kwàa tsǔeng tǎe lāi hâ̰ung sràa lǐi ráen hṵ̂ sǎun phúek nyáa mōe fâ̰a pàang tsáai sàang lē yíng ʼô̰ei pǎe núek sóe kyàu túek thāa tsǎm lē táng kǎi nâ̰n sa᷈a"));
    }

    @Test
    public void Test1() {
        // ဢ ဢႃ ဢီ ဢေ ဢႄ ဢူ ဢူဝ် ဢေႃ ဢိုဝ် ဢိူဝ်
        assertEquals("ka khǎa khǐi ngǎe tsě sǔ tǒ thǎu lǔe hǒe", taiToEng("ၵၶႃၶီငေၸႄသူတူဝ်ထေႃလိုဝ်ႁိူဝ်"));
        assertEquals("pǎa sàa thāa náa mâ̰a sa᷈a", taiToEng("ပႃသႃႇထႃႈၼႃးမႃႉသႃႊ"));
        assertEquals("sǐi mìi tīi tsíi thḭ̂i li᷈i", taiToEng("သီမီႇတီႈၸီးထီႉလီႊ"));
        assertEquals("tǎe sàe māe tsáe tâ̰e ha᷈e", taiToEng("တေသေႇမေႈၸေးတေႉႁေႊ"));
        assertEquals("tě lè mē mé pḛ̂ ke᷈", taiToEng("တႄလႄႇမႄႈမႄးပႄႉၵႄႊ"));
        Assert.assertEquals("ၼူ လူႇ ၵူႈ မူး ၸူႉ တူႊ", syllable_break("ၼူလူႇၵူႈမူးၸူႉတူႊ"));
        assertEquals("nǔ lù kū mú tsṵ̂ tu᷈", taiToEng("ၼူလူႇၵူႈမူးၸူႉတူႊ"));
        assertEquals("khǒ thò kō só khô̰ mo᷈", taiToEng("ၶူဝ်ထူဝ်ႇၵူဝ်ႈသူဝ်းၶူဝ်ႉမူဝ်ႊ"));
        assertEquals("tǎu màu khāu láu sâ̰u ka᷈u", taiToEng("တေႃမေႃႇၶေႃႈလေႃးသေႃႉၵေႃႊ"));
        assertEquals("tǔe thùe mūe múe lṵ̂e khu᷈e", taiToEng("တိုဝ်ထိုဝ်ႇမိုဝ်ႈမိုဝ်းလိုဝ်ႉၶိုဝ်ႊ"));
        assertEquals("lǒe mòe sōe tóe khô̰e no᷈e", taiToEng("လိူဝ်မိူဝ်ႇသိူဝ်ႈတိူဝ်းၶိူဝ်ႉၼိူဝ်ႊ"));
    }

    @Test
    public void Test1ett() {
        // ဢ ဢႃ ဢီ ဢေ ဢႄ ဢူ ဢူဝ် ဢေႃ ဢိုဝ် ဢိူဝ်
        assertEquals("ၵ ၶႃ ၶီ ငေ ၸႄ သူ တူဝ် ထေႃ လိုဝ် ႁိူဝ်", engToTai("ka khǎa khǐi ngǎe tsě sǔ tǒ thǎu lǔe hǒe"));
        assertEquals("ပႃ သႃႇ ထႃႈ ၼႃး မႃႉ သႃႊ", engToTai("pǎa sàa thāa náa mâ̰a sa᷈a"));
        assertEquals("သီ မီႇ တီႈ ၸီး ထီႉ လီႊ", engToTai("sǐi mìi tīi tsíi thḭ̂i li᷈i"));
        assertEquals("တေ သေႇ မေႈ ၸေး တေႉ ႁေႊ", engToTai("tǎe sàe māe tsáe tâ̰e ha᷈e"));
        assertEquals("တႄ လႄႇ မႄႈ မႄး ပႄႉ ၵႄႊ", engToTai("tě lè mē mé pḛ̂ ke᷈"));
        assertEquals("ၼူ လူႇ ၵူႈ မူး ၸူႉ တူႊ", engToTai("nǔ lù kū mú tsṵ̂ tu᷈"));
        assertEquals("ၶူဝ် ထူဝ်ႇ ၵူဝ်ႈ သူဝ်း ၶူဝ်ႉ မူဝ်ႊ", engToTai("khǒ thò kō só khô̰ mo᷈"));
        assertEquals("တေႃ မေႃႇ ၶေႃႈ လေႃး သေႃႉ ၵေႃႊ", engToTai("tǎu màu khāu láu sâ̰u ka᷈u"));
        assertEquals("တိုဝ် ထိုဝ်ႇ မိုဝ်ႈ မိုဝ်း လိုဝ်ႉ ၶိုဝ်ႊ", engToTai("tǔe thùe mūe múe lṵ̂e khu᷈e"));
        assertEquals("လိူဝ် မိူဝ်ႇ သိူဝ်ႈ တိူဝ်း ၶိူဝ်ႉ ၼိူဝ်ႊ", engToTai("lǒe mòe sōe tóe khô̰e no᷈e"));
    }

    @Test
    public void Test2() {
        // ဢႆ ဢၢႆ ဢုၺ် ဢူၺ် ဢွႆ ဢိုၺ် ဢိူၺ်
        assertEquals("kǎi khǎai kǔi khǒi khǎui tǔei tǒei mǎue", taiToEng("ၵႆၶၢႆၵုၺ်ၶူၺ်ၶွႆတိုၺ်တိူၺ်မႂ်"));
        assertEquals("kǎi kài māi tái sâ\u0330i ha᷈i", taiToEng("ၵႆၵႆႇမႆႈတႆးသႆႉႁႆႊ"));
        assertEquals("khǎai tsàai ngāai tsáai sâ\u0330ai la᷈ai", taiToEng("ၶၢႆၸၢႆႇငၢႆႈၸၢႆးသၢႆႉလၢႆႊ"));
        assertEquals("tǔi tùi thūi lúi kû\u0330i ku᷈i", taiToEng("တုၺ်တုၺ်ႇထုၺ်ႈလုၺ်းၵုၺ်ႉၵုၺ်ႊ"));
        assertEquals("mǒi tòi lōi tói thô\u0330i ko᷈i", taiToEng("မူၺ်တူၺ်ႇလူၺ်ႈတူၺ်းထူၺ်ႉၵူၺ်ႊ"));
        assertEquals("khǎui sàui kāui táui sâ\u0330ui kha᷈ui", taiToEng("ၶွႆသွႆႇၵွႆႈတွႆးသွႆႉၶွႆႊ"));
        assertEquals("kǔei khùei ngūei tsúei sû\u0330ei tu᷈ei", taiToEng("ၵိုၺ်ၶိုၺ်ႇငိုၺ်ႈၸိုၺ်းသိုၺ်ႉတိုၺ်ႊ"));
        assertEquals("tǒei thòei nōei póei phô\u0330ei mo᷈ei", taiToEng("တိူၺ်ထိူၺ်ႇၼိူၺ်ႈပိူၺ်းၽိူၺ်ႉမိူၺ်ႊ"));
    }

    @Test
    public void Test2ett() {
        // ဢႆ ဢၢႆ ဢုၺ် ဢူၺ် ဢွႆ ဢိုၺ် ဢိူၺ်
        assertEquals("ၵႆ ၶၢႆ ၵုၺ် ၶူၺ် ၶွႆ တိုၺ် တိူၺ် မႂ်", engToTai("kǎi khǎai kǔi khǒi khǎui tǔei tǒei mǎue"));
        assertEquals("ၵႆ ၵႆႇ မႆႈ တႆး သႆႉ ႁႆႊ", engToTai("kǎi kài māi tái sâ\u0330i ha᷈i"));
        assertEquals("ၶၢႆ ၸၢႆႇ ငၢႆႈ ၸၢႆး သၢႆႉ လၢႆႊ", engToTai("khǎai tsàai ngāai tsáai sâ\u0330ai la᷈ai"));
        assertEquals("တုၺ် တုၺ်ႇ ထုၺ်ႈ လုၺ်း ၵုၺ်ႉ ၵုၺ်ႊ", engToTai("tǔi tùi thūi lúi kû\u0330i ku᷈i"));
        assertEquals("မူၺ် တူၺ်ႇ လူၺ်ႈ တူၺ်း ထူၺ်ႉ ၵူၺ်ႊ", engToTai("mǒi tòi lōi tói thô\u0330i ko᷈i"));
        assertEquals("ၶွႆ သွႆႇ ၵွႆႈ တွႆး သွႆႉ ၶွႆႊ", engToTai("khǎui sàui kāui táui sâ\u0330ui kha᷈ui"));
        assertEquals("ၵိုၺ် ၶိုၺ်ႇ ငိုၺ်ႈ ၸိုၺ်း သိုၺ်ႉ တိုၺ်ႊ", engToTai("kǔei khùei ngūei tsúei sû\u0330ei tu᷈ei"));
        assertEquals("တိူၺ် ထိူၺ်ႇ ၼိူၺ်ႈ ပိူၺ်း ၽိူၺ်ႉ မိူၺ်ႊ", engToTai("tǒei thòei nōei póei phô\u0330ei mo᷈ei"));
    }

    @Test
    public void Test3() {
        // ဢဝ် ဢၢဝ် ဢိဝ် ဢဵဝ် ဢႅဝ် ဢႂ်
        assertEquals("kǎo khǎao lǐo khǎeo lěao khǎue", taiToEng("ၵဝ်ၶၢဝ်လိဝ်ၶဵဝ်လႅဝ်ၶႂ်"));
        assertEquals("kǎo khào tsāo sáo lâ\u0330o ma᷈o", taiToEng("ၵဝ်ၶဝ်ႇၸဝ်ႈသဝ်းလဝ်ႉမဝ်ႊ"));
        assertEquals("khǎao kàao pāao háao tâ\u0330ao sa᷈ao", taiToEng("ၶၢဝ်ၵၢဝ်ႇပၢဝ်ႈႁၢဝ်းတၢဝ်ႉသၢဝ်ႊ"));
        assertEquals("sǐo lìo kīo khío lî\u0330o ti᷈o", taiToEng("သိဝ်လိဝ်ႇၵိဝ်ႈၶိဝ်းလိဝ်ႉတိဝ်ႊ"));
        assertEquals("lǎeo pàeo kāeo máeo lâ\u0330eo ka᷈eo", taiToEng("လဵဝ်ပဵဝ်ႇၵဵဝ်ႈမဵဝ်းလဵဝ်ႉၵဵဝ်ႊ"));
        assertEquals("lěao kèao kēao léao khê\u0330ao tse᷈ao", taiToEng("လႅဝ်ၵႅဝ်ႇၵႅဝ်ႈလႅဝ်းၶႅဝ်ႉၸႅဝ်ႊ"));
        assertEquals("lǎue sàue kāue náue nâ\u0330ue la᷈ue", taiToEng("လႂ်သႂ်ႇၵႂ်ႈၼႂ်းၼႂ်ႉလႂ်ႊ"));
    }

    @Test
    public void Test3ett() {
        // ဢဝ် ဢၢဝ် ဢိဝ် ဢဵဝ် ဢႅဝ် ဢႂ်
        assertEquals("ၵဝ် ၶၢဝ် လိဝ် ၶဵဝ် လႅဝ် ၶႂ်", engToTai("kǎo khǎao lǐo khǎeo lěao khǎue"));
        assertEquals("ၵဝ် ၶဝ်ႇ ၸဝ်ႈ သဝ်း လဝ်ႉ မဝ်ႊ", engToTai("kǎo khào tsāo sáo lâ\u0330o ma᷈o"));
        assertEquals("ၶၢဝ် ၵၢဝ်ႇ ပၢဝ်ႈ ႁၢဝ်း တၢဝ်ႉ သၢဝ်ႊ", engToTai("khǎao kàao pāao háao tâ\u0330ao sa᷈ao"));
        assertEquals("သိဝ် လိဝ်ႇ ၵိဝ်ႈ ၶိဝ်း လိဝ်ႉ တိဝ်ႊ", engToTai("sǐo lìo kīo khío lî\u0330o ti᷈o"));
        assertEquals("လဵဝ် ပဵဝ်ႇ ၵဵဝ်ႈ မဵဝ်း လဵဝ်ႉ ၵဵဝ်ႊ", engToTai("lǎeo pàeo kāeo máeo lâ\u0330eo ka᷈eo"));
        assertEquals("လႅဝ် ၵႅဝ်ႇ ၵႅဝ်ႈ လႅဝ်း ၶႅဝ်ႉ ၸႅဝ်ႊ", engToTai("lěao kèao kēao léao khê\u0330ao tse᷈ao"));
        assertEquals("လႂ် သႂ်ႇ ၵႂ်ႈ ၼႂ်း ၼႂ်ႉ လႂ်ႊ", engToTai("lǎue sàue kāue náue nâ\u0330ue la᷈ue"));
    }

    @Test
    public void Test4() {
        // တူဝ်ၽႅတ်းသဵင်လင် - ဢမ်, ဢၼ်, ဢင်
        assertEquals("khǎn kǎam lǐng khǎen kěm khǔn sǒn pǎung sǔeng lǒem", taiToEng("ၶၼ်ၵၢမ်လိင်ၶဵၼ်ၵႅမ်ၶုၼ်သူၼ်ပွင်သိုင်လိူမ်"));
        assertEquals("kǎn khàng tsām tsáng nâ\u0330m tha᷈ng", taiToEng("ၵၼ်ၶင်ႇၸမ်ႈၸင်းၼမ်ႉထင်ႊ"));
        assertEquals("lǎan sàang khāang táang mâ\u0330an tha᷈am", taiToEng("လၢၼ်သၢင်ႇၶၢင်ႈတၢင်းမၢၼ်ႉထၢမ်ႊ"));
        assertEquals("lǐn sìm pīn khíng lî\u0330m ki᷈n", taiToEng("လိၼ်သိမ်ႇပိၼ်ႈၶိင်းလိမ်ႉၵိၼ်ႊ"));
        assertEquals("khǎen làeng sāen káem lâ\u0330eng pa᷈em", taiToEng("ၶဵၼ်လဵင်ႇသဵၼ်ႈၵဵမ်းလဵင်ႉပဵမ်ႊ"));
        assertEquals("měn tsèng khēm léng tê\u0330m te᷈ng", taiToEng("မႅၼ်ၸႅင်ႇၶႅမ်ႈလႅင်းတႅမ်ႉတႅင်ႊ"));
        assertEquals("khǔn kùng tsūng tsúm khû\u0330n pu᷈n", taiToEng("ၶုၼ်ၵုင်ႇၸုင်ႈၸုမ်းၶုၼ်ႉပုၼ်ႊ"));
        assertEquals("sǒn lòm khōng lóm kô\u0330n to᷈ng", taiToEng("သူၼ်လူမ်ႇၶူင်ႈလူမ်းၵူၼ်ႉတူင်ႊ"));
        assertEquals("sǎun làun tsāung kyáung lâ\u0330um tsa᷈um", taiToEng("သွၼ်လွၼ်ႇၸွင်ႈၵျွင်းလွမ်ႉၸွမ်ႊ"));
        assertEquals("khǔeng tsùen tūen kúem thû\u0330eng tsu᷈eng", taiToEng("ၶိုင်ၸိုၼ်ႇတိုၼ်ႈၵိုမ်းထိုင်ႉၸိုင်ႊ"));
        assertEquals("pǒen khòeng ngōem lóeng tsô\u0330eng kho᷈eng", taiToEng("ပိူၼ်ၶိူင်ႇငိူမ်ႈလိူင်းၸိူင်ႉၶိူင်ႊ"));
    }

    @Test
    public void Test4ett() {
        // တူဝ်ၽႅတ်းသဵင်လင် - ဢမ်, ဢၼ်, ဢင်
        assertEquals("ၶၼ် ၵၢမ် လိင် ၶဵၼ် ၵႅမ် ၶုၼ် သူၼ် ပွင် သိုင် လိူမ်", engToTai("khǎn kǎam lǐng khǎen kěm khǔn sǒn pǎung sǔeng lǒem"));
        assertEquals("ၵၼ် ၶင်ႇ ၸမ်ႈ ၸင်း ၼမ်ႉ ထင်ႊ", engToTai("kǎn khàng tsām tsáng nâ\u0330m tha᷈ng"));
        assertEquals("လၢၼ် သၢင်ႇ ၶၢင်ႈ တၢင်း မၢၼ်ႉ ထၢမ်ႊ", engToTai("lǎan sàang khāang táang mâ\u0330an tha᷈am"));
        assertEquals("လိၼ် သိမ်ႇ ပိၼ်ႈ ၶိင်း လိမ်ႉ ၵိၼ်ႊ", engToTai("lǐn sìm pīn khíng lî\u0330m ki᷈n"));
        assertEquals("ၶဵၼ် လဵင်ႇ သဵၼ်ႈ ၵဵမ်း လဵင်ႉ ပဵမ်ႊ", engToTai("khǎen làeng sāen káem lâ\u0330eng pa᷈em"));
        assertEquals("မႅၼ် ၸႅင်ႇ ၶႅမ်ႈ လႅင်း တႅမ်ႉ တႅင်ႊ", engToTai("měn tsèng khēm léng tê\u0330m te᷈ng"));
        assertEquals("ၶုၼ် ၵုင်ႇ ၸုင်ႈ ၸုမ်း ၶုၼ်ႉ ပုၼ်ႊ", engToTai("khǔn kùng tsūng tsúm khû\u0330n pu᷈n"));
        assertEquals("သူၼ် လူမ်ႇ ၶူင်ႈ လူမ်း ၵူၼ်ႉ တူင်ႊ", engToTai("sǒn lòm khōng lóm kô\u0330n to᷈ng"));
        assertEquals("သွၼ် လွၼ်ႇ ၸွင်ႈ ၵျွင်း လွမ်ႉ ၸွမ်ႊ", engToTai("sǎun làun tsāung kyáung lâ\u0330um tsa᷈um"));
        assertEquals("ၶိုင် ၸိုၼ်ႇ တိုၼ်ႈ ၵိုမ်း ထိုင်ႉ ၸိုင်ႊ", engToTai("khǔeng tsùen tūen kúem thû\u0330eng tsu᷈eng"));
        assertEquals("ပိူၼ် ၶိူင်ႇ ငိူမ်ႈ လိူင်း ၸိူင်ႉ ၶိူင်ႊ", engToTai("pǒen khòeng ngōem lóeng tsô\u0330eng kho᷈eng"));
    }

    @Test
    public void Test5() {
        // တူဝ်ၽႅတ်းသဵင်ၶၢတ်ႇ - ဢၵ်, ဢပ်, ဢတ်
        assertEquals("khǎt lǎat lǐk lǎep lěp lǔk tǒt pǎuk khǔet kǒet", taiToEng("ၶတ်လၢတ်လိၵ်လဵပ်လႅပ်လုၵ်တူတ်ပွၵ်ၶိုတ်ၵိူတ်"));
        assertEquals("khǎt tsàk sāt sáp lâ\u0330p ta᷈k", taiToEng("ၶတ်ၸၵ်ႇသတ်ႈသပ်းလပ်ႉတၵ်ႊ"));
        assertEquals("khǎat làap lāat máak sâ\u0330ak tha᷈at", taiToEng("ၶၢတ်လၢပ်ႇလၢတ်ႈမၢၵ်းသၢၵ်ႉထၢတ်ႊ"));
        assertEquals("pǐk tàet māet lâ\u0330ek lép khe᷈k", taiToEng("ပိၵ်တဵတ်ႇမဵတ်ႈလဵၵ်ႉလႅပ်းၶႅၵ်ႊ"));
        assertEquals("tsǔp thùk nōt káup lô\u0330t ta᷈up", taiToEng("ၸုပ်ထုၵ်ႇၼူတ်ႈၵွပ်းလူတ်ႉတွပ်ႊ"));
        assertEquals("lǒet sùep thōek kúek khû\u0330ek ko᷈et", taiToEng("လိူတ်သိုပ်ႇထိူၵ်ႈၵိုၵ်းၶိုၵ်ႉၵိူတ်ႊ"));
    }

    @Test
    public void Test5ett() {
        // တူဝ်ၽႅတ်းသဵင်ၶၢတ်ႇ - ဢၵ်, ဢပ်, ဢတ်
        assertEquals("ၶတ် လၢတ် လိၵ် လဵပ် လႅပ် လုၵ် တူတ် ပွၵ် ၶိုတ် ၵိူတ်", engToTai("khǎt lǎat lǐk lǎep lěp lǔk tǒt pǎuk khǔet kǒet"));
        assertEquals("ၶတ် ၸၵ်ႇ သတ်ႈ သပ်း လပ်ႉ တၵ်ႊ", engToTai("khǎt tsàk sāt sáp lâ\u0330p ta᷈k"));
        assertEquals("ၶၢတ် လၢပ်ႇ လၢတ်ႈ မၢၵ်း သၢၵ်ႉ ထၢတ်ႊ", engToTai("khǎat làap lāat máak sâ\u0330ak tha᷈at"));
        assertEquals("ပိၵ် တဵတ်ႇ မဵတ်ႈ လဵၵ်ႉ လႅပ်း ၶႅၵ်ႊ", engToTai("pǐk tàet māet lâ\u0330ek lép khe᷈k"));
        assertEquals("ၸုပ် ထုၵ်ႇ ၼူတ်ႈ ၵွပ်း လူတ်ႉ တွပ်ႊ", engToTai("tsǔp thùk nōt káup lô\u0330t ta᷈up"));
        assertEquals("လိူတ် သိုပ်ႇ ထိူၵ်ႈ ၵိုၵ်း ၶိုၵ်ႉ ၵိူတ်ႊ", engToTai("lǒet sùep thōek kúek khû\u0330ek ko᷈et"));
    }

    // SHAN -> ENGLISH without TONES
    @Test
    public void Test6ste() {
        assertEquals("pau khaue kya khen kwaa tsueng tae lai haung sraa lii raen hu saun phuek nyaa moe faa paang tsaai saang le ying ʼoei pae nuek soe kyau tuek thaa tsam le tang kai nan saa. tsaai maun kham song maa pan pan ka ran nai khao taang tue taa haet faun tai , Converter tai tae tae.", taiToEngWithoutTone("ပေႃးၶႂ်ႈၵျၶႅၼ်ႇၵႂႃႇၸိုင် တေလႆႈႁွင်ႉသြႃႇလီရဵၼ်းႁူႉသွၼ်ၽိုၵ်း ၺႃးမိူဝ်ႈၾႃႉပၢင်ႇ ၸၢႆးသၢင်ႇလႄႈ ယိင်းဢိူၺ်ႉပေၼိုၵ်း သိူဝ်းၵျေႃႇတိုၵ်းထႃႈ ၸံလႄႈတင်းၵႆၼၼ်ႉသႃႊ။ ၸၢႆးမွၼ်းၶမ်း သူင်ႇမႃးပၼ် ပၼ်ၵရၼ်ႇၼႆႉ ၶဝ်ႈတၢင်းတိုဝ်း တႃႇႁဵတ်ႉ ၾွၼ်ႉတႆး ၊ Converter တႆးတေႉတေႉ။"));
    }


}
