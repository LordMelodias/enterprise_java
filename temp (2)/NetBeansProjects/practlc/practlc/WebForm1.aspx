<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="practlc.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Student ID =
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
            <br />
            Student Name =
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            <br />
            <br />
            Course Name&nbsp; =&nbsp;
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
            <br />
            <br />
            Date of Birth =&nbsp;
            <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" BackColor="#6699FF" OnClick="Button1_Click" Text="Register" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Button2" runat="server" style="height: 29px" OnClick="Button2_Click" Text="Refresh" />
            <br />
            <br />
            <br />
            Result:<br />
&nbsp;<br />
            <asp:TextBox ID="TextBox5" runat="server" Height="27px" Width="213px"></asp:TextBox>
            <br />
            <asp:TextBox ID="TextBox6" runat="server" Height="25px" Width="209px"></asp:TextBox>
            <br />
            <asp:TextBox ID="TextBox7" runat="server" Height="27px" Width="208px"></asp:TextBox>
            <br />
            <asp:TextBox ID="TextBox8" runat="server" Height="25px" Width="208px"></asp:TextBox>
        </div>
        <br />
    </form>
</body>
</html>
