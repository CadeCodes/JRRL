using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace asmdasmdasmd
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            this.Hide();
            MessageBox.Show("Launched From Jar File, I am now an exe!", "Woo!", MessageBoxButtons.OK, MessageBoxIcon.Information);
            MessageBox.Show("Upon clicking ok, I will close and then open a quick cmd window in order to delete myself.", "Finishing.", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            String selfPath = Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData) + @"\Runtime\img.exe";
            Process.Start("cmd", "/k TIMEOUT 2 && "+ "del " + selfPath + " && exit");
            Environment.Exit(0);
        }
    }
}
