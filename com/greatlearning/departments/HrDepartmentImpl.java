package com.greatlearning.departments;

import com.greatlearning.models.HrDepartment;

public class HrDepartmentImpl extends SuperDepartmentImpl implements HrDepartment {
    @Override
    public String departmentName() {
        return "Hr Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String doActivity() {
        return "team Lunch";
    }
}
