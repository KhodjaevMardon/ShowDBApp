package com.uzassystem.showdbapp.controller;

import com.uzassystem.showdbapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping({"/list", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView modelAndView = new ModelAndView("list-employees");
        modelAndView.addObject("employees", employeeRepository.findAll());
        return modelAndView;
    }
}
