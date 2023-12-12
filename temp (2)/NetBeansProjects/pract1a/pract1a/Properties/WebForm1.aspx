<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="pract1a.Properties.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <p>
            Enter&nbsp; first number =
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </p>
        <p>
            Enter second number =
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        </p>
        <p>
            Enter third number =
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        </p>
        <p>
            Enter fourth number =<asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
        </p>
        <p>
            Answer&nbsp; =
            <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
        </p>
        <asp:Button ID="Button1" runat="server" BorderColor="#6666FF" OnClick="Button1_Click" Text="Enter" />
    </form>
</body>
</html>
