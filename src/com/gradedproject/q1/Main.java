package com.gradedproject.q1;

/* This code contains SuperDepartment class which is super class and AdminDepartment, HrDepartment
and TechDepartment are sub classes of the super class they inherit all the properties of super class
 */
class SuperDepartment
{
    public static String departmentName()
    {
        return "Super Department";
    }
    public static String getTodaysWork()
    {
        return "No work as of now";
    }
    public static String getWorkDeadline()
    {
        return "Nil";
    }
    public static String isTodayAHoliday()
    {
        return "Today is not a holiday";
    }
}
class AdminDepartment extends SuperDepartment
{
    public static String departmentName()
    {
        return "Welcome to the Admin Department";
    }
    public static String getTodaysWork()
    {

        return "Complete your document submission";
    }
    public static String getWorkDeadline()
    {
        return "Comlete it by EOD";
    }
}
class HrDepartment extends SuperDepartment
{
    public static String departmentName()
    {
        return "Welcome to the HR Department";
    }
    public static String getTodaysWork()
    {
        return "Fill out today's timesheet and mark your attendance";
    }
    public static String getWorkDeadline()
    {
        return "Complete it by EOD";
    }
    public static String doActivity()
    {
        return "Team lunch";
    }
}
class TechDepartment extends SuperDepartment
{
    public static String departmentName()
    {
        return "Welcome to the Tech Department";
    }
    public static String getTodaysWork()
    {
        return "Complete coding of module 1";
    }
    public static String getWorkDeadline()
    {
        return "Complete it by EOD";
    }
    public static String getTechStackInformation()
    {
        return "Core java";
    }
}
public class Main {
    public static void main(String args[])
    {
        AdminDepartment ad = new AdminDepartment();
        HrDepartment hr = new HrDepartment();
        TechDepartment te = new TechDepartment();
        System.out.println(ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday()+"\n");
        System.out.println(hr.departmentName());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.doActivity());
        System.out.println(ad.isTodayAHoliday()+"\n");
        System.out.println(te.departmentName());
        System.out.println(te.getTodaysWork());
        System.out.println(te.getWorkDeadline());
        System.out.println(te.getTechStackInformation());
        System.out.println(te.isTodayAHoliday()+"\n");
    }
}
