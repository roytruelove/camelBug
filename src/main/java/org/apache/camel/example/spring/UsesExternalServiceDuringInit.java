package org.apache.camel.example.spring;

import org.springframework.beans.factory.InitializingBean;

public class UsesExternalServiceDuringInit implements InitializingBean {

	private ExternalService externalService;

	@Override
	public void afterPropertiesSet() throws Exception {
		String dataNeededForInitialization = getExternalService().someMethodOnExternalService();
		// do something with dataNeededForInitialization...
	}

	public ExternalService getExternalService() {
		return externalService;
	}

	public void setExternalService(ExternalService externalService) {
		this.externalService = externalService;
	}
}