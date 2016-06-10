package com.wordpress.joaoyuki.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wordpress.joaoyuki.form.HelloWorldForm;

public class HelloWorldAction extends Action{
	
	
	// É obrigatório que implementemos o método execute pois será ele quem irá  receber o nosso request e devolver o responde.
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,HttpServletResponse response) throws Exception{

		HelloWorldForm helloWorldForm = (HelloWorldForm)form; 
		helloWorldForm.setMessage("Olá, isso é struts 1!");
		
		return mapping.findForward("success");
		//O mapping.findDforward irá enviar o form automaticamente para a nossa página mapeada no struts-config.xml.
		//O success foi configurado no struts-config.xml para levar a resposta para a página /HelloWorld.jsp
		
	}

}
