package popups_learn;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Learn_popups {

	
@Test
public void popup_learn()

{
	

	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	

	ChromeOptions options =new ChromeOptions();
	options.addArguments("disable-notifications");
	options.addArguments("disable-media-stream");
	options.addArguments("disable-geolocations");

	WebDriver driver=new ChromeDriver(options);




	ChromeOptions option=new ChromeOptions();

	HashMap<String, Integer> contetnsettings=new HashMap<String, Integer>();
	HashMap<String, Object> profiles=new HashMap<String, Object>();
	HashMap<String, Object> prefs=new HashMap<String, Object>();

	contetnsettings.put("notifications",1);
	profiles.put("managed_default_contetn-settings",contetnsettings);
	prefs.put("profile",profiles);
	//options.expermentaloptions("prefs", prefs);
	//option.getExperimentalOption("prefs");
	option.setExperimentalOption("prefs",prefs);

}
	
	
	
}
