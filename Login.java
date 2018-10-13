package Comp.Orgg.Apk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Login
{

    Company.StudentRegistration s1 = new Company().new StudentRegistration();
    String url = s1.url;
    String query = "";
    Scanner sc = new Scanner(System.in);
    Connection conn = null;
    PreparedStatement ps = null;

    public void linking()
    {
        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public Login(String dataEntry)
    {
        if(dataEntry.equals("EMPLOYEELOGIN"))
            query = "select * from qspiders.employeeregistration where Mobile_Number=? and Password = ?";
        query = "select * from qspiders.studentregistration where Mobile_Number=? and Password = ?";
        try {
            linking();
            PreparedStatement ps = conn.prepareStatement(query);
            System.out.println("Please Enter your registered Mobile number");
            long mo = sc.nextLong();
            System.out.println("Please Enter your password");
            String pa = sc.next();
            ps.setLong(1,mo);
            ps.setString(2,pa);

            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                String s = rs.getString("Password");
                Login.MobileSearch ms = new Login.MobileSearch();
            }
            else
                throw new InvalidEntry();
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        catch (InvalidEntry invalidEntry) {
            new InvalidEntry();
        }
        catch (InputMismatchException e)
        {
            new InvalidEntry();
        }
    }
    class MobileSearch
    {
        String s1 ="select * from mobilestorage.mobile_specs where Name=?";
        MobileSearch() {
            while (true) {
                query = "select * from mobilestorage.mobile_specs where Name=?";
                try {
                    ps = conn.prepareStatement(query);
                    System.out.println("Please the Enter the Mobile Name ");

                    String s = sc.next().toUpperCase();
                    ps.setString(1, s);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        String[] v = new String[13];
                        v[0] = rs.getString("Name");
                        v[1] = rs.getString("Price");
                        v[2] = rs.getString("Screen _Size");
                        v[3] = rs.getString("Ram");
                        v[4] = rs.getString("Internal_Storage");
                        v[5] = rs.getString("External_Storage");
                        v[6] = rs.getString("Front_Camera");
                        v[7] = rs.getString("Rear_Camera");
                        v[8] = rs.getString("Battery");
                        v[9] = rs.getString("Processor");
                        v[10] = rs.getString("Fingerprint");
                        v[11] = rs.getString("Faceunlock");
                        v[12] = rs.getString("OS");

                        for (String index : v)
                            System.out.println(index);
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                    new InvalidEntry();
                }
                System.out.println("Do you want to continue");
                System.out.println("1. YES      2.NO");
                if(sc.next().toUpperCase().equals("YES")? true : false)
                    break;
            }
        }
    }
    class Upgrading
    {

    }
}


// public Login(){
//        String loginquery = "select * from qspiders.employeeregistration where Mobile_Number=? and Password = ?";
//        Company.StudentRegistration s1 = new Company().new StudentRegistration();
//        try {
//            PreparedStatement connection = DriverManager.getConnection(s1.url).prepareStatement(loginquery);
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please Enter your registered Mobile number");
//            long mo = sc.nextLong();
//            System.out.println("Please Enter your password");
//            String pa = sc.next();
//            ResultSet rs = connection.executeQuery();
//            if(rs.next()){
//                String s = rs.getString("Password");
//                MobileSearch ms = new MobileSearch();
//            }
//            else
//                throw new InvalidEntry();
//        }
//        catch (SQLException e)
//        {
//            System.out.println(e);
//        }
//        catch (InvalidEntry invalidEntry) {
//            invalidEntry.printStackTrace();
//        }
//        catch (InputMismatchException e)
//        {
//            new InvalidEntry();
//        }


















class EmployeeSignIn
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String un;
    String pd;
    EmployeeSignIn()throws Exception
    {
        this.signin();
    }
    public static void main(String argv[]) throws Exception
    {
        new EmployeeSignIn();
    }
    void signin()throws Exception
    {
        System.out.println("Enter the Employee_Id");
        this.un = br.readLine().toUpperCase();
        System.out.println("Enter the corresponding password");
        this.pd = br.readLine();
//        new EmployeeSignUp(this.un,this.pd);
    }
}


