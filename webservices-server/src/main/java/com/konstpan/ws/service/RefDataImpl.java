package com.konstpan.ws.service;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.konstpan.ws.service.RefData")
public class RefDataImpl implements RefData {

	@Override
	public List<String> getData() {
		List<String> resultList = Arrays.asList("GREECE","UK","GERMANY");

		return resultList;
	}

}
