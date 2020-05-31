package com.idenSpring.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.idenSpring.springboot.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {


/*    @RequestMapping("/home")
    public String home(){
        return "index.jsp";
    }*/


    // traditional approach.

    @RequestMapping("/home/ways/getClientDataInTraditionalWay")
    @ResponseBody
    String getClientDataInTraditionalWay(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("loginUserName");
        if (userName.equalsIgnoreCase("Nitish Saxena"))
            return "Success";
        else
            return "Failure";

    }

    /* Modern Approach */

    String getClientDataWithModernApproach(@RequestParam String userName){
        ModelAndView mv = new ModelAndView();

        return "";
    }

    @RequestMapping("/home/getLoginUserName")
    @ResponseBody
    public void getClientData(@RequestParam String loginUserName) {
        System.out.println(loginUserName);
    }

    @GetMapping("/ff")
    public ModelAndView ff(){
        ModelAndView mv = new ModelAndView("src/main/webapp/WEB-INF/view/index.jsp");
        return mv;
    }

    @RequestMapping("/home/getAlienData")
    @ResponseBody
    public void getAlienData(@RequestParam String alienString) throws JsonProcessingException {

        Alien alienObject = new ObjectMapper().readValue(alienString, Alien.class);
        System.out.println(alienObject.getaId() + "--" + alienObject.getaName() + "--" + alienObject.getAtech());


    }


}


