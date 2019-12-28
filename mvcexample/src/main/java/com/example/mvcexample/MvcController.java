package com.example.mvcexample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MvcController {

    @RequestMapping("/add")
    public String getMVCFile()
    {

        System.out.println("I am Gere");
        return "first-mvc-view";
    }

    //This Method send back to view name is Check.jsp with Model Object which stores the name Upper value
    //We already fatch from first.html


    /*
    @RequestMapping("check")
    public String SendModelConteoller(HttpServletRequest  request, Model model)
    {

        String strParam=request.getParameter("name");

        model.addAttribute("name",strParam.toUpperCase());

        return "check";

    }

     */


}
