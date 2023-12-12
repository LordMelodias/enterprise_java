<%-- 
    Document   : edit_profile
    Created on : 01-Sept-2023, 9:55:16?pm
    Author     : Rohit
--%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Profile</title>
    <link rel="stylesheet" href="style3.css">
</head>
<body>
    <div class="info">
    <h1 align="center">Edit Your Profile</h1>
    
    <form action="update_profile" method="post">
        <label for="name">Full Name:</label>
        <input type="text" name="name" required>
        <br><br>
        <label for="email">Email:</label>
        <input type="email" name="email" required>
        <br><br>
        <label for="phone">Phone:</label>
        <input type="tel" name="phone">
        <br><br>
        <label for="address">Address:</label>
        <textarea name="address" rows="4"></textarea>
        <br><br>
        <label for="experience">Work Experience:</label>
        <textarea name="experience" rows="6"></textarea>
        <br><br>
        <label for="education">Education:</label>
        <textarea name="education" rows="6"></textarea>
        <br><br>
        <div class="button"><input type="submit" value="Save Changes"></div>
    </form>
</div>
</body>
</html>

