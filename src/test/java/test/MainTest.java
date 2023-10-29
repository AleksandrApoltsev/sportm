package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    @Test
    void exampleTest() {
        open("https://ya.ru/");
       // $("#text").setValue("зайка");
    }
}
