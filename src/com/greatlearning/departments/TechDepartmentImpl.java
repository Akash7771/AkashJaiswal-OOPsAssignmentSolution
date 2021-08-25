package com.greatlearning.departments;

import com.greatlearning.models.TechDepartment;

public class TechDepartmentImpl extends SuperDepartmentImpl implements TechDepartment {
    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String getTechStackInformation() {
        return "core Java";
    }
}
