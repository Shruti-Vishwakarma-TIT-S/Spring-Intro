package com.springintro.helloworld.bean;

import com.springintro.helloworld.bean.EmployeeBean;
import com.springintro.helloworld.bean.EmployeeBeanConstructor;
import com.springintro.helloworld.bean.EmployeeBeanSetter;
import com.springintro.helloworld.HelloworldApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloworldApplication.class, args);

        // Field Injection
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.showDepartment();

        // Constructor Injection
        EmployeeBeanConstructor employeeBeanConstructor = context.getBean(EmployeeBeanConstructor.class);
        employeeBeanConstructor.showDepartment();

        // Setter Injection
        EmployeeBeanSetter employeeBeanSetter = context.getBean(EmployeeBeanSetter.class);
        employeeBeanSetter.showDepartment();
    }

}
