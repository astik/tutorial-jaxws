package info.astik.example.jaxws.server;

import info.astik.example.jaxws.server.logic.IExampleLogic;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "example", portName = "examplePort")
public class ExampleWS implements IExampleWS {
	private IExampleLogic iExampleLogic;

	@WebMethod
	@Override
	public String getHelloMessage(String input) {
		return iExampleLogic.getHelloMessage(input);
	}

	/* GETTER AND SETTER */
	@WebMethod(exclude = true)
	public void setiExampleLogic(IExampleLogic iExampleLogic) {
		this.iExampleLogic = iExampleLogic;
	}
}
