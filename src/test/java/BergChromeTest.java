
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class BergChromeTest {
    WebDriver driver;
    DesiredCapabilities c = new DesiredCapabilities();

    @BeforeClass
    public void InitConfig() throws MalformedURLException{
        c.setCapability("browserName", "Chrome");
        c.setCapability("avd", "Nexus5API30");
        c.setCapability("deviceName", "emulator-5554");
        c.setCapability("platformName", "Android");
        c.setCapability("platformVersion", "11");
    }



    @Test
    public void MyResumeTest() throws MalformedURLException {
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Resume")).isDisplayed();
            driver.findElement(By.linkText("My Resume")).click();
            boolean isButtonVisible1 = driver.findElement(By.linkText("README.md")).isDisplayed();
            System.out.println("My Resume Hyperlink Button Test was successful");
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public void MyHHTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Headhunter")).isDisplayed();
            driver.findElement(By.linkText("My Headhunter")).click();
            System.out.println("My HH Hyperlink Button Test was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyLinkedTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Linkedin")).isDisplayed();
            System.out.println("My Linkedin Link Test was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyGitHubTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My GitHub")).isDisplayed();
            driver.findElement(By.linkText("My GitHub")).click();
            boolean isButtonVisible1 = driver.findElement(By.linkText("Resume & Software skills")).isDisplayed();
            System.out.println("My GitHub Link Test was successful");
        } finally {
            driver.quit();
        }
    }

    /* @Test
     @DisplayName("My Incorrect Test")
     public void IncorrectCheck() {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         try {
             driver.get("https://alexander-berg.github.io");
             driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

             boolean isButtonVisible = driver.findElement(By.linkText("My Incorrect")).isDisplayed();
             System.out.println("My Incorrect Link Test was successful");
         }
         finally {
             driver.quit();
         }
     }

     */

    @Test
    public void MyTelegramButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Telegram")).isDisplayed();
            System.out.println("MyTelegramButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyFacebookButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Facebook")).isDisplayed();
            System.out.println("MyFacebookButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyEmailButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Email")).isDisplayed();
            System.out.println("MyEmailButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyGoogleDevButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Google Dev")).isDisplayed();
            System.out.println("MyGoogleDevButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyQADiplomaButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("QA Diploma Project")).isDisplayed();
            System.out.println("MyQADiplomaButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyQAMindmapsButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("QA Mindmaps")).isDisplayed();
            System.out.println("MyQAMindmapsButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyITNewsButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("IT News")).isDisplayed();
            System.out.println("MyITNewsButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyDiscordButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Discord")).isDisplayed();
            System.out.println("MyDiscordButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyStackOverflowButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("Stack Overflow")).isDisplayed();
            System.out.println("MyStackOverflowButtonTextTest");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyVKButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My VK")).isDisplayed();
            System.out.println("MyVKButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyInstagramButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Instagram")).isDisplayed();
            System.out.println("MyInstagramButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyTwitterButtonTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Twitter")).isDisplayed();
            System.out.println("MyTwitterButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }
    @Test
    public void MyHeaderTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.xpath("//*[text()='Hi there, Im Alexander Berg!']")).isDisplayed();
            System.out.println("MyHeaderTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    public void MyFooterTextTest() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), c);
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.xpath("//*[text()='Created by Alexander Berg,2021']")).isDisplayed();
            System.out.println("MyFooterTextTest was successful");
        } finally {
            driver.quit();
        }
    }
}





