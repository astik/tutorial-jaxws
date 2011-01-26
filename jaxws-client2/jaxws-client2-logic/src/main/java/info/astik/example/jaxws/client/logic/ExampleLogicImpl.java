package info.astik.example.jaxws.client.logic;

import info.astik.example.jaxws.server.IExampleWS;

public class ExampleLogicImpl implements IExampleLogic {
	private IExampleWS iExampleWs;

	public String getHelloMessage(String input) {
		return iExampleWs.getHelloMessage(input);
	}

	/* GETTER AND SETTTER */
	public void setiExampleWs(IExampleWS iExampleWs) {
		this.iExampleWs = iExampleWs;
	}
}
