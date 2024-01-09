package it.saimao.shan_converter;

import it.saimao.shan_converter.converters.LaoThaiTransliterationKt;

public class Main {
    public static void main(String[] args) {
//        String[] phrases = ShanSyllableBreaker.syllable_break("လိူတ်သိုပ်ႇထိူၵ်ႈၵိုၵ်းၶိုၵ်ႉၵိူတ်ႊ").split("\u0020");
//        StringBuilder result = new StringBuilder();
//        Arrays.stream(phrases).forEach(s -> {
//            result.append(ShanTranslit.taiToEng(s)).append(" ");
//        });
        String laoText = " ແມ່ນບົດຄວາມທີ່ໄດ້ຮັບການພິຈາລະນາວ່າດີຫຼາຍສຸດໃນວິກິພີເດຍ ຈາກການຕັດສິນຄັດເລືອກຂອງຊາວວິກິພີເດຍ ກ່ອນທີ່ໄດ້ຮັບການບັນທຶກໃນລາຍຊື່ດ້ານລຸ່ມນີ້ ບົດຄວາມຈະຕ້ອງຜ່ານການ";
        System.out.println("Lao : " + laoText);

        String output = LaoThaiTransliterationKt.lao2thai_script(laoText);
        System.out.println("Thai : " + output);

        laoText = LaoThaiTransliterationKt.thai2lao_script(output);
        System.out.println("Lao again : " + laoText);
    }
}