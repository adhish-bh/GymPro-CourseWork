/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author adhish
 */
public class LoginController {
    public static boolean isAdmin(String username) {
        return username.equalsIgnoreCase("admin");
    }
}
