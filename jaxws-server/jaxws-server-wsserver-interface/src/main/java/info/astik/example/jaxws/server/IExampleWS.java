package info.astik.example.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "example", portName = "examplePort")
public interface IExampleWS {
	@WebMethod
	public String getHelloMessage(String input);
}
