import java.io.*;
class Employee
{
    float salary = 40000;
}
class Programmer extends Employee
{
    int bonus = 10000;
    public static void main(String args[])
    {
        Programmer p=new Programmer();
        System.out.println("Salary of the programer is"+p.salary);
        System.out.println("bonus of the programmer is"+p.bonus);
        float grossalary=p.salary+p.bonus;
        System.out.println("grossalary of programmer is"+grossalary);
    }
}
