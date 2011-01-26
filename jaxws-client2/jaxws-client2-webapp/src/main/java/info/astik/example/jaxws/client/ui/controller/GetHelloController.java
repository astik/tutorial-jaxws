package info.astik.example.jaxws.client.ui.controller;

import info.astik.example.jaxws.client.logic.IExampleLogic;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class GetHelloController implements Controller, InitializingBean {
	private IExampleLogic iExampleLogic;
	private String viewName;

	@Override
	public void afterPropertiesSet() throws Exception {
		if (iExampleLogic == null) {
			throw new IllegalArgumentException("iExampleLogic is null");
		}
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String message = iExampleLogic.getHelloMessage(userName);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", message);
		return new ModelAndView(viewName, model);
	}

	/* GETTER AND SETTER */
	public void setiExampleLogic(IExampleLogic iExampleLogic) {
		this.iExampleLogic = iExampleLogic;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
