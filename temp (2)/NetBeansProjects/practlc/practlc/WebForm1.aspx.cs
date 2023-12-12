using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Xml.Linq;

namespace practlc
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string id, name, course, dob;

            id = Convert.ToString(TextBox1.Text);
            name = Convert.ToString(TextBox2.Text);
            course = Convert.ToString(TextBox3.Text);
            dob = Convert.ToString(TextBox4.Text);


            TextBox5.Text = TextBox5.Text + "Student ID = " + id + "\n";
            TextBox6.Text = TextBox6.Text + "Student Name = " + name + "\n";
            TextBox7.Text = TextBox7.Text + "Student Course = " + course + "\n"; 
            TextBox8.Text = TextBox8.Text+ "Date of Birth = " + dob + "\n";
        }

        protected void Button2_Click(object sender, EventArgs e)
        {

            TextBox5.Text = string.Empty;
            TextBox6.Text = string.Empty;
            TextBox7.Text = string.Empty;
            TextBox8.Text = string.Empty;


        }
    }
}