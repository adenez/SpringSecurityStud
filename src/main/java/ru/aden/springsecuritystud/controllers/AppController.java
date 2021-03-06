package ru.aden.springsecuritystud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @RequestMapping(value = {"/", "/helloworld**"}, method = {RequestMethod.GET})
    public ModelAndView welcomePage(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Tutorial");
        model.addObject("message", "Welcome Page!");
        model.setViewName("helloworld");

        return model;
    }

    @RequestMapping(value = "/protected**", method = {RequestMethod.GET})
    public ModelAndView protectedPage(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Protected Page");
        model.addObject("message", "This is protected page - admin only");
        model.setViewName("protected");

        return model;
    }

    @RequestMapping(value = "/confidential**", method = {RequestMethod.GET})
    public ModelAndView adminPage(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","SAdmin Page");
        model.addObject("message", "This is confidential page - super admin only");
        model.setViewName("protected");

        return model;
    }
}
