/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
//public class student {
//public void CreateNewUser(int id, String name, String 
//username, String password, String capchar)
//{
//System.out.println(id + " " + name);
//}
//}
public class student {
    private int id;
    private String name;
    private String username;
    private String password;
    private String captcha;

    public student() {
    }

    public student(int id, String name, String username, String password, String captcha) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.captcha = captcha;
    }

}