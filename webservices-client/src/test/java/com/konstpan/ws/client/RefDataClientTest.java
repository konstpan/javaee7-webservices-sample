package com.konstpan.ws.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

public class RefDataClientTest {

	// Class under test
	RefDataClient cut = new RefDataClient();

	@Test
	public void shouldRetrieveCountries() {
		List<String> result = cut.getData();

		assertNotNull(result);
		
		assertTrue(result.stream().anyMatch(c -> c.equals("UK")));
	}
	
	@Test
	public void shouldFailToFindNonExistentCountry() {
		List<String> result = cut.getData();

		assertNotNull(result);
		
		assertFalse(result.stream().anyMatch(c -> c.equals("not existent country")));
	}

}
