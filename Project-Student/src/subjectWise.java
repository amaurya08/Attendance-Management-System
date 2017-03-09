import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;


public class subjectWise extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	private final JPanel contentPanel = new JPanel();
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub6;
	private JTextField sub4;
	private JTextField sub8;
	private JTextField sub5;
	private JTextField sub9;
	private JTextField sub3;
	private JTextField sub7;
	private JTextField sub10;
	private JLabel lblcs_2;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		try {
			subjectWise dialog = new subjectWise();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void call(final JFrame last,final JDialog lastd){
		try {
			subjectWise dialog = new subjectWise(last,lastd);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	/**
	 * Create the dialog.
	 */
	public subjectWise(final JFrame last,final JDialog lastd,student s) {
		setTitle("Subject_Wise_Attendance_view");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Works\\Project\\Image\\logo2.png"));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setMinimumSize(new Dimension(500, 500));
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblSubject = new JLabel("4CS01");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel lblSubject_1 = new JLabel("4CS02");
		lblSubject_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel lblSubject_2 = new JLabel("4CS03");
		lblSubject_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel lblSubject_3 = new JLabel("4CS04");
		lblSubject_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel lblcs = new JLabel("4CS05");
		lblcs.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblcs_1 = new JLabel("4CS06");
		lblcs_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblcs_3 = new JLabel("4CS08");
		lblcs_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblcs_4 = new JLabel("4CS09");
		lblcs_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		sub1 = new JTextField("28");
		sub1.setDisabledTextColor(new Color(0, 0, 0));
		sub1.setColumns(10);
		sub1.setEnabled(false);
		sub1.setText(Integer.toString(s.getSubject1()));
		
		sub2 = new JTextField("37");
		sub2.setDisabledTextColor(new Color(0, 0, 0));
		sub2.setColumns(10);
		sub2.setEnabled(false);
		sub2.setText(Integer.toString(s.getSubject2()));
		
		sub6 = new JTextField("9");
		sub6.setDisabledTextColor(new Color(0, 0, 0));
		sub6.setColumns(10);
		sub6.setEnabled(false);
		sub6.setText(Integer.toString(s.getSubject6()));
		
		sub4 = new JTextField("37");
		sub4.setDisabledTextColor(new Color(0, 0, 0));
		sub4.setColumns(10);
		sub4.setEnabled(false);
		sub4.setText(Integer.toString(s.getSubject4()));
		
		sub8 = new JTextField("10");
		sub8.setDisabledTextColor(new Color(0, 0, 0));
		sub8.setColumns(10);
		sub8.setEnabled(false);
		sub8.setText(Integer.toString(s.getSubject8()));
		
		sub5 = new JTextField("31");
		sub5.setDisabledTextColor(new Color(0, 0, 0));
		sub5.setColumns(10);
		sub5.setEnabled(false);
		sub5.setText(Integer.toString(s.getSubject5()));
		
		sub9 = new JTextField("7");
		sub9.setDisabledTextColor(new Color(0, 0, 0));
		sub9.setColumns(10);
		sub9.setEnabled(false);
		sub9.setText(Integer.toString(s.getSubject9()));
		
		sub3 = new JTextField("33");
		sub3.setDisabledTextColor(new Color(0, 0, 0));
		sub3.setColumns(10);
		sub3.setEnabled(false);
		sub3.setText(Integer.toString(s.getSubject3()));
		
		sub7 = new JTextField("8");
		sub7.setDisabledTextColor(new Color(0, 0, 0));
		sub7.setColumns(10);
		sub7.setEnabled(false);
		sub7.setText(Integer.toString(s.getSubject7()));
		
		sub10 = new JTextField("10");
		sub10.setDisabledTextColor(new Color(0, 0, 0));
		sub10.setColumns(10);
		sub10.setEnabled(false);
		sub10.setText(Integer.toString(s.getSubject10()));
		
		JLabel lblcs_5 = new JLabel("4CS10");
		lblcs_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblcs_2 = new JLabel("4CS07");
		lblcs_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(61)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSubject)
						.addComponent(lblSubject_1)
						.addComponent(lblSubject_2)
						.addComponent(lblcs, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSubject_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(sub1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sub2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sub3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sub4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sub5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblcs_3, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
								.addComponent(lblcs_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblcs_5, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
								.addComponent(lblcs_4, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
							.addGap(27))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblcs_2, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(sub10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(sub8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(sub7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(sub6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(sub9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(86))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(20)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblcs_1)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSubject)
								.addComponent(sub1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(sub2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblcs_2))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(sub3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSubject_2)
										.addComponent(lblcs_3))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSubject_3)
										.addComponent(sub4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblcs_4))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblcs)
										.addComponent(sub5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(5))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(6)
									.addComponent(lblSubject_1))))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(sub6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(16)
							.addComponent(sub7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(sub8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(sub9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(sub10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblcs_5))))
					.addGap(164))
		);
		
		JLabel lblSubjectWiseAttendance = new JLabel("Subject Wise Attendance View");
		lblSubjectWiseAttendance.setFont(new Font("Tahoma", Font.BOLD, 28));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSubjectWiseAttendance, GroupLayout.PREFERRED_SIZE, 444, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSubjectWiseAttendance, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
		final subjectWise th=this;
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.inactiveCaption);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Back");
				okButton.setActionCommand("Back");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent arg0) {
						th.dispose();
						lastd.setVisible(true);
						
					}
					
				});
			}
			{
				JButton cancelButton = new JButton("Check Another");
				cancelButton.setActionCommand("Check Another");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener(){

					public void actionPerformed(ActionEvent arg0) {
						lastd.setVisible(false);
						last.setVisible(true);
						th.dispose();	
					}
					
				});
			}
			
		}
		
	}
}
