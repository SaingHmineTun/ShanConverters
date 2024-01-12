package it.saimao.shan_converter.converters


val shan2thai_transliteration = mapOf(
    "\u1075" to "\u0E01", // Ka
    "\u1076" to "\u0E02", // Kha
    // "\u1077" to "", // Ka Yai
    "\u1004" to "\u0E07", // Nga
    "\u1078" to "\u0E08", // Ja
    // "\u1079" to "", // Ja Yai
    "\u101E" to "\u0E2A", // Sa
    // "\u1080" to "", // Sa Yai
    "\u107A" to "\u0E0D", // Nya
    "\u1010" to "\u0E05", // Ta
    // "\u107B" to "", // Ta Yai
    "\u1011" to "\u0E16", // Tha
    "\u107C" to "\u0E19", // Na
    "\u1015" to "\u0E1B", // Pa
    // "\u107F" to "", // Pa Yai
    "\u107D" to "\u0E1C", // Pha
    "\u107E" to "\u0E1D", // Fa
    "\u1019" to "\u0E21", // Ma
    "\u101A" to "\u0E22", // Ya
    "\u101B" to "\u0E23", // Ra
    "\u101C" to "\u0E25", // La
    "\u101D" to "\u0E27", // Wa
    "\u1081" to "\u0E2B", // Ha
    "\u1022" to "\u0E2D", // A


)

val shanChars = shan2thai_transliteration.keys
val thai2shan_transliteration = shan2thai_transliteration.entries.associate { (k, v) -> v to k }
val thaiChars = thai2shan_transliteration.keys


fun shan2thai_script(text: String): String {
    /*
Lao to Thai script
:param str sent: lao text
:return: returns a string of thai script
*/
    var newText = ""
    for (c in text.split("")) {

        newText +=
            if (shanChars.contains(c)) {
                shan2thai_transliteration[c]
            } else {
                c
            }
    }

    return newText
}

fun thai2shan_script(text: String): String {
    /*
    Thai to Shan script
    :param String sent: thai text
    :returns a string of shan script
    */
    var newText = ""
    for (c in text.split("")) {
        newText += if (thaiChars.contains(c)) thai2shan_transliteration[c] else c
    }
    return newText

}