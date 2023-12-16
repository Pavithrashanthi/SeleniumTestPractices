import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.google.com/gmail/about/");

  
	}

}
