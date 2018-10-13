package Comp.Orgg.Apk;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Company {
    private static final String companyNmae = "QSPIDERS & JSPODERS";
    public static String  getCompanyName()
    { return companyNmae; }

    static Scanner sc = new Scanner(System.in);
    DetailsVerification dv = new  DetailsVerification();
    private String first_name;
    private String last_name;
    private long mobile_number;
    private String email_id;
    private String password;


    public void setFirst_name() {
        String first_name = Company.sc.next();
        if (dv.validate(first_name))
            this.first_name = first_name;
        else {
            System.err.println("Enter the your valid Name");
            setFirst_name();
        }
    }

    public void setLast_name() {
        String last_name = Company.sc.next();
        if(dv.validate(last_name))
            this.last_name = last_name;
        else {
            System.out.println("Enter the valid credentials");
            setLast_name();
        }
    }

    public void setMobile_number() {
        long mobile_number = Company.sc.nextLong();
        if (dv.verifyMobileno(mobile_number))
            this.mobile_number = mobile_number;
        else {
            System.err.println("Please enter the valid mobile number");
            setMobile_number();
        }
    }

    public void setEmail_id() {
        String email_id = Company.sc.next();
        if (dv.verifyMailid(email_id))
            this.email_id = email_id;
        else {
            System.out.println("Please enter the valid Email-Id");
            setEmail_id();
        }
    }

    public void setPassword() {
        String password = sc.next();
        if (dv.size(8,16, password))
            if(dv.verifyPassword(password))
                this.password = password;
            else
            {
                System.out.println("Password must contain a Letters of Lowercase and Uppercase, numbers, Special Symbols");
                setPassword();
            }
        else
        {
            System.out.println("Please enter 8 charecters to 10 charecters for password field");
            setPassword();
        }
    }




    public class DetailsVerification {

        public boolean verifyMailid(String s1) {
            Pattern p1 = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9._]+@?[a-zA-Z0-9]+([.][a-zA-Z]+)+");
            Matcher m1 = p1.matcher(s1);

            if (m1.find())
                return true;
            return false;
        }

        public boolean verifyMobileno(long l1) {
            Pattern p1 = Pattern.compile("(0|91)?[6789][0-9]{9}");
            Matcher m1 = p1.matcher("" + l1);
            Pattern p2 = Pattern.compile("(a-z|A-Z|\\W)");
            Matcher m2 = p2.matcher("" + l1);
            if (m1.find())
                if (m2.find())
                    return false;
                else
                    return true;
            return false;
        }

        public boolean validate(String s1) {
            Pattern p1 = Pattern.compile("[A-Z]*[a-z]+");
            Matcher m1 = p1.matcher("s1");
            Pattern p2 = Pattern.compile("(\\d|\\W)");
            Matcher m2 = p2.matcher(s1);
            if (m1.find())
                if (m2.find())
                    return false;
                else
                    return true;
            return false;
        }

        public boolean verify(String s1) {
            int count = 0;
            Pattern p1 = Pattern.compile("[\\w]+");
            Matcher m1 = p1.matcher(s1);
            Pattern p2 = Pattern.compile("[\\W]");
            Matcher m2 = p2.matcher(s1);
            if (m1.find())
                if (m2.find())
                    return false;
                else {
                    for (int i = 0; i < s1.length(); i++) {
                        if (Character.isUpperCase(s1.charAt(i))) {
                            count++;
                            break;
                        }
                    }
                    for (int i = 0; i < s1.length(); i++) {
                        if (Character.isLowerCase(s1.charAt(i))) {
                            count++;
                            break;
                        }
                    }
                    for (int i = 0; i < s1.length(); i++) {
                        if (Character.isDigit(s1.charAt(i))) {
                            count++;
                            break;
                        }
                    }
                }
            if (count == 3)
                return true;
            return false;
        }

        public boolean verifyPassword(String s1) {
            Pattern p1 = Pattern.compile("[\\w\\W]+[\\W]+");
            Matcher m1 = p1.matcher(s1);

            if (m1.find())
                return true;
            return false;
        }

        public boolean size(int min_length, int max_length, String input) {
            if ((input.length() >= min_length) && (input.length() <= max_length))
                return true;
            return false;
        }
    }

    public class StudentRegistration
    {
        String url = "jdbc:mysql://localhost:3306?user=root&password=09080706@As";
        PreparedStatement ps;
        public void storing()
        {
            String query = "insert into qspiders.studentregistration values(?,?,?,?,?)";
            try{

                ps = DriverManager.getConnection(url).prepareStatement(query);
                ps.setString(1, first_name);
                ps.setString(2, last_name);
                ps.setLong(3, mobile_number);
                ps.setString(4, email_id);
                ps.setString(5, password);
                ps.execute();
                System.out.println("Your Account has Successfully created");

            }
            catch (SQLException e)
            {
                System.out.println("Error " + e);
            }
        }
        public void register()
        {
            System.out.println("please enter your First name");
            setFirst_name();
            System.out.println("please enter your Last name");
            setLast_name();
            System.out.println("please enter your mobile number");
            setMobile_number();
            System.out.println("please Enter your Mail_Id");
            setEmail_id();
            System.out.println("please Enter your password");
            setPassword();
            System.out.println("please Enter your password once again to confirm");
            String confirm_password = sc.next();

            while(true) {
                if (password.equals(confirm_password)) {
                    storing();
                    break;
                }
                else
                {System.err.println("Please Enter the Same password in Confirm_Password box");
                    System.err.println("Try Again");
                    confirm_password = sc.next();
                }
            }
        }
    }
    public class EmployeeRegistration extends StudentRegistration
    {


        @Override
        public void storing() {
            String query = "insert into qspiders.employeeregistration values(?,?,?,?,?,?)";
            try{

                ps = DriverManager.getConnection(url).prepareStatement(query);
                ps.setString(1, first_name);
                ps.setString(2, last_name);
                ps.setLong(3, mobile_number);
                ps.setString(4, email_id);
                ps.setString(5, password);
                setSalary();
                ps.setDouble(6,salary);
                ps.execute();
                System.out.println("Your Account has Successfully created");
            }
            catch (SQLException e)
            {
                System.out.println("Error " + e);
            }
        }

        private double salary;
        public void setSalary()
        {
            System.out.println("Please Enter the Salary amount");
            double salary = sc.nextDouble();
            if(verifySalary(salary))
                this.salary = salary;
            else
                {
                System.err.println("Please enter the correct amount of salary");
                setSalary();}
        }
        private boolean verifySalary(double salary)
        {

            Pattern p = Pattern.compile("[a-zA-Z]");
            Matcher m1 = p.matcher(""+salary);
            Pattern p1 = Pattern.compile("\\d");
            Matcher m2 = p1.matcher(""+salary);
            if(m1.find())
                return false;
            else
            {
                if (m2.find())
                    return true;
            }
            return false;
        }
        public void registration()
        {
            register();
        }
    }
}

class InvalidEntry extends Exception{
    public InvalidEntry() {
        System.out.println("Please Enter valid Mobile number or Password");
    }
}