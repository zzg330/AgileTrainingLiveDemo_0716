package com.autodesk.agiledemo;

import java.util.HashMap;
import java.util.Map;

public class Weather {
	private String city;
	private String region;
	private String country;
	private double temperature;
	private String condition;
	private String humidity;
	private String windSpeed;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getWearingAdvice() {
		
		Map <String, String> map = new HashMap<>();
		map.put("truetrue", "Umbrella, T-shirt");
		map.put("truefalse", "Raincoat");
		map.put("falsetrue", "T-shirt");
		map.put("falsefalse", "Shirts");
		
		if (!IsConditionDefined() || !IsTemperatureInScope()) return "No Wearing Advice";

		return map.get(String.valueOf(IsRaining())+String.valueOf(IsTempHot()));
		
	}
	
	private Boolean IsRaining() {
		return condition == "Raining";
	}
	
	private Boolean IsTempHot() {
		return temperature >= 70d;
	}
	
	private Boolean IsConditionDefined() {
		return (condition == "Sunny" || condition == "Raining");
	}
	
	private Boolean IsTemperatureInScope() {
		return (temperature >= 60d && temperature <= 79d);
	}
	


}