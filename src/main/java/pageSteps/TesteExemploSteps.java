package pageSteps;

import org.junit.Assert;

import core.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObject.TesteExemploObjects;


/**
 * This class is where the Cucumber will execute the methods related to each steap.
 * The methods are located at [NamePage]Objects.java class.
 * @author BrunoFraga
 *
 */
public class TesteExemploSteps extends TesteExemploObjects{

	
	String actualUrl;
	String googleUrl = "https://www.google.com.br/";
	String youtubeUrl = "https://www.youtube.com/";
	
	@Dado("que acesso a pagina do Google")
	public void queAcessoAPaginaDoGoogle() {
		changeUrl(googleUrl);
	}

	@Então("valido se a pagina do Google foi acessada")
	public void validoSeAPaginaDoGoogleFoiAcessada() {
		actualUrl = DriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(googleUrl, actualUrl);
	}

	@Dado("que acesso a pagina do Youtube")
	public void queAcessoAPaginaDoYoutube() {
		changeUrl(youtubeUrl);
	}
	
	@Então("valido se a pagina do Youtube foi acessada")
	public void validoSeAPaginaDoYoutubeFoiAcessada() {
		actualUrl = DriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(youtubeUrl, actualUrl);
	}
	
}
