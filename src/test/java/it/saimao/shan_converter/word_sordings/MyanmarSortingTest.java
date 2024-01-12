package it.saimao.shan_converter.word_sordings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyanmarSortingTest {
    MyanmarSorting myanmarSorting = new MyanmarSorting();

    @Test
    public void test_sortConsonant() {

        // ကလေး
        String s1 = "ကလေး";
        String s2 = "ကလေးက";
        String result = myanmarSorting.sortConsonantString(s1, s2);
        System.out.println(result);
    }

    @Test
    public void test_sortMultipleConsonants() {
        List<String> list = Arrays.asList("အင်ကြင်း", "စွယ်တော်", "ခရေ");
        // Should output - ခရေ ၊ စွယ်တော် ၊ အင်ကြင်း
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
    }

    @Test
    public void test_sortMultipleConsonants2() {
        List<String> list = Arrays.asList("ပလာတာ", "ပယင်းကျောက်", "ပစပ်");
        /*
        ပစပ်
        ပယင်းကျောက်
        ပလာတာ
         */
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
    }

    @Test
    public void test_sortVowel() {
        List<String> list = Arrays.asList("ကိုးကွယ်", "ကဲမိုး", "ကာဆီး", "ကဲ့ရဲ့", "ကူညီ", "ကော်ရော်", "ကံ့ကော်", "ကညစ်");
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
        /*
        Should output
            ကညစ်
            ကာဆီး
            ကူညီ
            ကဲမိုး
            ကဲ့ရဲ့
            ကော်ရော်
            ကံ့ကော်
            ကိုးကွယ်
         */
    }

    @Test
    public void test_sortVowel2() {
        List<String> list = Arrays.asList("ဆိုးသွမ်း", "ဆူညံ", "ဆီ", "ဆားငန်", "ဆဲဆို", "ဆီဆမ်း", "ဆိုးယုတ်", "ဆီးသီး");
//        List<String> list = Arrays.asList("ဆီ", "ဆားငန်");
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
        /*
            ဆားငန်
            ဆီ
            ဆီဆမ်း
            ဆီးသီး
            ဆူညံ
            ဆဲဆို
            ဆိုးယုတ်
            ဆိုးသွမ်း
         */
    }

    @Test
    public void testAsat1() {
        // ကန့် ကို Wordbreak က နှစ်ခုသတ်မှတ်ထားတယ်။ ကျန်တာက အိုခေ
        List<String> list = Arrays.asList("ကန့်", "ကန်း", "ကန်း", "ကတ်", "ကယ်", "ကစ်", "ကင်", "ကမ်", "ကမ်းမမြင်");
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
    }

    @Test
    public void testAsat2() {
        // ကန့် ကို Wordbreak က နှစ်ခုသတ်မှတ်ထားတယ်။ ကျန်တာက အိုခေ
        List<String> list = Arrays.asList("ကောက်ရိုးပုံ", "ကောင်စစ်", "ကိုက်ဖြတ်", "ကတ်ကင်း", "ကင်းရှင်း", "ကိုင်းညွှတ်", "ကိုင်ဆုပ်", "ကောက်ရိုး", "ကောင်းမြတ်");
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
    }

    @Test
    public void testAsat3() {
        // ကန့် ကို Wordbreak က နှစ်ခုသတ်မှတ်ထားတယ်။ ကျန်တာက အိုခေ
        List<String> list = Arrays.asList("ကုံလုံ", "ကိန်းခန်း", "ကုတ်ခြစ်", "ကန်သင်း", "ကပ်ငြိ", "ကုံးသီ", "ကယ်မ", "ကုမ်မာရီ", "ကမ်းမမြင်");
        list.sort(new MyanmarSorting());
        list.forEach(System.out::println);
    }


}