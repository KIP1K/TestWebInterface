package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CallbackTest {

@Test
    void shouldTestSomething() {
       open("http://localhost:9999");
}
SelenideElement form = $("[form.form.form_size_m.form_theme_alfa-on-white]");
form.$("[data-test-id=name] input") .setValue("Иван Пучков");

}
