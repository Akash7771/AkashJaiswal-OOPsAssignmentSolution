package com.greatlearning.departments;

import com.greatlearning.models.AdminDepartment;

public class AdminDepartmentImpl extends SuperDepartmentImpl implements AdminDepartment {
    @Override
    public String departmentName() {
        return "Admin Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
