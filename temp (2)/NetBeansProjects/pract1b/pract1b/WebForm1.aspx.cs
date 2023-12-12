using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pract1b
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            string str1;
             
            str1 = TextBox1.Text;
            int length  = str1.Length;
            TextBox2.Text = TextBox2.Text + length + "\r\n";
        }
    }
}