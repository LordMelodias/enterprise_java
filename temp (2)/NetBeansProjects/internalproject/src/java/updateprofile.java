import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@WebServlet("/update_profile")
public class updateprofile extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user inputs from the form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String experience = request.getParameter("experience");
        String education = request.getParameter("education");

        // Validate the data (add more validation as needed)

        // Assuming you have already stored the username in the session during login
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        // Database connection parameters
        String jdbcURL = "jdbc:mysql://localhost:3306/project";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

            // Create a SQL query to update the user's profile data
            String sql = "UPDATE resumes SET name = ?, email = ?, phone = ?, address = ?, experience = ?, education = ? WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, experience);
            preparedStatement.setString(6, education);
            preparedStatement.setString(7, username);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            if (rowsAffected > 0) {
                // Profile updated successfully, redirect to a success page
                response.sendRedirect("profile_updated.jsp");
            } else {
                // Profile update failed, redirect to an error page
                response.sendRedirect("edit_profile.jsp?error=Profile not updated");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("edit_profile.jsp?error=Database error");
        }
    }
}
