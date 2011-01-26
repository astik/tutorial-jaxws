package info.astik.example.jaxws.server.logic;

import org.apache.commons.lang.StringUtils;

public class ExampleLogicImpl implements IExampleLogic {
	public String getHelloMessage(String input) {
		String message = "World";
		if (StringUtils.isNotBlank(input)) {
			message = input;
		}
		return "Hello " + message;
	}
}
