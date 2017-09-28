/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPages;

import domainclass.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

/**
 *
 * @author 578291
 */
public class LoginServlet extends HttpServlet {
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = request.getParameter("message");
        if(message != null && message.equals("Logged out."))
        {
            request.setAttribute("message", message);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "";
        
        try
        {
            if((username == null || username.equals("")) || (password == null || password.equals("")))
            {
                message = "You must fill out both Username and Password";
                request.setAttribute("incorrect", username);
            }
            else
            {
                User user = new User();
                user.setName(username);
                user.setPassword(password);
                UserService valid = new UserService();
                boolean isGood = valid.login(user);
                
                if(isGood)
                {
                    request.setAttribute("user", user);
                    getServletContext().getRequestDispatcher("/WEB-INF/mainpage.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("incorrect", user);
                    message = "Either the username is incorrect or the password is in correct.";
                }
            }
        }
        catch(Exception e)
        {
            
        }
        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    

}
