package com.greatlearning.services;

import com.greatlearning.departments.HrDepartmentImpl;
import com.greatlearning.departments.TechDepartmentImpl;
import com.greatlearning.models.SuperDepartment;

public class DepartmentService {

    public DepartmentService(SuperDepartment department){

        String isHr_doActivity = "";
        String isTech_techStackInformation = "";

        if(department instanceof HrDepartmentImpl) {
            isHr_doActivity =  ((HrDepartmentImpl) department).doActivity()  + "\n";
        }

        if(department instanceof TechDepartmentImpl) {
            isTech_techStackInformation =  ((TechDepartmentImpl) department).getTechStackInformation()  + "\n";
        }
        
        System.out.println("Welcome to "    +
                department.departmentName() + "\n"  +
                        isHr_doActivity             +
                department.getTodaysWork()  + "\n"  +
                        isTech_techStackInformation +
                department.getWorkDeadline()+ "\n"
        );

    }
}
