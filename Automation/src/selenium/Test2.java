package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\Narendar\\Projects\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver CD=new ChromeDriver();
        CD.get("https://www.bewakoof.com/");
        String S=CD.getTitle();
        System.out.println(S);
		  /* String S1=CD.getPageSource();
		   System.out.println(S1);*/
        String S2=CD.getCurrentUrl();
        System.out.println(S2);
        //  CD.quit();
        CD.manage().window().maximize();
        // String S3=CD.manage().window().();

        // CD.close();






    }

}
