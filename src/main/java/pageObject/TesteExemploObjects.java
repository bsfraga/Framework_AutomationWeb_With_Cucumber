package pageObject;

import core.BasePage;


/**
 * This class is where related methods to manipulate a specific page are located.
 * It also extends BasePage, where it creates a new instance of Utils (Class that 
 * contains the methods to manipulate the WebPage).
 * @author BrunoFraga
 *
 */
public class TesteExemploObjects extends BasePage {

	public void changeUrl(String url) {
		utils.goToUrl(url);
	}
	
}
