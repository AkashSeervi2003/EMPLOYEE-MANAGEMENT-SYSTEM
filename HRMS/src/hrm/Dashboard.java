package hrm;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class Dashboard extends JFrame 
{
    JFrame f;
    JButton b1,b2,b3,b4; 
    JLabel l1;
    JPanel p1,p2,p3;
    Dashboard()
    { 
        f = new JFrame("Dashboard");
        f.setLayout(null); 
        
        b1 = new JButton("Employee Info."); 
        b1.setBounds(5,150,180,90);
        b1.setFont(new Font("Arail",Font.BOLD,18));
        f.add(b1); 
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { 
                EmployeeMangement.getInstance();
            }
        });
        
        b2 = new JButton("Attendance"); 
        b2.setBounds(10,300,180,90);
        b2.setFont(new Font("Arail",Font.BOLD,19));
        f.add(b2); 
        b2.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e)
            { 
                Attendance.getInstance();
            }
        });
        
        b3 = new JButton("Leave"); 
        b3.setBounds(10,450,180,90);
        b3.setFont(new Font("Arail",Font.BOLD,19));
        f.add(b3);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { 
                Leave.getInstance();
            }
        });

        b4 = new JButton("Logout"); 
        b4.setBounds(10,600,180,90);
        b4.setFont(new Font("Arail",Font.BOLD,19));
        f.add(b4);
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            { 
                f.dispose();
                new LoginPage();
            }
        });
        
        p1 = new JPanel(); 
        p1.setLayout(null);
        p1.setBackground(Color.PINK);
        p1.setBounds(0,0,950,106);
        f.add(p1);
        
        l1 = new JLabel("EMPLOYEE  MANAGEMENT  SYSTEM");
        l1.setBounds(70,0,950,100); 
        l1.setFont(new Font("Segoe UI",Font.BOLD,48));
        l1.setForeground(Color.black);
        p1.add(l1);
        
        p2 = new JPanel(); 
        p2.setLayout(null);
        p2.setBackground(Color.BLACK);
        p2.setBounds(0,0,200,800);
        f.add(p2);
        
        p3 = new JPanel(); 
        p3.setLayout(null); 
        p3.setBackground(Color.WHITE); 
        p3.setBounds(200,106,750,695);
        f.add(p3);
        
        ImageIcon image = new ImageIcon (getClass ().getResource ("/hrm/Pictures/main.png"));
        Image scaledImage = image.getImage ().getScaledInstance (700, 700,Image.SCALE_DEFAULT);
        image = new ImageIcon (scaledImage);
        JLabel imageLabel = new JLabel (image);
        imageLabel.setBounds (3,0,730,695); 
        p3.add (imageLabel);

        f.getContentPane(); 
        f.setVisible(true); 
        f.setSize(950,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    { 
        new Dashboard();
    }
}