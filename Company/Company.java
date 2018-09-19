package Project.Company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Company {
    private String firstname;
    private String lastname;
    private String userid;
    private String password;
    private double salary;
    private String employeeid;


    private InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    private boolean validate(String str) {
        int count = 0;
        for(int i = 0; i<= (str.length()-1); i++){
            if(Character.isDigit(str.charAt(i)))
                count++; }
        if(count == 0)
            return true;
        else
            return false;
    }
    private boolean verify(String credential){
        int ncount = 0;
        int scount = 0;
        int ccount = 0;
     for(int i=0; i<credential.length(); i++) {
         if (Character.isDigit(credential.charAt(i)))
         {ncount++; break;}
     }
     if(ncount != 0)
         for(int j=0; j<credential.length(); j++) {
             if (Character.isLowerCase(credential.charAt(j)))
             {scount++; break;}
         }
     if(scount != 0)
         for(int k=0; k<credential.length(); k++) {
             if (Character.isUpperCase(credential.charAt(k)))
             {ccount++; break;}
         }
     if(ccount != 0)
         return true;
     return false;
    }
    public boolean size(int min_length, int max_length, String input ) {
        if((input.length() >= min_length) && (input.length() <= max_length) )
            return true;
        return false;
    }
    private String getFirstname() {
        return firstname;
    }
    private void setFirstname(String firstname) throws Exception{
        if(validate(firstname))
            this.firstname = firstname.toUpperCase();
        else{
            System.out.println("Enter the valid credentials");
            setFirstname(br.readLine());
        }
    }
    private String getLastname() {
        return lastname;
    }
    private void setLastname(String lastname) throws Exception{
            if(validate(lastname))
        this.lastname = lastname.toLowerCase();
        else{
            System.out.println("Enter the valid credentials");
            setLastname(br.readLine());}
    }
    private String getUserid() {
        return userid;
    }
    private void setUserid(String userid) throws Exception{
        if(size(6,12,userid))
            if(verify(userid))
                this.userid = userid;
            else{
                System.out.println("userid must contain atleast one number, one small letter as well as one Capital letter");
                br.readLine(); }
        else{
            System.out.println("userid must contain 6 to 12 charecters");
            br.readLine(); }
    }
    public String getPassword() {
        return password;
    }
    void setPassword(String password) throws Exception{
        int splcount = 0;
        if (size(8,10, password))
                if(verify(password))
                    for(int i=0; i<(password.length()-1); i++){
                        if(password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '_')
                            {splcount++; break;} }
                else
                    setPassword(br.readLine());
        else{
            System.out.println("Please enter 8 charecters to 10 charecters for password field");
            setPassword(br.readLine());}
        if(splcount != 0)
            this.password = password;
        else{
            System.out.println("userid must contain atleast one number, one small letter, one Capital letter as well as one special charecter");
            setPassword(br.readLine());
        }
        }

    private double getSalary() {
        return salary;
    }
    private void setSalary(double salary) {
        this.salary = salary;
    }
    private String getEmployeeid() {
        return employeeid;
    }
    private void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    private String toString()
    {
        return firstname + lastname;
    }
    private boolean equals(Object obj) {
        Company c1 = (Company)obj;
        return this.equals(c1);
    }

    public Company(String employeeid) throws IOException
    {

        try
        {
            System.out.println("Enter the First_Name");
        this.setFirstname(br.readLine());
            System.out.println("Enter the Last_Name");
        this.setLastname(br.readLine());
            System.out.println("Enter the User_Id");
        this.setUserid(br.readLine());
            System.out.println("Enter the Password");
        this.setPassword(br.readLine());
            System.out.println("Enter the salary");
        this.setSalary(Double.parseDouble(br.readLine()));
          //  System.out.println("Enter the Employee_ID");
        this.setEmployeeid(employeeid);
        }
        catch (Exception e)
        {
            System.out.println("Error : " +e);
        }
    }
    public void printEmployeeInfo()
    {
        System.out.println(this.getFirstname());
        System.out.println(this.getLastname());
        System.out.println(this.getUserid());
        System.out.println(this.getSalary());
        System.out.println(this.getEmployeeid());
    }
}
