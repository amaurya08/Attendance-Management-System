package project_faculty;

import javax.swing.JFrame;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Color;

public class Second {

	private JFrame frmFacultyView;
	public Second(JFrame last,faculty f)
	{
		initialize(last,f);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final JFrame last,faculty f) {
		frmFacultyView = new JFrame();
		frmFacultyView.setVisible(true);
		frmFacultyView.setMinimumSize(new Dimension(500, 450));
		frmFacultyView.setResizable(false);
		frmFacultyView.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kuldeep\\Desktop\\lgo.png"));
		frmFacultyView.setTitle("FACULTY : "+f.getFname());
		frmFacultyView.setBounds(100, 100, 450, 300);
		frmFacultyView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacultyView.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setToolTipText("");
		frmFacultyView.getContentPane().add(panel);
		
			
		String pool[]=f.getPool();
		
		String cb[]=f.getPoolYear();
		
		String cb1[]=f.getPoolsection();
		String cb0[]=f.getPooltype();
		
		
		
		String cb3[]=f.getPoollec();
		final JFrame one=frmFacultyView;
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(10, 11, 474, 78);
		
		JLabel lblPoornimaGroupOf = new JLabel("Poornima Group of Colleges");
		lblPoornimaGroupOf.setBackground(new Color(0, 0, 0));
		lblPoornimaGroupOf.setForeground(Color.BLACK);
		lblPoornimaGroupOf.setFont(new Font("Tahoma", Font.BOLD, 30));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(20)
					.addComponent(lblPoornimaGroupOf, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(200, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPoornimaGroupOf, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0,188,122));
		panel_2.setBounds(10, 99, 474, 71);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFacultyDetail = new JLabel("Faculty Detail");
		lblFacultyDetail.setForeground(new Color(255, 255, 255));
		lblFacultyDetail.setBounds(160, 11, 122, 25);
		panel_2.add(lblFacultyDetail);
		lblFacultyDetail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(10, 44, 45, 17);
		panel_2.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNavedAnjum = new JLabel();
		lblNavedAnjum.setForeground(new Color(255, 255, 255));
		lblNavedAnjum.setBounds(65, 47, 114, 14);
		panel_2.add(lblNavedAnjum);
		lblNavedAnjum.setText(f.getFname());
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBounds(189, 44, 57, 17);
		panel_2.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNavedanjumpoornimaorg = new JLabel();
		lblNavedanjumpoornimaorg.setForeground(new Color(255, 255, 255));
		lblNavedanjumpoornimaorg.setBounds(256, 47, 221, 14);
		panel_2.add(lblNavedanjumpoornimaorg);
		lblNavedanjumpoornimaorg.setText(f.getEmail());
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0,188,122));
		panel_3.setBounds(184, 306, 300, 104);
		panel.add(panel_3);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(new Color(255, 255, 255));
		lblYear.setBounds(10, 0, 26, 15);
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(255, 255, 255));
		lblSection.setBounds(60, 0, 48, 16);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblLecture = new JLabel("Lecture");
		lblLecture.setForeground(new Color(255, 255, 255));
		lblLecture.setBounds(131, 0, 50, 16);
		lblLecture.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		final JComboBox comboBox = new JComboBox(cb);
		comboBox.setBounds(10, 21, 40, 20);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		final JComboBox comboBox_1 = new JComboBox(cb1);
		comboBox_1.setBounds(68, 22, 40, 20);
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		final JComboBox comboBox_3 = new JComboBox(cb3);
		comboBox_3.setBounds(131, 22, 50, 20);
		comboBox_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		final JComboBox comboBox_2 = new JComboBox(cb0);
		comboBox_2.setBounds(200, 22, 50, 20);
		panel_3.add(comboBox_2);
		
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(10, 75, 87, 23);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		final faculty d=f;
		JButton btnTakeAttendance = new JButton("TAKE ATTENDANCE");
		btnTakeAttendance.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				 String getYear=(String)comboBox.getSelectedItem(); 
				 String getSection=(String)comboBox_1.getSelectedItem(); 
				
				 String getLecture=(String)comboBox_3.getSelectedItem(); 
				 String getType=(String)comboBox_2.getSelectedItem(); 
				 
				 attend a;
				take t;
				if(attend.check(getYear,getSection,getLecture,getType,d)==1)
					{
					a=new attend(getYear,getSection,getLecture,getType,d);
					t=new take(frmFacultyView,a,d);
					}else
					 JOptionPane.showMessageDialog(null,"Incorrect Combination","INVALID DETAILS",JOptionPane.ERROR_MESSAGE);
				//attend a=new attend(getYear,getSection,getLecture,getType);
			}
			
		});
		
		btnTakeAttendance.setBounds(138, 75, 152, 23);
		btnTakeAttendance.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTakeAttendance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.setLayout(null);
		panel_3.add(lblLecture);
		panel_3.add(lblYear);
		panel_3.add(btnLogout);
		panel_3.add(comboBox_1);
		panel_3.add(comboBox);
		panel_3.add(lblSection);
		panel_3.add(comboBox_3);
		panel_3.add(btnTakeAttendance);
		
		
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblType.setBounds(200, 0, 50, 16);
		panel_3.add(lblType);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 188, 122));
		panel_4.setBounds(10, 181, 164, 229);
		panel.add(panel_4);
		
		JLabel lblLecturesOfDay = new JLabel("Lectures Of Day");
		lblLecturesOfDay.setForeground(new Color(255, 255, 255));
		lblLecturesOfDay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JList list = new JList(pool);
		list.setBackground(new Color(240, 230, 140));
		list.setForeground(new Color(0, 128, 0));
		list.setToolTipText("");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLecturesOfDay)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLecturesOfDay)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBackground(new Color(30, 144, 255));
		panel_5.setBounds(184, 181, 300, 114);
		panel.add(panel_5);
		
		JLabel lblCurrentLecture = new JLabel("CURRENT LECTURE");
		lblCurrentLecture.setForeground(new Color(255, 255, 255));
		lblCurrentLecture.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblcsaf = new JLabel("6=6cs8,AF03");
		lblcsaf.setForeground(new Color(255, 255, 255));
		lblcsaf.setText(f.current());
		lblcsaf.setFont(new Font("Stencil", Font.BOLD, 16));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCurrentLecture)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(43)
							.addComponent(lblcsaf)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(29)
					.addComponent(lblCurrentLecture)
					.addGap(15)
					.addComponent(lblcsaf)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		btnLogout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				one.dispose();
				
				last.dispose();
				Login l=new Login();
				l.call();
				
			}
		});
	}
}
