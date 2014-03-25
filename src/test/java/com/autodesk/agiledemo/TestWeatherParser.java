package com.autodesk.agiledemo;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class TestWeatherParser {

	@Test
	public void should_get_weather_info() throws IOException {
		
		WeatherParser parser = new WeatherParser();
		Weather weather;
		
//		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("new_orleans_weather.xml")){
		try(InputStream inputStream = getClass().getClassLoader().getResourceAsStream("sf_weather.xml")){
			weather = parser.parse(inputStream);
		}
		
//		assertEquals("New Orleans", weather.getCity());
//		assertEquals("LA", weather.getRegion());
//		assertEquals("US", weather.getCountry());
//		assertEquals(66, weather.getTemperature(), 0.001);
//		assertEquals("Mostly Cloudy", weather.getCondition());
//		assertEquals("81", weather.getHumidity());
//		assertEquals("9", weather.getWindSpeed());
		assertEquals("San Francisco", weather.getCity());
		assertEquals("CA", weather.getRegion());
		assertEquals("US", weather.getCountry());
		assertEquals(54, weather.getTemperature(), 0.001);
		assertEquals("Partly Cloudy", weather.getCondition());
		assertEquals("75", weather.getHumidity());
		assertEquals("8", weather.getWindSpeed());
	}
}
