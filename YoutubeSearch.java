import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YoutubeSearch {
    WebDriver youtubeDriver;

    //1. Open the browser
    //2. Navigate to the main Google page
    //3. Type the query
    //4. Submit the query
    //5. wait
    //6. Verify the results page is displayed
    //7. Assert if the results number is large


    @Test
    public void youtubeSearchtest() {
        openBrowser();
        navigateToMainPage();
        typeQuery();
        submitQuery();
        waitFor(3);

        boolean resultsAreThere = isResultsDisplayed();
        Assert.assertTrue(resultsAreThere);

        assertNumberOfResults();
    }

    private void assertNumberOfResults() {
        String id = "video-count";
        WebElement result = youtubeDriver.findElement(By.id(id));
        String text = result.getText();
        String[] arrayOfStrings = text.split(" ");
        String firstElement = arrayOfStrings[0];
        int number = Integer.parseInt(firstElement);
        boolean isLargeNumber = number > 50;

        Assert.assertTrue(isLargeNumber);
    }

    private boolean isResultsDisplayed() {
        String id = "video-count";
        WebElement result = youtubeDriver.findElement(By.id(id));
        boolean isResultsDisplayed = result.isDisplayed();
        return isResultsDisplayed;
    }

    private void waitFor(int amountOfSeconds) {
        try {
            Thread.sleep(amountOfSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void submitQuery() {
        String name = "search_query";
        WebElement element = youtubeDriver.findElement(By.name(name));
        element.submit();

    }

    private void typeQuery() {
        String name = "search_query";
        WebElement element = youtubeDriver.findElement(By.name(name));
        element.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        youtubeDriver.get("https://www.youtube.com/");
    }

    private void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/Win64/geckodriver.exe");
        youtubeDriver = new FirefoxDriver();
    }
}
