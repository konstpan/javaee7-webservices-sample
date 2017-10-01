package com.konstpan.ws.client;

import java.util.List;

public class RefDataClient {

	public RefDataClient() {

	}

	public List<String> getData() {
		List<String> resultList;

		RefDataImplService refDataService = new RefDataImplService();
		RefData refData = refDataService.getRefDataImplPort();

		resultList = refData.getData();

		return resultList;
	}

}
