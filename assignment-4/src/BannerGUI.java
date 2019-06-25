import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;



public class BannerGUI extends JFrame {

	private JFrame frmCreateABanner;

	private Color fontColor;
	private Color bgColor;
	private int fontStyle = Font.PLAIN;
	private int fontSize = 12;
	private ButtonGroup radioGroup;

	private String shape = "rect";
	private int height;
	private int width;

////////////MAIN - LAUNCHES APP////////////
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BannerGUI window = new BannerGUI();
					window.frmCreateABanner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//end main
	

////////CREATES APP USING INITALIZE/////	
	public BannerGUI() {
		initialize();
	}	

////////INITIALIZE CONTENTS///////////

		public void initialize() {
			
			//main frame
			frmCreateABanner = new JFrame();
			frmCreateABanner.setTitle("Create a Banner");
			frmCreateABanner.setBounds(100, 100, 780, 508);
			frmCreateABanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmCreateABanner.getContentPane().setLayout(null);

////////////BACKGROUND//////////////
			
			//background title
			JLabel lblBackground = new JLabel(" BACKGROUND");
			lblBackground.setFont(new Font("Arial", Font.BOLD, 28));
			lblBackground.setBounds(78, 0, 209, 38);
			frmCreateABanner.getContentPane().add(lblBackground);
			
			//background area jpanel
			JPanel backGround = new JPanel();
			backGround.setBounds(425, 57, 310, 380);
			frmCreateABanner.getContentPane().add(backGround);
			backGround.setLayout(null);
			
			//bg color label
			JLabel lblColorBG = new JLabel("color:");
			lblColorBG.setFont(new Font("Arial", Font.PLAIN, 20));
			lblColorBG.setBounds(78, 51, 53, 14);
			frmCreateABanner.getContentPane().add(lblColorBG);
			
			
			//choose color button
			JButton btnChooseBG = new JButton("choose");
			btnChooseBG.setFont(new Font("Arial", Font.PLAIN, 14));
			btnChooseBG.setBounds(135, 49, 89, 23);
			frmCreateABanner.getContentPane().add(btnChooseBG);
			
			//btnChooseBG action listener
			btnChooseBG.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bgColor = JColorChooser.showDialog(backGround, "choose a color", Color.black);
						backGround.setBackground(bgColor);
				
				}
			});
			
////////////SEPERATE SECTIONS//////////


			JSeparator separator1 = new JSeparator();
			separator1.setBounds(14, 100, 370, 24);
			frmCreateABanner.getContentPane().add(separator1);
			
			
/////////////VIEWER MESSAGE//////////////////////
			
			JLabel msg = new JLabel();
			msg.setBounds(24, 134, 265, 111);
			backGround.add(msg);
			msg.setOpaque(false);
			msg.setMaximumSize(new Dimension(6, 20));
			msg.setHorizontalAlignment(SwingConstants.CENTER);
			msg.setForeground(fontColor);
			msg.setFont(new Font("Arial", Font.PLAIN, 12));
			msg.setText("view text here");	
	
			
///////////FONT SELECTIONS//////////
			
			//font title
			JLabel lblFont = new JLabel("FONT");
			lblFont.setFont(new Font("Arial", Font.BOLD, 28));
			lblFont.setBounds(153, 100, 84, 37);
			frmCreateABanner.getContentPane().add(lblFont);
			
			//font style label
			JLabel lblStyle = new JLabel("style:");
			lblStyle.setFont(new Font("Arial", Font.PLAIN, 20));
			lblStyle.setBounds(78, 135, 47, 24);
			frmCreateABanner.getContentPane().add(lblStyle);
			
			//plain radio button
			JRadioButton rdbtnPLAIN = new JRadioButton("plain");
			rdbtnPLAIN.setFont(new Font("Arial", Font.PLAIN, 12));
			rdbtnPLAIN.setBounds(137, 137, 53, 23);
			frmCreateABanner.getContentPane().add(rdbtnPLAIN);
			rdbtnPLAIN.setSelected(true);
			
			//rdbtnPLAIN action listener
			rdbtnPLAIN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnPLAIN)
						fontStyle = Font.PLAIN;
						msg.setFont(new Font("Arial", Font.PLAIN, fontSize));
				}
			});
			
			//bold radio button
			JRadioButton rdbtnBOLD = new JRadioButton("bold");
			rdbtnBOLD.setFont(new Font("Arial", Font.BOLD, 12));
			rdbtnBOLD.setBounds(192, 137, 53, 23);
			frmCreateABanner.getContentPane().add(rdbtnBOLD);
	
			//rdbtnBOLD action listener
			rdbtnBOLD.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnBOLD)
						fontStyle = Font.BOLD;
					msg.setFont(new Font("Arial", Font.BOLD, fontSize));
				}
			});
			
			//italic radio button
			JRadioButton rdbtnITALIC = new JRadioButton("italic");	
			rdbtnITALIC.setFont(new Font("Arial", Font.ITALIC, 12));
			rdbtnITALIC.setBounds(245, 137, 53, 23);
			frmCreateABanner.getContentPane().add(rdbtnITALIC);
			
			//radiobtnITALIC action listener
			rdbtnITALIC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnITALIC)
						fontStyle = Font.ITALIC;
					msg.setFont(new Font("Arial", Font.ITALIC, fontSize));
				}
			});
			
			//bold italic radio button
			JRadioButton rdbtnBOLDITAL = new JRadioButton("bold italic");
			rdbtnBOLDITAL.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
			rdbtnBOLDITAL.setBounds(300, 137, 84, 23);
			frmCreateABanner.getContentPane().add(rdbtnBOLDITAL);
			
			//rdbtnBOLDITAL action listener
			rdbtnBOLDITAL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnBOLDITAL)
						fontStyle = Font.BOLD | Font.ITALIC;
					msg.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, fontSize));
				}
			});

			//group so only 1 can be selected
			radioGroup = new ButtonGroup();
			radioGroup.add(rdbtnPLAIN);
			radioGroup.add(rdbtnBOLD);
			radioGroup.add(rdbtnITALIC);
			radioGroup.add(rdbtnBOLDITAL);
			
			
