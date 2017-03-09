package project_faculty;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ListSelectionModel;


public class take {

	private JFrame frmTakeAttendance;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public take(JFrame last,attend a,faculty f) {
		initialize(last,a,f);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final JFrame last,attend a,faculty f) {
		frmTakeAttendance = new JFrame();
		frmTakeAttendance.setTitle("TAKE ATTENDANCE");
		frmTakeAttendance.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kuldeep\\Desktop\\lgo.png"));
		frmTakeAttendance.setMinimumSize(new Dimension(600, 400));
		frmTakeAttendance.setVisible(true);
		frmTakeAttendance.setBounds(100, 100, 450, 300);
		frmTakeAttendance.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		final String name[]=a.getNames();
		
		final JFrame two=frmTakeAttendance;
		
		JLabel header = new JLabel("Poornima Group Of Collages");
		header.setBounds(30, 0, 522, 51);
		header.setFont(new Font("Tahoma", Font.PLAIN, 42));
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(476, 327, 86, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{

				two.dispose();
				last.setVisible(true);
			}
		});
		
		JButton btn = new JButton("SUBMIT ATTENDANCE");
		
		btn.setBounds(336, 327, 139, 23);
		
		JScrollPane scrollpane ;
		
		 scrollpane = new JScrollPane();
		 scrollpane.setBounds(10, 50, 130, 300);
		 frmTakeAttendance.getContentPane().add(scrollpane);
	final faculty d=f;
	final JList list = new JList(name);
	list.setBounds(210, 51, 128, 146);
	frmTakeAttendance.getContentPane().add(list);
		
		 btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					int indices[]=list.getSelectedIndices();
					for(int i=0;i<indices.length;i++)
					{
						attend.markattendance(name[indices[i]],d);
					}
					JOptionPane.showMessageDialog(null,"Attendance Successfully Submitted","dialog demo",JOptionPane.INFORMATION_MESSAGE);
					two.dispose();
					last.setVisible(true);
				}
			});
		frmTakeAttendance.getContentPane().setLayout(null);
		frmTakeAttendance.getContentPane().add(header);
		frmTakeAttendance.getContentPane().add(btnBack);
		frmTakeAttendance.getContentPane().add(btn);
		
	
	}
}
