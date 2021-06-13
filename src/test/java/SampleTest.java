import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    @Test
    public void Logo(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.youtube.com/watch?v=fOeQWJ1QMSY&ab_channel=HillelITSchool");

    }
}
