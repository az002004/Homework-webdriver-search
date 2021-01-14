import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YandexSearch {

    WebDriver driverForYandexSearch;

    //1. Open the browser
    //2. Navigate to the main Google page
    //3. Type the query
    //4. Submit the query
    //wait
    //5. Verify the results page


    @Test
    public void testYandex() {

        openBrowser();
        navigateToMainPage();
        typeQuerry();
        submitQuery();
        // which results to verify?

    }

    private void submitQuery() {
        String name = "text";
        WebElement element = driverForYandexSearch.findElement(By.name(name));
        element.submit();
    }

    private void typeQuerry() {

        String name = "text";
        WebElement element = driverForYandexSearch.findElement(By.name(name));
        element.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        driverForYandexSearch.get("https://yandex.ru/");
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/Win64/geckodriver.exe");
        driverForYandexSearch = new FirefoxDriver();    // no need to mention type, we access it directly
    }


}
