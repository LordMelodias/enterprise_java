using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pract1a.Properties
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int a, b, c, d;

            a = Convert.ToInt32(TextBox1.Text);
            b = Convert.ToInt32(TextBox2.Text);
            c = Convert.ToInt32(TextBox3.Text);
            d = Convert.ToInt32(TextBox4.Text);

            int ans = a *b * c * d;
            TextBox5.Text = Convert.ToString(ans);
        }
    }
}