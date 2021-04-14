import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


/**
 *
 * @author maggiemayer
 */

public class Toolbox {

    public static void main(String args[]) throws Exception {
        new Toolbox();
    }

    private Toolbox() throws Exception{
        
        // original set up //
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        
        JPanel top = new JPanel();
        top.setLayout(new GridBagLayout());
        frame.setTitle("Data Science Toolbox - Maggie Mayer");
        frame.setSize(600, 600);
        JLabel welcome = new JLabel("Welcome to Data Science Toolbox.");
        top.add(welcome);
        JLabel text = new JLabel("Please run one of the following applications:");
        top.add(text);
        top.setPreferredSize(new Dimension(600,100));
        frame.getContentPane().add(top);
        frame.pack();
        
        // make all the buttons //
        JButton RStudio = new JButton("RStudio");
        JButton Spyder = new JButton("Spyder");
        JButton IBM = new JButton("IBM SAS");
        JButton Git = new JButton("Git");
        JButton Jupyter = new JButton("Jupyter Notebook");
        JButton Orange = new JButton("Orange");
        JButton Visual = new JButton("Visual Studio Code IDE");
        JButton Hadoop = new JButton("Apache Hadoop");
        JButton Spark = new JButton("Apache Spark");
        JButton Tableau = new JButton("Tableau");
        JButton Sonar = new JButton("SonarQube and SonarScanner Binaries");
        JButton Tensor = new JButton("Tensorflow");
        JButton Markdown = new JButton("Markdown");
        
        // add all the action listeners //
        RStudio.addActionListener(new RStudio());
        Spyder.addActionListener(new Spyder());
        IBM.addActionListener(new IBM());
        Git.addActionListener(new Git());
        Jupyter.addActionListener(new Jupyter());
        Orange.addActionListener(new Orange());
        Visual.addActionListener(new Visual());
        Hadoop.addActionListener(new Hadoop());
        Spark.addActionListener(new Spark());
        Tableau.addActionListener(new Tableau());
        Sonar.addActionListener(new Sonar());
        Tensor.addActionListener(new Tensor());
        Markdown.addActionListener(new Markdown());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        panel.add(RStudio);
        panel.add(Spyder);
        panel.add(Visual);
        panel.add(Spark);
        panel.add(Sonar);
        panel.add(Tensor);
        panel.add(Markdown);
        panel.add(IBM);
        panel.setPreferredSize(new Dimension(600,300));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        
    }

    private static class RStudio implements ActionListener {

        public RStudio() {
        }

        public void actionPerformed(ActionEvent e){
            try{
                Desktop.getDesktop().browse(new URL("https://rstudio.cloud/").toURI());
            }catch(Exception ex){
                System.out.println("error w/ rstudio");
            }
        }
        
    }

    private static class Spyder implements ActionListener {

        public Spyder() {
        }

        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:5900").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ spyder");
            }
        }
    }

    private static class Jupyter implements ActionListener {

        public Jupyter() {
        }

        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("https://mybinder.org/v2/gh/jupyterlab/jupyterlab-demo/3818244?urlpath=lab/tree/demo").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ jupyter");
            }
        }
    }

    private static class Visual implements ActionListener {

        public Visual() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:8443").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ visual studio");
            }
        }
        
    }

    private static class Spark implements ActionListener {

        public Spark() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:8887?token=easy").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ spark");
            }
        }
    }

    private static class Sonar implements ActionListener {

        public Sonar() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("https://sonarcloud.io/sessions/new").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ sonarqube");
            }
        }
    }

    private static class Tensor implements ActionListener {

        public Tensor() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:8989?token=easy").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ spyder");
            }
        }
    }

    private static class Markdown implements ActionListener {

        public Markdown() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:12345").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ markdown");
            }
        }
    }

    private static class IBM implements ActionListener {

        public IBM() {
        }

        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("https://welcome.oda.sas.com/login").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ IBM SAS");
            }
        }
    }

    private static class Git implements ActionListener {

        public Git() {
        }

        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:8080").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ git");
            }
        }
    }

    private static class Orange implements ActionListener {

        public Orange() {
        }
        
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:6901").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ orange");
            }
        }
    }

    private static class Tableau implements ActionListener {

        public Tableau() {
        }
                
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("https://sso.online.tableau.com/public/idp/SSO").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ tableau");
            }
        }
        
    }
    
    private static class Hadoop implements ActionListener {

        public Hadoop() {
        }
                
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL("http://localhost:50070").toURI());
            } catch (Exception ex) {
                System.out.println("error w/ tableau");
            }
        }
        
    }
}