package BaggageTest.BabyStrollers_7;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BabyStrollersPage {
    //URL
    private final static String URI_BADY = "https://www.uralairlines.ru/baggage_detail/detskaya-kolyaska/";



    //Элемент для поиска по тексту
    private final SelenideElement TEXT_ELEMENT = $x("//div[@class='uk-visible@l']//div[@class='title']");
    public static final SelenideElement BUTTON = $x("//div[@class='uk-modal-dialog uan-modal__dialog uk-margin-auto-vertical']//button");
    public void test7(){
        //Открытие URL
        Selenide.open(URI_BADY);

        //Закрытие всплывающего окна
        BUTTON.click();
        //Поиск по тексту для проверки что страница открылась
        TEXT_ELEMENT.shouldHave(Condition.text("Детская коляска"));
    }
}
