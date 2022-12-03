package pageFactoryPkg;
import basePkg.MainClass;
public class SwitchingBetweenframe extends MainClass {
	
	HomePage hp = new HomePage();
	public void SwitchingToIframes(){
		
		hp.ContactUsLink();
		driver.switchTo().frame("xuTWKRgptnL4d4kHBm5l");
		
	}
	public void SwitchingToMainFrames(){
		driver.switchTo().defaultContent();
	}
}
