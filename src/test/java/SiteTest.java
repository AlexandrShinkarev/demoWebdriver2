import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    @Test
    public void testSiteOpen() {
        System.setProperty("wedriver.chromdriver.driver","C:\\Programs\\Webdrivers");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt");
        webDriver.quit();

    }
}
