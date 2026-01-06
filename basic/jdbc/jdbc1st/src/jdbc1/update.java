package jdbc1;
// CORRECT for standard JDBC
import java.sql.Statement;

import java.sql.*;

import java.sql.Connection;
import java.util.Scanner;



public class update {
    public static void main(String[] args) {
        try (Connection conn = GetConnect.getConnect()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String employeeName = sc.next();
            System.out.println("Enter salary");
            int salary = sc.nextInt();
            System.out.println("Enter skill");
            String skill = sc.next();

            Statement st = (Statement) conn.createStatement();
            String sql = "insert into employee(name,salary,skill) values('" + employeeName + "'," + salary + ",'"
                    + skill + "')";
            int x = ((java.sql.Statement) st).executeUpdate(sql);
            if (x != 0)
                System.out.println("Record Inserted...");
            else
                System.out.println("Record not inserted...");
        } catch (Exception e) {

        }
    }

}

// public static void main(String args[]) {

// try (Connection con = GetConnection.getConnection();
// Scanners new Scanner(System.in);
// System.out.println("Enter name");
// String mployeeManesc.next():
// System.out.println("Enter salary");
// tet salary sc.nextInt();
// System.out.println("Enter skill");
// String skill sc.next();
// Statement st con.createStatement();
// String st employee(name, salary.skill) values("+employeellame+" at "insert
// into employee(name,
// stst.executeUpdate(sql);
// If(x1-6)
// System.out.println("Record Inserted...");
// alse
// System.out.println("Record not inserted...");
// catch(Exception e) {
// }