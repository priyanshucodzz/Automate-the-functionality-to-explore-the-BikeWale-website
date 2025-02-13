import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BikeWaleAutomation{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bikewale.com/");
		driver.manage().window().maximize();
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		WebElement button = driver.findElement(By.cssSelector("#root > div > div.z_8FgQ.o-bfyaNx > header > div > div.o-dsiSgT.o-zmksK.o-bTDyCI.o-fDnrXc.o-cqgkZn.o-dsALUH.o-cpnuEd > div.o-brXWGL.o-frwuxB.o-fznVsk.o-cpnuEd.o-brXWGL > div > svg"));
		button.click();
		
		 WebElement city = driver.findElement(By.cssSelector("#used-location-close-button > div.o-bTDyCI.o-fDnrXc.o-cqgkZn.o-fqusGR.o-dcRgip.o-cMqWUV.o-csArTP.o-cpnuEd.o-efHQCX.o-aLrhU.o-brXWGL > div.o-brXWGL.o-cXBIhK.o-bfyaNx.o-cpnuEd.o-efHQCX.FExI8e.o-cJrNdO.o-bXXkQz > div.LBnHvX.o-brXWGL.o-fznJDS.o-fznJzu.o-bNAfCw.o-bfyaNx.o-bTDyCI.o-fDnrXc.o-buzfYq.o-fzqDFM.o-cohPRA.o-cohQay.iUm6VW > div > div > div > div.o-cKuOoN.o-brXWGL.o-bfyaNx.o-cjsCNH > div > input"));
		 city.sendKeys("jalandhar");
		 Thread.sleep(3000);
		 
		 WebElement city2 = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[2]/div/div/div[2]/div/ul/li"));
		 city2.click();
		 Thread.sleep(3000);
		 WebElement pincode = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/input"));
		 pincode.sendKeys("144401");
		  Thread.sleep(3000);
		 WebElement pin = driver.findElement(By.xpath("//*[@id=\"used-location-close-button\"]/div[2]/div[2]/div/div/div[2]/div/ul/li[1]"));
		 pin.click();
		 Thread.sleep(3000);
		 
		 driver.get("https://www.bikewale.com/tvs-bikes/");
		 
		 driver.findElement(By.cssSelector("#root > div > div.body-content > div > div.o-bWHzMb.o-ducbvd.o-cglRxs.Phu9vg.o-fpkJwH.o-dCyDMp > div.MizGdg.fEMaCt > div.o-dpDliG.o-eAyrtt.o-cglRxs.lSq7kt.o-fpkJwH.o-dCyDMp.o-efHQCX > section > div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(2) > div > span")).click();
		 
		 driver.findElement(By.cssSelector("#root > div > div.z_8FgQ.o-bfyaNx > header > div > div.o-dsiSgT._WI14d.o-cpnuEd > div > span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#root > div > div.o-dtNHPt.o-brXWGL > div.jIPWGN.o-cYOpxG.o-btTZkL.o-pGqQl.o-bwUciP.ehchQj.nLRbgf.o-cpnuEd.o-cgpzMr.o-efHQCX.o-bqHweY.U4qvna.o-chzWeu > div > div > div > nav > ul > li:nth-child(1) > div")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#root > div > div.z_8FgQ.o-bfyaNx > header > div > div.o-dsiSgT._WI14d.o-cpnuEd > div > span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#root > div > div.o-dtNHPt.o-brXWGL > div.jIPWGN.o-cYOpxG.o-btTZkL.o-pGqQl.o-bwUciP.ehchQj.nLRbgf.o-cpnuEd.o-cgpzMr.o-efHQCX.o-bqHweY.U4qvna.o-chzWeu > div > div > div > nav > ul > li:nth-child(2) > div.o-cpnuEd.o-frwuxB.o-flVtyy.sdmt0i.o-dsiSgT.o-fzoHFO.o-fzptOP.o-fzoHMc.o-fzoHBq")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#root > div > div.o-dtNHPt.o-brXWGL > div.jIPWGN.o-cYOpxG.o-btTZkL.o-pGqQl.o-bwUciP.ehchQj.nLRbgf.o-cpnuEd.o-cgpzMr.o-efHQCX.o-bqHweY.U4qvna.o-chzWeu > div > div > div > nav > ul > li:nth-child(2) > div.xRT6rw > div > ul > li:nth-child(7) > a")).click();
	
		 driver.get("https://www.bikewale.com/");
		 Thread.sleep(3000);
		 
		 driver.get("https://www.bikewale.com/new-bike-search/?bodyStyleIds=1");
		 driver.findElement(By.cssSelector("a[title='Royal Enfield Classic 350'] span[class='o-cJrNdO o-bkmzIL o-eqqVmt o-fzpibr']")).click();
	}

}