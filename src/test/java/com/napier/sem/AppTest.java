package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }


    @Test
    void displayEmployeeTestNull(){
        app.displayEmployee(null);
    }
    @Test
    void printSalariesTestEmpty()
    {
        Employee employe = new Employee();
        app.displayEmployee(employe);
    }
    @Test
    void DisplayEmployee()
    {
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        emp.dept_name = "Maung Maung";
        emp.manager = "Aye Aye Myint";
        app.displayEmployee(emp);
    }
}