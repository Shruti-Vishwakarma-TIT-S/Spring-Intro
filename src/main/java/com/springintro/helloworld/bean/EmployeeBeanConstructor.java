package com.springintro.helloworld.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBeanConstructor {

    private final DepartmentBean departmentBean;

    @Autowired
    public EmployeeBeanConstructor(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public void showDepartment() {
        System.out.println("Department (Constructor Injection): " + departmentBean.getDepartmentName());
    }
}
