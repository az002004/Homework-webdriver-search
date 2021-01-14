import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooSearchTest {

    //1. Open the browser
    //2. Navigate to the main Google page
    //3. Type the query
    //4. Submit the query
    //5. pause to wait the results
    //6. Verify the results page: results are displayed, assert the results number is large

    WebDriver driver;

    @Test
    public void testYahooSearchPortnov() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitQuery();
        waitFor(1);

        boolean statsDisplayed = isStatsDisplayed();
        Assert.assertTrue(statsDisplayed);
    }

    private boolean isStatsDisplayed() {
        WebElement resultsElement = driver.findElement(By.id("yui_3_10_0_1_1610510288469_215")); // different id all the time
        boolean resultDisplayed = resultsElement.isDisplayed();
        return resultDisplayed;
    }

    private void waitFor(int amountOfSeconds) {
        try {
            Thread.sleep(amountOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void submitQuery() {
        String selector = "#ybar-sbq";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.submit();
    }

    private void typeQuery() {
        String selector = "#ybar-sbq";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        driver.get("https://www.yahoo.com/");
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/Win64/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
