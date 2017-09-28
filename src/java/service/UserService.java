/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domainclass.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 578291
 */
@WebServlet(name = "UserService", urlPatterns = {"/UserService"})
public class UserService extends HttpServlet {
    public boolean login(User user)
    {
        String username = user.getName();
        String password = user.getPassword();
        boolean result = false;
        if((username.equals("adam") || username.equals("betty")) && password.equals("password"))
        {
            result = true;
        }
        
        return result;
    }
}
