package org.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateController {

    @RequestMapping("/")
    public String showHome(){

        return "home";
    }

    @RequestMapping("/input")
    public String showCalculatorPage(){

        return "input_numbers";
    }

    @RequestMapping("/result")
    public ModelAndView getResult(@RequestParam int first, @RequestParam int second){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result",first*second);
        modelAndView.setViewName("result");

        return modelAndView;
    }
}
