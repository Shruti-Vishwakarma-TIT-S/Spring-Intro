package com.springintro.helloworld.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepartmentBean departmentBean;

    public void showDepartment() {
        System.out.println("Department (Field Injection): " + departmentBean.getDepartmentName());
    }
}

