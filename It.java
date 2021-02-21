
package com.company;
import java.sql.*;
class It
{
    String connection = "jdbc:postgresql://localhost:5432/java";
    Connection con;
    ResultSet res;
    Statement stmt;
    public void InputDB(int id, String name, String surname,int age, String position, int salary)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,"postgres","astana2020");
            stmt = con.createStatement();
            res = stmt.executeQuery("insert into itcompany(id,name,surname,age,position, salary) values(" + id + ",'" + name + "','" + surname + "'," + age + " ,'"+ position + ",')");
        }
        catch (SQLException e)
        {
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void ReadDB(int id)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,"postgres","astana2020");
            stmt = con.createStatement();
            res = stmt.executeQuery("select * from itcompany where id = " + id);
            while(res.next())
            {
                System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("surname") + " " + res.getInt("age"));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void UpdateDB(int id, String name, String surname, int age, String position, int salary)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,"postgres","astana2020");
            stmt = con.createStatement();
            res = stmt.executeQuery("update itcompany set name = " + "'" + name + "'" + ", surname = " + "'" + surname + "'" + ", age = " + age + " where id = " + id);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
        }
    }
    public void DeleteDB(int id)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,"postgres","astana2020");
            stmt = con.createStatement();
            res = stmt.executeQuery("delete from itcompany where id = " + id);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
        }
    }
    public  void OuputDB()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,"postgres","astana2020");
            stmt = con.createStatement();
            res = stmt.executeQuery("select * from itcompany");
            while(res.next())
            {
                System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("surname") + " " + res.getInt("age"));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
