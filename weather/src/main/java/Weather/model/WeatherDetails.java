package Weather.model;

//import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherDetails {
	
	String city;
	//double temp;

/*	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}*/

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "WeatherDetails [city=" + city + "]";
	}

}
//, temp=" + temp + "