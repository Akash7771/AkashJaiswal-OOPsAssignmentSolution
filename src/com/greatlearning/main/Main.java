package com.greatlearning.main;

import com.greatlearning.departments.AdminDepartmentImpl;
import com.greatlearning.departments.HrDepartmentImpl;
import com.greatlearning.departments.TechDepartmentImpl;
import com.greatlearning.services.DepartmentService;

public class Main {

    public static void main(String[] args) {
        new DepartmentService(new AdminDepartmentImpl());
        new DepartmentService(new HrDepartmentImpl());
        new DepartmentService(new TechDepartmentImpl());
    }
}
