package com.konstpan.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RefData {
	
	@WebMethod
	public List<String> getData();

}
