package org.iamaki.component;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class MainPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public MainPage() {
		this.add(new Label("message1", "This is main page"));
	}

}
