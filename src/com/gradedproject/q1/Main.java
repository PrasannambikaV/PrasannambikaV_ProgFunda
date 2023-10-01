package com.gradedproject.q1;


public class Main {
    public static void main(String args[])
    {
        AdminDepartment ad = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment te = new TechDepartment();
        SuperDepartment su =new SuperDepartment();
        System.out.println(ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(su.isTodayAHoliday()+"\n");
        System.out.println(hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.doActivity());
        System.out.println(su.isTodayAHoliday()+"\n");
        System.out.println(te.departmentName());
        System.out.println(te.getTodaysWork());
        System.out.println(te.getWorkDeadline());
        System.out.println(te.getTechStackInformation());
        System.out.println(su.isTodayAHoliday()+"\n");
    }
}
