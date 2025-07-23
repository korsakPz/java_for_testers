import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FooterTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String BASE_URL = "https://only.digital/";

    @BeforeEach
    public void setup() {
        // Установка пути к драйверу (замените на свой)
        System.setProperty("webdriver.chrome.driver", "путь_к_драйверу/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testFooterPresenceAndElements() {
        // Открываем главную страницу
        driver.get(BASE_URL);

        // 1. Проверяем, что футер существует
        WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.tagName("footer")
        ));
        assert footer.isDisplayed() : "Футер не отображается!";

        // 2. Проверяем ключевые элементы футера
        checkFooterLink("О нас");
        checkFooterLink("Услуги");
        checkFooterLink("Контакты");

        // 3. Проверяем наличие соцсетей
        List<WebElement> socialIcons = driver.findElements(
                By.cssSelector("footer a[href*='facebook'], footer a[href*='linkedin']")
        );
        assert !socialIcons.isEmpty() : "Иконки соцсетей не найдены!";
    }

    private void checkFooterLink(String linkText) {
        WebElement link = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath(String.format("//footer//a[contains(text(), '%s')]", linkText))
        ));
        assert link.isDisplayed() : "Ссылка '" + linkText + "' не найдена в футере!";
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
