package Comp.Orgg.Apk;

import java.util.Scanner;

public class User {

    static {
        System.out.println("**************** " + Company.getCompanyName() + " *************************");
    }
    static Scanner sc = new Scanner(System.in);

    public static void main(String argv[]) {
        System.out.println("Please enter the what you wanna do");
        System.out.println("1.EmployeeRegistration");
        System.out.println("2.StudentRegistration");
        System.out.println("1.Login");

        while (true)
        {
            switch (sc.next().toUpperCase())
            {
                case "EMPLOYEEREGISTRATION":
                case "1":
                     empreg();
                     break;
                case "STUDENTREGISTRATION":
                case "2":
                        stdreg();
                        break;
                case "LOGIN":
                case "3":
                        log();
                        break;
                default:
                    System.out.println("Please give the proper input");
            }
        }
    }
    public static void log()
    {
        Login l1 = new Login(sc.next().toUpperCase());
    }

    public static void empreg() {
        Company.EmployeeRegistration er = new Company().new EmployeeRegistration();
        er.registration();
    }

    public static void stdreg()
    {
          Company.StudentRegistration sr = new Company().new StudentRegistration();
          sr.register();
    }
}

