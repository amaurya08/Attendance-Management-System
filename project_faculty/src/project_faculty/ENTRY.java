package project_faculty;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Dimension;

import javax.swing.JComboBox;

public class ENTRY extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	private JPanel contentPane;
	private JLabel type_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ENTRY frame = new ENTRY();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ENTRY() {
		setMinimumSize(new Dimension(800, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String facul[]={"AJ","AKV","AS","DCG","MN","NA","PD","SB","SS","SNG","SJ","PROSKEP","ONLINE"};
		String day[]={"MON","TUE","WED","THU","FRI","SAT"};
		String lectures[]={"1","2","3","4","5","6","7"};
		String type1[]={"LEC","NSP","TUT","LAB","PROSKEP","ONLINE"};
		String scode[]={"4CS1","4CS2","4CS3","4CS4","4CS5","4CS6","4CS7","4CS8","4CS9","4CS10","NSP","PROSKEP","ONLINE"};
		String ro[]={"CF13","AF11","AF02","AF15","AF12","AF11","AF07","AF14","ADM CELL"};
		String sec[]={"A","A1","A2","A3"};
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	
		
		JLabel FNAME = new JLabel("fname");
		
		JLabel DAY = new JLabel("day");
		
		JLabel LECNO = new JLabel("lecture Number");
		
		JLabel type;
		type_1 = new JLabel("type");
		
		JLabel subcodee = new JLabel("subcode");
		
		JLabel room = new JLabel("room");
		

		final JComboBox comboBox = new JComboBox(facul);
		
		final JComboBox comboBox_1 = new JComboBox(day);
		
		final JComboBox comboBox_2 = new JComboBox(lectures);
		
		final JComboBox comboBox_3 = new JComboBox(type1);
		
		final JComboBox comboBox_4 = new JComboBox(scode);
		
		final JComboBox comboBox_5 = new JComboBox(ro);
		
		final JComboBox comboBox_6 = new JComboBox(sec);
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{  
					Connection con=new database().getdbms();
					String fac=(String) comboBox.getSelectedItem();
					String day=(String) comboBox_1.getSelectedItem();
					String lec=(String) comboBox_2.getSelectedItem();
					String lect=(String) comboBox_3.getSelectedItem();
					String subc=(String) comboBox_4.getSelectedItem();
					String roomnum=(String) comboBox_5.getSelectedItem();
					String sec=(String) comboBox_6.getSelectedItem();
					String sql="INSERT INTO ATIMTABLE VALUES(\""+fac+"\",\""+day+"\",\""+lec+"\",\""+lect+"\",\""+subc+"\",\""+roomnum+"\",\""+sec+"\")";
					System.out.println(sql);
					Statement stmt=con.createStatement();
					
					if(stmt.executeUpdate(sql)==1)
						JOptionPane.showMessageDialog(null,"sucessfull","dialog demo",0);
					else
						JOptionPane.showMessageDialog(null,"fAILED","dialog demo",JOptionPane.ERROR_MESSAGE);
					con.close();  				
				}
					catch(Exception e1)
				 {
					System.out.println(e1);  
				 }
			}
		});
		
		JLabel lblNewLabel = new JLabel("Section");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(FNAME))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(DAY))
							.addGap(36)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(type_1))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(subcodee))
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(room))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(94))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(198)
							.addComponent(LECNO))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(264)
							.addComponent(btnUpdate)))
					.addContainerGap(195, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(LECNO)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(type_1)
						.addComponent(subcodee)
						.addComponent(room)
						.addComponent(lblNewLabel)
						.addComponent(DAY)
						.addComponent(FNAME))
					.addGap(26)
					.addComponent(btnUpdate)
					.addGap(100))
		);
		panel.setLayout(gl_panel);
	}
}
