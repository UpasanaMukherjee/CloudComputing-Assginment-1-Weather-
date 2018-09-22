package Weather;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import Weather.model.WeatherDetails;



@Controller
public class WeatherController {
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	@PostMapping("/")
	public String handleUserInputs(Map<String, Object> model, @Valid WeatherDetails wd, BindingResult bindingResult) {
		//if(userInput.getServiceType().equalsIgnoreCase("saas")&&userInput.getDeploymentType().equalsIgnoreCase("public"))
		//String s= wd.getCity();
//			model.put("link", mediafire);
			return "redirect:"+"https://openweathermap.org/data/2.5/weather?lat=17.3616&lon=78.4747&appid=b6907d289e10d714a6e88b30761fae22";
//			return "loading";
		}
}