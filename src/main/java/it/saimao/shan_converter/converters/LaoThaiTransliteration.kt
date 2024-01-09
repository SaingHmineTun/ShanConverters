package it.saimao.shan_converter.converters

/*
Source : https://github.com/wannaphong/LaoNLP/blob/master/laonlp/transliterate/__init__.py
 */

//class LaoThaiTransliteration {
val lao2thai_transliteration = mapOf(
    "\u0e81" to "\u0e01",  // LAO LETTER KO KAY    → THAI CHARACTER KO KAI
    "\u0e82" to "\u0e02",  // LAO LETTER KHO KHAY  → THAI CHARACTER KHO KHAI
    "\u0e84" to "\u0e04",  // LAO LETTER KHO KHUAY → THAI CHARACTER KHO KHWAI
    "\u0e87" to "\u0e07",  // LAO LETTER NGO NGU   → THAI CHARACTER NGO NGU
    "\u0e88" to "\u0e08",  // LAO LETTER CO COK    → THAI CHARACTER CHO CHAN
    "\u0e8a" to "\u0e0a",  // LAO LETTER SO SANG   → THAI CHARACTER CHO CHANG
    "\u0e8d" to "\u0e0d",  // LAO LETTER NYO NYUNG → THAI CHARACTER YO YING
    "\u0e94" to "\u0e14",  // LAO LETTER DO DEK    → THAI CHARACTER DO DEK
    "\u0e95" to "\u0e15",  // LAO LETTER TO TA     → THAI CHARACTER TO TAO
    "\u0e96" to "\u0e16",  // LAO LETTER THO THONG → THAI CHARACTER THO THUNG
    "\u0e97" to "\u0e17",  // LAO LETTER THO THUNG → THAI CHARACTER THO THAHAN
    "\u0e99" to "\u0e19",  // LAO LETTER NO NOK    → THAI CHARACTER NO NU
    "\u0e9a" to "\u0e1a",  // LAO LETTER BO BE     → THAI CHARACTER BO BAIMAI
    "\u0e9b" to "\u0e1b",  // LAO LETTER PO PA     → THAI CHARACTER PO PLA
    "\u0e9c" to "\u0e1c",  // LAO LETTER PHO PHENG → THAI CHARACTER PHO PHUNG
    "\u0e9d" to "\u0e1d",  // LAO LETTER FO FA     → THAI CHARACTER FO FA
    "\u0e9e" to "\u0e1e",  // LAO LETTER PHO PHU   → THAI CHARACTER PHO PHAN
    "\u0e9f" to "\u0e1f",  // LAO LETTER FO FAY    → THAI CHARACTER FO FAN
    "\u0ea1" to "\u0e21",  // LAO LETTER MO MA     → THAI CHARACTER MO MA
    "\u0ea2" to "\u0e22",  // LAO LETTER YO YA     → THAI CHARACTER YO YAK
    "\u0ea3" to "\u0e23",  // LAO LETTER RO ROT    → THAI CHARACTER RO RUA
    "\u0ea5" to "\u0e25",  // LAO LETTER LO LING   → THAI CHARACTER LO LING
    "\u0ea7" to "\u0e27",  // LAO LETTER WO WI     → THAI CHARACTER WO WAEN
    "\u0eaa" to "\u0e2a",  // LAO LETTER SO SYA    → THAI CHARACTER SO SUA
    "\u0eab" to "\u0e2b",  // LAO LETTER HO HAY    → THAI CHARACTER HO HIP
    "\u0ead" to "\u0e2d",  // LAO LETTER O O       → THAI CHARACTER O ANG
    "\u0eae" to "\u0e2e",  // LAO LETTER HO HYA    → THAI CHARACTER HO NOKHUK
    "\u0eaf" to "\u0e2f",  // LAO ELLIPSIS → THAI CHARACTER PAIYAN NOI
    "\u0eb0" to "\u0e30",  // LAO VOWEL SIGN A       → THAI CHARACTER SARA A
    "\u0eb1" to "\u0e31",  // LAO VOWEL SIGN MAI KAN → THAI CHARACTER MAI HAN-AKAT
    "\u0eb2" to "\u0e32",  // LAO VOWEL SIGN AA      → THAI CHARACTER SARA AA
    "\u0eb3" to "\u0e33",  // LAO VOWEL SIGN AM      → THAI CHARACTER SARA AM
    "\u0eb4" to "\u0e34",  // LAO VOWEL SIGN I       → THAI CHARACTER SARA I
    "\u0eb5" to "\u0e35",  // LAO VOWEL SIGN II      → THAI CHARACTER SARA II
    "\u0eb6" to "\u0e36",  // LAO VOWEL SIGN Y       → THAI CHARACTER SARA UE
    "\u0eb7" to "\u0e37",  // LAO VOWEL SIGN YY      → THAI CHARACTER SARA UEE
    "\u0eb8" to "\u0e38",  // LAO VOWEL SIGN U       → THAI CHARACTER SARA U
    "\u0eb9" to "\u0e39",  // LAO VOWEL SIGN UU      → THAI CHARACTER SARA UU
    "\u0ebb" to "",        // LAO VOWEL SIGN MAI KONG", cf. Lao ເຈົ້າ vs. Thai เจ้า
    "\u0ebc" to "\u0e25",  // LAO SEMIVOWEL SIGN LO        → THAI CHARACTER LO LING
    "\u0ebd" to "\u0e0d",  // LAO SEMIVOWEL SIGN NYO FYANG → THAI CHARACTER YO YING
    "\u0ec0" to "\u0e40",  // LAO VOWEL SIGN E           → THAI CHARACTER SARA E
    "\u0ec1" to "\u0e41",  // LAO VOWEL SIGN EI          → THAI CHARACTER SARA AE
    "\u0ec2" to "\u0e42",  // LAO VOWEL SIGN O           → THAI CHARACTER SARA O
    "\u0ec3" to "\u0e43",  // LAO VOWEL SIGN AY MAI MUAN → THAI CHARACTER SARA AI MAI MUAN
    "\u0ec4" to "\u0e44",  // LAO VOWEL SIGN AI MAI MAY  → THAI CHARACTER SARA AI MAI MALAI
    "\u0ec6" to "\u0e46",  // LAO KO LA → THAI CHARACTER MAI YAMOK
    "\u0ec8" to "\u0e48",  // LAO TONE MAI EK     → THAI CHARACTER MAI EK
    "\u0ec9" to "\u0e49",  // LAO TONE MAI THO    → THAI CHARACTER MAI THO
    "\u0eca" to "\u0e4a",  // LAO TONE MAI TI     → THAI CHARACTER MAI TRI
    "\u0ecb" to "\u0e4b",  // LAO TONE MAI CATAWA → THAI CHARACTER MAI CHATTAWA
    "\u0ecc" to "\u0e4c",  // LAO CANCELLATION MARK → THAI CHARACTER THANTHAKHAT
    "\u0ecd" to "\u0e4d",  // LAO NIGGAHITA → THAI CHARACTER NIKHAHIT
    "\u0ed0" to "\u0e50",  // LAO DIGIT ZERO  → THAI DIGIT ZERO
    "\u0ed1" to "\u0e51",  // LAO DIGIT ONE   → THAI DIGIT ONE
    "\u0ed2" to "\u0e52",  // LAO DIGIT TWO   → THAI DIGIT TWO
    "\u0ed3" to "\u0e53",  // LAO DIGIT THREE → THAI DIGIT THREE
    "\u0ed4" to "\u0e54",  // LAO DIGIT FOUR  → THAI DIGIT FOUR
    "\u0ed5" to "\u0e55",  // LAO DIGIT FIVE  → THAI DIGIT FIVE
    "\u0ed6" to "\u0e56",  // LAO DIGIT SIX   → THAI DIGIT SIX
    "\u0ed7" to "\u0e57",  // LAO DIGIT SEVEN → THAI DIGIT SEVEN
    "\u0ed8" to "\u0e58",  // LAO DIGIT EIGHT → THAI DIGIT EIGHT
    "\u0ed9" to "\u0e59",  // LAO DIGIT NINE  → THAI DIGIT NINE
    "\u0edc" to "\u0e2b\u0e19",  // LAO HO NO → HO HIP + NO NU
    "\u0edd" to "\u0e2b\u0e21",  // LAO HO MO → HO HIP + MO MA
)

val laoChar = lao2thai_transliteration.keys
val thai2lao_transliteration = lao2thai_transliteration.entries.associate { (k, v) -> v to k }
val thaiChar = thai2lao_transliteration.keys


fun lao2thai_script(text: String): String {
    /*
Lao to Thai script
:param str sent: lao text
:return: returns a string of thai script
*/
    var newText = ""
    for (c in text.split("")) {
        newText +=
            if (laoChar.contains(c)) {
                lao2thai_transliteration[c]
            } else {
                c
            }
    }

    return newText
}

fun thai2lao_script(text: String): String {
    /*    Thai to Lao script
        :param str sent: thai text
        :return: returns a string of lao script
    */
    var newText = ""
    for (c in text.split("")) {
        newText += if (thaiChar.contains(c)) thai2lao_transliteration[c] else c
    }
    return newText

}