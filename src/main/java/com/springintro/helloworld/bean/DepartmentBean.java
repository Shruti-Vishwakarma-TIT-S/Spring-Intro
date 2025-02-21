package com.springintro.helloworld.bean;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String departmentName;

    public DepartmentBean() {
        this.departmentName = "Engineering";
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
