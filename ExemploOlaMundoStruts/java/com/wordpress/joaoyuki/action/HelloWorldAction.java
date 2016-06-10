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
	
	
	// � obrigat�rio que implementemos o m�todo execute pois ser� ele quem ir�  receber o nosso request e devolver o responde.
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,HttpServletResponse response) throws Exception{

		HelloWorldForm helloWorldForm = (HelloWorldForm)form; 
		helloWorldForm.setMessage("Ol�, isso � struts 1!");
		
		return mapping.findForward("success");
		//O mapping.findDforward ir� enviar o form automaticamente para a nossa p�gina mapeada no struts-config.xml.
		//O success foi configurado no struts-config.xml para levar a resposta para a p�gina /HelloWorld.jsp
		
	}

}
