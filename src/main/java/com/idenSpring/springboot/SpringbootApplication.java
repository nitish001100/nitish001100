package com.idenSpring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		System.out.println("First Spring Boot Application!!");

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		Alien alien = context.getBean(Alien.class);
		alien.setaId(103); alien.setaName("Nitish Saxena"); alien.setAtech("JAVA");
		alien.compile();






	}

}

/**
 * NOTE:
 * 1: How to get bean.. ConfigurableApplicationContext obj - obj.getBean(className);
 * 2: Singelton and prototype
 * 3: Annotations -
 *  @Component - register the class in Spring Container.
 * 	@Autowired - create the object when required. ,
 * 	@Qualifier - Give the alias to bean class.
 * 	@Controller - Class Level - All request come to this class which is annotated by @Controller.
 *  @ResponseBody - Method Level - whatever you are returning is actual data.
 * 4:Add Tomcat Jasper - So that when you are returning some page ( index.jsp), it will resolve it internally and it show the content of file.
 * 5: Question - How to send an object from client to Server ?
 *	  Ans - Send the data in JSON format and accept it in String and then thru ObjectMapper Class, parser it.
 *
 * 	Alien alienObject = new ObjectMapper().readValue(alienString, Alien.class);
 *	System.out.println( alienObject.getaId()+"--" + alienObject.getaName()+ "--" + alienObject.getAtech());
 *
 *  GET Request - http://localhost:8080/home/getAlienData?alienString={"aId" : "150975","aName" : "Nitish Saxena","atech" : "JAVA"}
 *
 *  https://lankydan.dev/2017/03/11/passing-data-transfer-objects-with-get-in-spring-boot
 *
 * 6: TRADITIONAL WAYS - HttpServletRequest and HttpServletResponse -
 * 		HttpServletRequest - Through this api you can play with all the contents which is in request.
 * 		HttpServletResonse - Through this api you can play with all the responses.
 *
 * 	To access the params which are coming in request in jsp pages, there are two ways -
 * 		a: In HttpServletRequest, there is one method setAttribute and then in JSP page write {param_name}.
 * 		b: Or, Get the session from HttpServletRequest and in that session, store the variable.
 *
 * 	JSP Pages and these requests are in same servlet (Dispatcher Servlet), i.e variables are access in JSP Pages.
 *
 *
 * 		MODERN Approach:
 *
 *	In Spring Boot- All this comes under Spring ModelAndView API.
 *
 *
 *
 *
 */
