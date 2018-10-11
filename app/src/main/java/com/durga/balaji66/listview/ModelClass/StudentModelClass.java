package com.durga.balaji66.listview.ModelClass;

public class StudentModelClass {

    private String Name;
    private String Phone;
    private String Password;

    public StudentModelClass() {
    }

    public StudentModelClass(String name, String phone, String password) {
        Name = name;
        Phone = phone;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
