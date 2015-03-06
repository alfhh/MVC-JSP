package email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.UserIO;

public class AddToEmailListServlet extends HttpServlet
{    
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException
    {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        String carrera = request.getParameter("carrera");
        User user = new User(firstName, lastName, emailAddress, carrera);
        String url = "";
        String message = "";
        
        if(firstName.length() == 0 || lastName.length() == 0 || emailAddress.length() == 0){
            message = "Form incomplete, please fill the blank spaces";
            url = "/join_email_list.jsp";
        }

        else {
            message = "";

            // get a relative file name
            ServletContext context = getServletContext();
            String path = context.getRealPath("/WEB-INF/EmailList.txt");
            // use regular Java classes
            UserIO.addRecord(user, path);
            // forward request and response objects to JSP page
            url = "/display_email_entry.jsp";
        }
        
        // store the User object in the request object
        request.setAttribute("user", user);
        request.setAttribute("message", message);
        
        
        RequestDispatcher dispatcher =
             getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);              
    }    
}
