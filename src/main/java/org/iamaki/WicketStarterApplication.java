package org.iamaki;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.resource.IResource;
import org.iamaki.component.MainPage;

public class WicketStarterApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return MainPage.class;
	}
	
	
	@Override
	protected void init() {
		super.init();
		 
	}
}
