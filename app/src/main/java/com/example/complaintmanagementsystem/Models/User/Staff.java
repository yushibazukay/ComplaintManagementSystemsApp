package com.example.complaintmanagementsystem.Models.User;

public class Staff extends User{
    private  String department;
    private  String designation;

    public Staff(String username,String password, String name, String email, int role,String department, String designation){
        super(username, password, name,email,role);
        this.department = department;
        this.designation = designation;
    }
}