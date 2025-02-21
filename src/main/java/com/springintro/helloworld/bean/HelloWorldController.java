package com.springintro.helloworld.bean;

import com.springintro.helloworld.bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final EmployeeBean employeeBean;

    @Autowired
    public HelloWorldController(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        employeeBean.showDepartment();
        return "Hello, World!";
    }
}
