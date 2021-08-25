package com.greatlearning.departments;

import com.greatlearning.models.SuperDepartment;

public class SuperDepartmentImpl implements SuperDepartment {
    @Override
    public String departmentName() {
        return "Super Department";
    }

    @Override
    public String getTodaysWork() {
        return "No Work as of now";
    }

    @Override
    public String getWorkDeadline() {
        return "Nil";
    }

    @Override
    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}
