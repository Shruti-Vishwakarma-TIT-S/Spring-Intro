package com.springintro.helloworld.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBeanSetter {

    private DepartmentBean departmentBean;

    @Autowired
    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public void showDepartment() {
        System.out.println("Department (Setter Injection): " + departmentBean.getDepartmentName());
    }
}
