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


@WebServlet("/save_resume")
public class SaveResumeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve resume data from the form
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
        String dbUser = "your_username";
        String dbPassword = "your_password";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");

            // Create a SQL query to insert the resume data into the database
            String sql = "INSERT INTO resumes (username, name, email, phone, address, experience, education) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, experience);
            preparedStatement.setString(7, education);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            if (rowsAffected > 0) {
                // Resume saved successfully, redirect to a success page
                response.sendRedirect("resume_saved.jsp");
            } else {
                // Resume saving failed, redirect to an error page
                response.sendRedirect("create_resume.jsp?error=Resume not saved");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("create_resume.jsp?error=Database error");
        }
    }
}