///////////////CHOOSE FONT SIZE///////////////			

			//font size title
			JLabel lblSize = new JLabel("size:");
			lblSize.setFont(new Font("Arial", Font.PLAIN, 20));
			lblSize.setBounds(86, 209, 40, 21);
			frmCreateABanner.getContentPane().add(lblSize);
		
			
			//combo box containing font sizes
			JComboBox comboBox = new JComboBox();
			comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
			comboBox.setModel(new DefaultComboBoxModel(new Integer[] {8, 12, 16, 20, 24, 28}));
			comboBox.setSelectedIndex(1);
			comboBox.setBounds(135, 207, 89, 23);
			frmCreateABanner.getContentPane().add(comboBox);

			//comboBox action listener
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == comboBox) {
						fontSize = (int) comboBox.getSelectedItem();
						msg.setFont(new Font("Arial", fontStyle, fontSize));
					}
		
				}
			});
/////////////////CHOOSE FONT COLOR////////////////		
			
			//font color title
			JLabel lblColor = new JLabel("color:");
			lblColor.setFont(new Font("Arial", Font.PLAIN, 20));
			lblColor.setBounds(78, 164, 54, 37);
			frmCreateABanner.getContentPane().add(lblColor);
			
			//choose color button
			JButton btnChoose = new JButton("choose");
			btnChoose.setFont(new Font("Arial", Font.PLAIN, 14));
			btnChoose.setBounds(135, 173, 89, 23);
			frmCreateABanner.getContentPane().add(btnChoose);
			
			//btnChoose action listener
			btnChoose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fontColor = JColorChooser.showDialog(msg, "choose a color", Color.black);
						msg.setForeground(fontColor);
				
				}
			});
			
//////////////////CHANGE MESSAGE///////////////
			
			//message title
			JLabel lblNewLabel = new JLabel("message:");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
			lblNewLabel.setBounds(41, 241, 99, 24);
			frmCreateABanner.getContentPane().add(lblNewLabel);
			
			//textfield
			JTextField entered = new JTextField();
			entered.setText("enter message here");
			entered.setBounds(135, 244, 243, 24);
			frmCreateABanner.getContentPane().add(entered);
			entered.setColumns(10);
			
			//view button
			JButton btnNewButton = new JButton("view");
			btnNewButton.setBounds(313, 279, 67, 23);
			frmCreateABanner.getContentPane().add(btnNewButton);
			
			//btnNewButton action listener
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					msg.setText(entered.getText());
				}
			});
			
///////////////SEPERATE SECTIONS//////////////////

			JSeparator separator2 = new JSeparator();
			separator2.setBounds(14, 318, 370, 8);
			frmCreateABanner.getContentPane().add(separator2);

