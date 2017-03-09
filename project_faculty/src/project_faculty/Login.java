package project_faculty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Color;

public class Login {

	private JFrame frmPoornimaGroup;
	private JTextField txtEnterYourEmail;
	private JPasswordField passwordField;
	static int no=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login window = new Login();
					window.frmPoornimaGroup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void call()
{
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				
				Login window = new Login();
				window.frmPoornimaGroup.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPoornimaGroup = new JFrame();
		//frmPoornimaGroup.setDefaultLookAndFeelDecorated(true);
		frmPoornimaGroup.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmPoornimaGroup.setMinimumSize(new Dimension(600, 400));
		frmPoornimaGroup.setResizable(false);
		frmPoornimaGroup.setTitle("POORNIMA ATTANDANCE MANAGEMENT");
		frmPoornimaGroup.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kuldeep\\Desktop\\lgo.png"));
		frmPoornimaGroup.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frmPoornimaGroup.setBounds(100, 100, 450, 300);
		frmPoornimaGroup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblEmail = new JLabel("E-Mail ID:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtEnterYourEmail = new JTextField();
		txtEnterYourEmail.setText("meenakshinawal@poornima.org");
		txtEnterYourEmail.setColumns(10);
		
		passwordField = new JPasswordField("password");
		passwordField.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 14));
		passwordField.setToolTipText("");
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		
		JLabel label = new JLabel("");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kuldeep\\Desktop\\lgo.png"));
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmPoornimaGroup.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(218)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(194, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword)
								.addComponent(lblEmail))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtEnterYourEmail, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(121)
							.addComponent(label)))
					.addContainerGap(129, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(243, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(216))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(label)))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnterYourEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(26)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
		);
		
		JLabel lblPoornimaGroupOf = new JLabel("Poornima Group Of Colleges");
		lblPoornimaGroupOf.setForeground(new Color(0, 0, 255));
		panel_1.add(lblPoornimaGroupOf);
		lblPoornimaGroupOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoornimaGroupOf.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		
			
		
		//mouse listners for textfield email id
		
		txtEnterYourEmail.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				txtEnterYourEmail.setText("");
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	// mouse listner for password field
		
		passwordField.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				passwordField.setText("");
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		//------------
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setToolTipText("click for login");
		//---------------------------
		
		
		
		
		//Action listner with database connectivety for login button
		
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				try{  
					Connection con=new database().getdbms();
					Statement stmt=con.createStatement();  
				
					String eml=txtEnterYourEmail.getText();
					char[] pwd=passwordField.getPassword();
					String s11="";
					int i;
					for(i=0;i<pwd.length;i++)
					{
					s11+=pwd[i];	
					}
					String s1="select email from login where email =\""+eml+"\""+"and password=\""+s11+"\"";
					ResultSet rs=stmt.executeQuery(s1);
					
					if(rs.next())  
					{
						faculty f=new faculty(eml);
						frmPoornimaGroup.dispose();
						Second s=new Second(frmPoornimaGroup,f);					 
					}
					else
						JOptionPane.showMessageDialog(null,"username password not match","INVALID DETAILS",JOptionPane.ERROR_MESSAGE);
						
					con.close();  

					
				}
					catch(Exception e1)
				 {
					System.out.println(e1);  
			   	 }
			}	
				
		});
		
		
		panel.add(btnLogin);
		frmPoornimaGroup.getContentPane().setLayout(groupLayout);
	}
}
