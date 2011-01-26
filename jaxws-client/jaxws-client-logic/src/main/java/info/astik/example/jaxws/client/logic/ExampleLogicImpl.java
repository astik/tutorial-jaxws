package info.astik.example.jaxws.client.logic;

import info.astik.example.jaxws.client.jaxws.ExampleWS;

public class ExampleLogicImpl implements IExampleLogic {
	private ExampleWS exampleWs;

	public String getHelloMessage(String input) {
		return exampleWs.getHelloMessage(input);
	}

	/* GETTER AND SETTTER */
	public void setExampleWs(ExampleWS exampleWs) {
		this.exampleWs = exampleWs;
	}
}