/////////////CHOOSE SHAPE//////////////////////////
			
			//shape title
			JLabel lblShape = new JLabel("SHAPE");
			lblShape.setFont(new Font("Arial", Font.BOLD, 28));
			lblShape.setBounds(145, 325, 120, 33);
			frmCreateABanner.getContentPane().add(lblShape);
			
			//color label
			JLabel lblType = new JLabel("type:");
			lblType.setFont(new Font("Arial", Font.PLAIN, 20));
			lblType.setBounds(85, 354, 67, 33);
			frmCreateABanner.getContentPane().add(lblType);
			
			//rectangle radio button
			JRadioButton rdbtnRectangle = new JRadioButton("rectangle");	
			rdbtnRectangle.setSelected(true);
			rdbtnRectangle.setFont(new Font("Arial", Font.PLAIN, 12));
			rdbtnRectangle.setBounds(134, 361, 77, 23);
			frmCreateABanner.getContentPane().add(rdbtnRectangle);
			
			//rdbtnRectangle action listener
			rdbtnRectangle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnRectangle)
						shape = "rect";	
				}
			});
			
			
			//oval radio button
			JRadioButton rdbtnOval = new JRadioButton("oval");	
			rdbtnOval.setSelected(true);
			rdbtnOval.setFont(new Font("Arial", Font.PLAIN, 12));
			rdbtnOval.setBounds(213, 361, 54, 23);
			frmCreateABanner.getContentPane().add(rdbtnOval);
			
			//rdbtnOval action listener
			rdbtnOval.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnOval)
						shape = "oval";	
				}
			});
			
			//roundRect radio button
			JRadioButton rdbtnroundRect = new JRadioButton("round rectangle");	
			rdbtnroundRect.setSelected(true);
			rdbtnroundRect.setFont(new Font("Arial", Font.PLAIN, 12));
			rdbtnroundRect.setBounds(269, 361, 111, 23);
			frmCreateABanner.getContentPane().add(rdbtnroundRect);
			
			//rdbtnroundRect action listener
			rdbtnroundRect.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == rdbtnroundRect)
						shape = "roundRect";	
				}
			});


			//group shape radio buttons
			radioGroup = new ButtonGroup();
			radioGroup.add(rdbtnRectangle);
			radioGroup.add(rdbtnOval);
			radioGroup.add(rdbtnroundRect);
			
/////////////////////////SHAPE SIZE//////////////////////////	
			
			//width label
			JLabel lblWidth = new JLabel("width:");
			lblWidth.setFont(new Font("Arial", Font.PLAIN, 20));
			lblWidth.setBounds(78, 398, 62, 14);
			frmCreateABanner.getContentPane().add(lblWidth);
		
			//width combobox options
			JComboBox comboBoxW = new JComboBox();
			comboBoxW.setModel(new DefaultComboBoxModel(new Integer[] {250, 260, 270, 280, 290, 300, 310}));
			comboBoxW.setSelectedIndex(1);
			comboBoxW.setFont(new Font("Arial", Font.PLAIN, 14));
			comboBoxW.setBounds(135, 391, 89, 23);
			frmCreateABanner.getContentPane().add(comboBoxW);
			//comboBoxW action listener
			comboBoxW.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == comboBoxW) {
						width = (int) comboBoxW.getSelectedItem();
					}
					}
			});

			//height label
			JLabel lblHeight = new JLabel("height:");
			lblHeight.setFont(new Font("Arial", Font.PLAIN, 20));
			lblHeight.setBounds(73, 427, 67, 24);
			frmCreateABanner.getContentPane().add(lblHeight);
			
			//height combobox options
			JComboBox comboBoxH = new JComboBox();
			comboBoxH.setModel(new DefaultComboBoxModel(new Integer[] {290, 300, 310, 320, 330, 340, 350, 360, 370, 380}));
			comboBoxH.setSelectedIndex(1);
			comboBoxH.setFont(new Font("Arial", Font.PLAIN, 14));
			comboBoxH.setBounds(135, 430, 89, 23);
			frmCreateABanner.getContentPane().add(comboBoxH);
			
			JSeparator separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(394, 0, 26, 469);
			frmCreateABanner.getContentPane().add(separator);
			
//////////////////////PREVIEW BOX TITLE////////////////////////////
			
			
			JLabel lblPreview = new JLabel("PREVIEW BANNER");
			lblPreview.setFont(new Font("Arial", Font.BOLD, 28));
			lblPreview.setBounds(454, 20, 281, 23);
			frmCreateABanner.getContentPane().add(lblPreview);
		
			
			//height combobox options
			comboBoxH.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == comboBoxH) {
						height = (int) comboBoxH.getSelectedItem();
					}
				}
			});

			


		} //end public void initialize()		
	
		//draw shape
		public void paint(Graphics g)
		{
			if (shape == "rect")
				g.drawRect( 400, 300, width, height);
			
			if (shape == "oval")
				g.drawOval( 400, 300, width, height);
			
			if (shape == "roundrect")
				g.drawRoundRect(400, 300, width, height, 50, 30);



		}
} //end class BannerGUI