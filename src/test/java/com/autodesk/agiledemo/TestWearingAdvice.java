package com.autodesk.agiledemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWearingAdvice {
			
	private Weather weather = new Weather();

	@Test
	public void expected_shirts_when_temperature_60_and_conditon_sunny(){
		assertWearingAdviceEquals("Sunny", 60d, "Shirts");
		
	}
	
	@Test
	public void expected_jacket_when_temperature_60_and_conditon_cloudy(){
		assertWearingAdviceEquals("Cloudy", 60d, "Jacket");
		
	}
	
	@Test
	public void expected_T_shirt_when_temperature_70_and_conditon_cloudy(){
		assertWearingAdviceEquals("Cloudy", 70d, "T-shirt");
		
	}
	
	@Test
	public void expected_NoWearingAdvice_when_temperature_out_of_scope(){
		assertWearingAdviceEquals("Cloudy", 50, "No Wearing Advice");
		assertWearingAdviceEquals("Sunny", 80, "No Wearing Advice");
	}
	
	@Test
	public void expected_NoWearingAdvice_when_condition_undefined() {
		assertWearingAdviceEquals("Sonw", 67, "No Wearing Advice");
	}
	
	@Test
	public void expected_Tshirt_when_temperature_70_and_conditon_sunny(){
		
		assertWearingAdviceEquals("Sunny", 70d, "T-shirt");
	}
	
	@Test
	public void expected_Raincoat_when_temperature_60_and_conditon_Raining(){
		assertWearingAdviceEquals("Raining", 60d, "Raincoat");
	}
	
	@Test
	public void expected_Umbrella_Tshirt_when_temperature_70_and_conditon_Raining(){
		
		assertWearingAdviceEquals("Raining", 70d, "Umbrella, T-shirt");
	}

	private void assertWearingAdviceEquals(String condition, double temperature, String expectedWearingAdvice) {
		
		
		weather.setCondition(condition);
		weather.setTemperature(temperature);
		assertEquals(expectedWearingAdvice, weather.getWearingAdvice());
	}

}
