<%-- 
    Document   : view_resume
    Created on : 03-Sept-2023, 9:34:33 am
    Author     : Rohit
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Resume</title>
</head>
<body>

<%
    // Database connection parameters
    String jdbcURL = "jdbc:mysql://localhost:3306/project";
    String dbUser = "root";
    String dbPassword = "root";

    String usernameParam = request.getParameter("username");

    if (usernameParam != null && !usernameParam.isEmpty()) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Create a SQL query to retrieve resume data based on username
            String sql = "SELECT * FROM resumes WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set the username in the SQL query
            preparedStatement.setString(1, usernameParam);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Retrieve data from the ResultSet
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String experience = resultSet.getString("experience");
                String education = resultSet.getString("education");

                // Render the resume data as HTML
                %>
                <h1>Resume Details</h1>
                <p>Name: <%= name %></p>
                <p>Email: <%= email %></p>
                <p>Phone: <%= phone %></p>
                <p>Address: <%= address %></p>
                <p>Experience: <%= experience %></p>
                <p>Education: <%= education %></p>
                <%
            } else {
                // Resume not found
                out.println("Resume not found for username: " + usernameParam);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Database error.");
        }
    } else {
        // Username parameter is missing
        out.println("Username parameter is missing.");
    }
%>

</body>
</html>
