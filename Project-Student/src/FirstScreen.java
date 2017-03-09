import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class FirstScreen extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private JPanel contentPane;
	private JTextField enterReg;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					 
					frame = new FirstScreen();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	
	public void FFirstScreen() 
	{
	firstframe();
	}
	
	public FirstScreen() 
	{
		setMinimumSize(new Dimension(400, 320));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Works\\Project\\Image\\logo2.png"));
		setTitle("Student_First_Page");
		FFirstScreen();
	}
	
	
	int firstframe()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		String college[]={"PCE","PIET","PGI"};
		String year[]={"1","2","3","4"};
		
		/*All Declarations*/
		JComboBox comboBox = new JComboBox(college);
		
		JButton btnSubmit = new JButton("SUBMIT");
		JComboBox comboBox_1 = new JComboBox(year);
		enterReg = new JTextField();
		textField = new JTextField();		
		textField_1 = new JTextField();
		textField_2 = new JTextField();
		
		
		JLabel label = new JLabel("/");
		JLabel label_1 = new JLabel("/");
		JLabel label_2 = new JLabel("/");
		JLabel lblEnterYourRegisteration = new JLabel("ENTER YOUR REGISTERATION NUMBER");
		JLabel lblEgpcece = new JLabel("e.g. (PCE/CE/14/022)");
		JLabel lblPoornimaGroupOf = new JLabel("POORNIMA GROUP OF COLLEGES");
		lblPoornimaGroupOf.setFont(new Font("Tahoma", Font.PLAIN, 28));
		/*Adding to the group layout*/
		btnSubmit.setAlignmentX(Component.CENTER_ALIGNMENT);
final	JComboBox j=comboBox_1; 
final JComboBox j1=comboBox;
		btnSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String reg=textField_2.getText()+"/"+enterReg.getText()+"/"+textField.getText()+"/"+textField_1.getText();
				reg=reg.toUpperCase();
				
				int year=j.getSelectedIndex();
				year++;
				String s1="";
				int d1=j1.getSelectedIndex();
				d1++;
				switch(d1)
				{
				case 1:
					s1="PCE";
					break;
				case 2:
					s1="PIET";
					break;
				case 3:
					s1="PGI";
					break;
				}
				
				try{  
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydb","root","hoot4813");   
					
					String sql = "select regid from student where regid=\""+reg+"\""+" and year= \""+year+"\" and college=\""+s1+"\"";
					
					Statement stmt=con.createStatement();  
					//System.out.println(reg+sql);
					ResultSet rs=stmt.executeQuery(sql);
					if(!rs.next())
					{
						 
						JOptionPane.showMessageDialog(null,"INVALID DETAILS!!!!  Plz Enter Correct Details","Details Invalid",JOptionPane.ERROR_MESSAGE);
						
					}
					else
					{
					student s=new student(reg);
					Dialog1 d=new Dialog1(frame,s);
					d.setVisible(true);
					}
					con.close(); 
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Error"+e1.getMessage());
                    }  
				
				
			}
		});
		
		JList list = new JList();
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblKkk = new JLabel("");
		lblKkk.setIcon(new ImageIcon("D:\\Works\\Project\\Image\\logo2.png"));
		
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(87)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEgpcece)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(enterReg, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(106)
							.addComponent(lblEnterYourRegisteration))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(175)
							.addComponent(btnSubmit))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPoornimaGroupOf, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(142)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblKkk, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblYear)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblPoornimaGroupOf, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblKkk, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYear))
					.addGap(9)
					.addComponent(lblEnterYourRegisteration)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(enterReg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(label_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEgpcece)
					.addGap(8)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	return 0;
	}
}
