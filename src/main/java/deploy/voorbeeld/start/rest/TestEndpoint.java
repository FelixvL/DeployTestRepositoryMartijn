package deploy.voorbeeld.start.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoint {

	@GetMapping("testendpoint")
	public String geefAntwoord() {
		return "Hij doet het!";
	}
}
