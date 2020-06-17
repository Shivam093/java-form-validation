import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
class Grid implements ActionListener , KeyListener
{
	JFrame frmObj;
	GridLayout gridobj,gridobj1,gridobj2;
	JLabel lblrn,lblln,lbladd,lblgen,lblqual,lblhb;
	JTextField txtrn,txtln,txtadd;
	JRadioButton rbmale,rbfemale;
	ButtonGroup bg;
	JComboBox cbx;
	JCheckBox cbs,cbd,cbr,cbc;
	String[] stream={"__SELECT__","Diploma","Graduate"};
	JPanel pnlgen,pnlbtn1,pnlbtn2,pnlhby;
	JButton btnf,btnn,btnpr,btnl,btnadd,btnup,btndel,btnsub;
	public void createComp()
	{
		frmObj=new JFrame("Login");
		gridobj=new GridLayout(7,2);
		lblrn=new JLabel("Enter Roll NO");
		txtrn=new JTextField(10);
		lblln=new JLabel("Enter Name");
		txtln=new JTextField(10);
		lbladd=new JLabel("Enter Address");
		txtadd=new JTextField(10);
		lblgen=new JLabel("Select Gender");
		rbmale=new JRadioButton("Male");
		rbfemale=new JRadioButton("Female");
		pnlgen=new JPanel();
		pnlbtn1=new JPanel();
		pnlbtn2=new JPanel();
		lblhb=new JLabel("Select Hobby");
		cbs=new JCheckBox("Singing");
		cbr=new JCheckBox("Reading");
		cbd=new JCheckBox("Dancing");
		cbc=new JCheckBox("Cycling");
		pnlhby=new JPanel();
		bg=new ButtonGroup();
		lblqual=new JLabel("Enter Qualification");
		cbx=new JComboBox(stream);
		btnf=new JButton("First");
		btnn=new JButton("Next");
		btnpr=new JButton("Previous");
		btnl=new JButton("Last");
		btnadd=new JButton("Add");
		btnup=new JButton("Update");
		btndel=new JButton("Delete");
		btnsub=new JButton("Submit");
		gridobj1=new GridLayout(1,2);
		gridobj2=new GridLayout(2,2);
	}
	public void displayComp()
	{	
		bg.add(rbmale);
		bg.add(rbfemale);
		frmObj.setLayout(gridobj);
		frmObj.add(lblrn);
		frmObj.add(txtrn);
		frmObj.add(lblln);
		frmObj.add(txtln);
		frmObj.add(lbladd);
		frmObj.add(txtadd);
		frmObj.add(lblgen);
		frmObj.add(pnlgen);
		pnlgen.setLayout(gridobj1);
		pnlgen.add(rbmale);
		pnlgen.add(rbfemale);
		frmObj.add(lblhb);
		frmObj.add(pnlhby);
		pnlhby.setLayout(gridobj2);
		pnlhby.add(cbs);
		pnlhby.add(cbr);
		pnlhby.add(cbd);
		pnlhby.add(cbc);
		frmObj.add(lblqual);
		frmObj.add(cbx);
		frmObj.add(pnlbtn1);
		frmObj.add(pnlbtn2);
		pnlbtn1.add(btnf);
		pnlbtn1.add(btnn);
		pnlbtn1.add(btnpr);
		pnlbtn1.add(btnl);
		pnlbtn2.add(btnadd);
		pnlbtn2.add(btnup);
		pnlbtn2.add(btndel);
		pnlbtn2.add(btnsub);
		frmObj.setSize(650,650);
		frmObj.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(btnn)||ae.getSource().equals(btnadd)||
		   ae.getSource().equals(btnup)||ae.getSource().equals(btnsub)||
		   ae.getSource().equals(btnf)||ae.getSource().equals(btnpr)||ae.getSource().equals(btnl))
		   {
			   if(txtrn.getText().equals(" "))
				    JOptionPane.showMessageDialog(null,"Enter Roll NO","error",JOptionPane.ERROR_MESSAGE);
				else if(txtln.getText().equals(" "))
				{
				    JOptionPane.showMessageDialog(null,"Enter Name","error",JOptionPane.ERROR_MESSAGE);
				}
				else if(txtadd.getText().equals(" "))
				{
					JOptionPane.showMessageDialog(null,"Enter Address","error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!(rbmale.isSelected()||rbfemale.isSelected()))
				{
					JOptionPane.showMessageDialog(null,"Gender","error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!(cbs.isSelected()||cbr.isSelected()||cbd.isSelected()||cbc.isSelected()))
				{
					JOptionPane.showMessageDialog(null,"Hobby","error",JOptionPane.ERROR_MESSAGE);
				}
				else if(cbx.getSelectedItem().equals("__SELECT__"))
				{
					JOptionPane.showMessageDialog(null,"Qualification","error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		}
	
	public void keyPressed(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void keyTyped(KeyEvent ke)
	{
		if(ke.getSource().equals(txtrn))
		{
			if(ke.getKeyChar()>='0'&&ke.getKeyChar()<='9')
			{
			}
			else
			{
				if(ke.getKeyChar()=='\b')
				{
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter numeric value");
				}ke.consume();
			}
		}
		else if(ke.getSource().equals(txtln))
		{
			if(ke.getKeyChar()>='A'&&ke.getKeyChar()<='Z'||ke.getKeyChar()>='a'&&ke.getKeyChar()<='z')
			{
			}
			else
			{
				if(ke.getKeyChar()=='\b')
				{
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter a character");
				}ke.consume();
			}
		}
	}
	public void reg()
	{
		txtrn.addKeyListener(this);
		txtln.addKeyListener(this);
		btnf.addActionListener(this);
		btnn.addActionListener(this);
		btnpr.addActionListener(this);
		btnl.addActionListener(this);
		btnadd.addActionListener(this);
		btnup.addActionListener(this);
		btndel.addActionListener(this);
		btnsub.addActionListener(this);
	}
	public static void main(String[] args)
	{
		Grid obj=new Grid();
		obj.createComp();
		obj.displayComp();
		obj.reg();
	}
}