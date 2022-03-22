import DepartmentalClasses.*;
import java.lang.*;

public class Driver
{
    public static void main(String[] args)
    {
        SuperDepartment admin = new AdminDepartment();
        System.out.println("Welcome to " + admin.departmentName() + "\n" + admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n" + admin.isTodayAHoliday() + "\n");
        
        HrDepartment hr = new HrDepartment();
        System.out.println("Welcome to " + hr.departmentName() + "\n" + hr.doActivity() + "\n" + hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayAHoliday() + "\n");
        
        TechDepartment tech = new TechDepartment();
        System.out.println("Welcome to " + tech.departmentName() + "\n" + tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n" + tech.getTechStackInformation() + "\n" + tech.isTodayAHoliday() + "\n");

    }
}