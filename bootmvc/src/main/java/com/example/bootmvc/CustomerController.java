package com.example.bootmvc;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {




    @RequestMapping("add")
    public String cutomerValidation(@ModelAttribute("Customer") Customer customer){

        return "customer-file";

    }

    @RequestMapping("processFile")
    public String validation(@Valid @ModelAttribute("Customer") Customer customer, BindingResult bindingResult)

    {

        System.out.println("validation");
        if(bindingResult.hasErrors())
        {
            return "customer-file";
        }
        else
        {
            return "done";
        }
    }

    @InitBinder
    public void initBindinfer(WebDataBinder webDataBinder)
    {
        System.out.println("Init Call");
        StringTrimmerEditor str=new StringTrimmerEditor(true);

        webDataBinder.registerCustomEditor(String.class,str);


    }
}
