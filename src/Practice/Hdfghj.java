package Practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfghj {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String StampTime = LocalDate.now().toString().replace(":", "-");
	driver.get("https://www.flipkart.com/");
	TakesScreenshot TS = (TakesScreenshot)driver;
	File T = TS.getScreenshotAs(OutputType.FILE);
    File P = new File("./Amar/"+StampTime+"fli.png");
    FileUtils.copyFile(T, P);
}
}
