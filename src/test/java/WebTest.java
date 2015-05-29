import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nobezawa on 2015/05/28.
 */
public class WebTest extends TestCase {

    private final static String url = "http://r.gnavi.co.jp/area/aream2115/";

    @Test
    public void testAlfa() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        assertTrue(driver.getTitle().contains("�V�h �O�����E�H���E�l�C���X�g���� �] ����Ȃ�"));
        driver.quit();
    }



}
