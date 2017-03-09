import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dialog1 extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JButton cancelButton;
	private JLabel lblNewLabel;
	private JLabel lblSubject;
	private JLabel lblSubejct;
	private JLabel lblSubject_1;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblPercentage;
	private JLabel lblStatus;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lbltheAbovePredication;
	private JLabel lblTheNumberOf;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		try {
			Dialog1 dialog = new Dialog1();
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
	public void call(final JFrame last,student s)
	 {
			try {
				Dialog1 dialog = new Dialog1(last,s);
				
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public Dialog1(final JFrame last,student s) {
		setTitle("Student_Attendance_View");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Works\\Project\\Image\\logo2.png"));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		last.setVisible(false);
		setMinimumSize(new Dimension(500, 500));
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		{
			lblNewLabel = new JLabel("Student Attendance View");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		lblSubject = new JLabel("Registeration ID :");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubejct = new JLabel("Name :");
		lblSubejct.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject_1 = new JLabel("Lectures Attended :");
		lblSubject_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label = new JLabel("");
		
		lblNewLabel_1 = new JLabel("Total Lectures :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblPercentage = new JLabel("Percentage :");
		lblPercentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblStatus = new JLabel("Status :");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField = new JTextField();
		textField.setDisabledTextColor(new Color(0, 0, 0));
		textField.setColumns(10);
		textField.setEnabled(false);
		textField.setText(s.getRegno());
		
		
		textField_1 = new JTextField();
		textField_1.setDisabledTextColor(new Color(0, 0, 0));
		textField_1.setColumns(10);
		textField_1.setEnabled(false);
		textField_1.setText(Integer.toString(s.sum()));
		
		textField_2 = new JTextField();
		textField_2.setDisabledTextColor(new Color(0, 0, 0));
		textField_2.setColumns(10);
		textField_2.setEnabled(false);
		textField_2.setText(Integer.toString(s.getTotal()));
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setDisabledTextColor(new Color(0, 0, 0));
		textField_3.setColumns(10);
		textField_3.setEnabled(false);
		
	
		
		textField_4 = new JTextField();
		textField_4.setDisabledTextColor(new Color(0, 0, 0));
		textField_4.setColumns(10);
		textField_4.setEnabled(false);
		textField_4.setText(s.getName());
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_5.setColumns(10);
		textField_5.setEnabled(false);
		
		if(s.percentage()>80)
			{
			textField_3.setDisabledTextColor(new Color(50,205,50));
			textField_3.setText(Float.toString(s.percentage()));
			textField_5.setDisabledTextColor(new Color(50, 205, 50)); 
			 textField_5.setText("Good");
			}
		else if(s.percentage()>=75&&s.percentage()<80)
			{
			textField_3.setDisabledTextColor(new Color(50,205,50));
			textField_3.setText(Float.toString(s.percentage()));
			textField_5.setDisabledTextColor(new Color(50, 205, 50));
			 textField_5.setText("Average");
			}
		else if(s.percentage()<75)
			{
			textField_3.setDisabledTextColor(new Color(255, 0, 0));
			textField_3.setText(Float.toString(s.percentage()));
			textField_5.setDisabledTextColor(new Color(255, 0, 0));
			 textField_5.setText("Poor");
			}
		
		JLabel lblLecturesToBe = new JLabel("Lectures Prediction*");
		lblLecturesToBe.setFont(new Font("Tahoma", Font.BOLD, 20));
		JTextArea textArea = new JTextArea();
		
		textArea.setFont(new Font("Monospaced", Font.BOLD, 12));
		textArea.setBackground(SystemColor.inactiveCaption);
		textArea.setForeground(new Color(255, 0, 0));
		String pre=s.getName()+", you have to attend "+s.predict()+" Lectures to Fulfill 75% criteria";
		if(s.percentage()<75)
		{
			textArea.setText(pre);
		}
		else
		{   
			textArea.setForeground(new Color(50, 205, 50));
			textArea.setText("Good Going !! Keep it up");
		}
		lbltheAbovePredication = new JLabel("*The above figures are calculated according to systametic calculation.");
		lbltheAbovePredication.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblTheNumberOf = new JLabel("The number of lectures may vary according to the Time Table arrangments .");
		lblTheNumberOf.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSubject_1)
								.addComponent(lblNewLabel_1)
								.addComponent(lblSubject)
								.addComponent(lblPercentage))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSubejct)
										.addComponent(lblStatus))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(59)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(141)
							.addComponent(lblLecturesToBe))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
					.addGap(32))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTheNumberOf)
							.addContainerGap())
						.addComponent(lbltheAbovePredication, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(140)
							.addComponent(label))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(72)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSubject)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSubject_1)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(26)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPercentage)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSubejct)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(102)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblStatus)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
					.addGap(32)
					.addComponent(lblLecturesToBe)
					.addGap(18)
					.addComponent(textArea)
					.addGap(30)
					.addComponent(lbltheAbovePredication)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTheNumberOf)
					.addGap(7))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.inactiveCaption);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("BACK");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			
			{
				cancelButton = new JButton("VIEW SUBJECT WISE");
				cancelButton.setActionCommand("Cancel");
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap(154, Short.MAX_VALUE)
						.addComponent(okButton)
						.addGap(46)
						.addComponent(cancelButton)
						.addGap(102))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(okButton)
							.addComponent(cancelButton))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
			
			
			final JDialog one=this;
			
			okButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					last.setVisible(true);
					one.dispose();
				}
			});
			final student s1=s;
			cancelButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					subjectWise d=new subjectWise(last,one,s1);
					d.setVisible(true);
				}
			});
		}
	}
}
