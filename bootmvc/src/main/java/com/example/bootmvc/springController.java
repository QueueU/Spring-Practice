package com.example.bootmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class springController {



    @RequestMapping("/")
    public String getDetails(Model model)
    {
        Student st=new Student();

        model.addAttribute("student",st);

        return "Check";

}

@RequestMapping("/processForm")
public String moveDetails(@ModelAttribute("student") Student st)
{

    System.out.println("Call Define");
    return "define";
}

}
