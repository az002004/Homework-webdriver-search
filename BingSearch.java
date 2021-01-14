import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BingSearch {

    WebDriver driverBing;

    //1. Open the browser
    //2. Navigate to the main Google page
    //3. Type the query
    //4. Submit the query
    //wait
    //5. Verify the results page: results are displayed, assert the results number is large


    @Test
    public void testBingSearch() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitQuery();
        waitFor(15); // sometimes 3 & 5 don't work for my network
        isResultDisplayed();

        boolean resultDisplayed = isResultDisplayed();
        Assert.assertTrue(resultDisplayed);

        verifyNumverOfResults();
    }

    private void verifyNumverOfResults() {
        WebElement result = driverBing.findElement(By.className("sb_count"));
        String text = result.getText();
        String[] arrayOfStrings = text.split(" ");
        String firstElement = arrayOfStrings[0].replace(",", "");
        int number = Integer.parseInt(firstElement);

        boolean isLargeNumber = number > 1000;
        Assert.assertTrue(isLargeNumber);
    }

    private boolean isResultDisplayed() {
        WebElement result = driverBing.findElement(By.className("sb_count"));
        boolean isResultDisplayed = result.isDisplayed();
        return isResultDisplayed;
    }

    private void waitFor(int amountOfSeconds) {
        try {
            Thread.sleep(amountOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void submitQuery() {
        String id = "sb_form_q";
        WebElement element = driverBing.findElement(By.id(id));
        element.submit();
    }

    private void typeQuery() {
        String id = "sb_form_q";
        WebElement element = driverBing.findElement(By.id(id));
        element.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        driverBing.get("https://www.bing.com/");
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/Win64/geckodriver.exe");
        driverBing = new FirefoxDriver();
    }

}
