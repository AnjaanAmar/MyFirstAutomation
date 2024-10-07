package WebDriverMethod;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class hSize_and_Possition
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");
		Set<String> allWidID = driver.getWindowHandles();
		for(String wid :allWidID)
		{
			  String WindURL = driver.switchTo().window(wid).getCurrentUrl();
			  System.out.println("Wind URL "+ WindURL);
			  if(WindURL.equals("https://www.facebook.com/"))
			  {
	        	}
			 else if(WindURL.equals("https://www.instagram.com/"))
		{
			int ChildHeight = driver.manage().window().getSize().getHeight();
			System.out.println(ChildHeight);
			int ChildWidth = driver.manage().window().getSize().getWidth();
			System.out.println(ChildWidth);
			int ChildXaxis = driver.manage().window().getPosition().getX();
			System.out.println(ChildXaxis);
			int ChildYaxis = driver.manage().window().getPosition().getY();
			System.out.println(ChildYaxis);
			Dimension DefinedSize = new Dimension(19,19);
			driver.manage().window().setSize(DefinedSize);
			Point DefinedPosition = new Point(30,30);
			driver.manage().window().setPosition(DefinedPosition);
		}
	}
	}
}

