import java.awt.*;  //imports the  AWT graphic classes
import java.util.*; //import utility classes
import java.applet.*;  //
import javax.swing.*;
import javax.swing.border.Border;
import java.util.Arrays;
import java.beans.*;
import java.awt.event.*;

public class ShowShape extends Applet {
	
	private String defMessage = "  HELLO";
	private int defStyle = Font.PLAIN;
	private int defSize = 24;
	private String defShape = "RECT";
	private Color defColor = Color.black;
	private Color defBGColor = Color.pink;
	private Color defFTColor = Color.black;
	private int defX = 5;
	private int defY = 150;
	private String errMessage;
	
public void init()
{
	String tempMessage = (this.getParameter("Message"));
	String tempSize = (this.getParameter("FTSize"));
	String tempStyle = (this.getParameter("FTStyle"));
	String tempShape = (this.getParameter("Shape"));
	String tempColor = (this.getParameter("Color"));
	String tempBGColor = (this.getParameter("BGColor"));
	String tempXAxis = (this.getParameter("X"));
	String tempYAxis = (this.getParameter("Y"));
	String tempFTColor = (this.getParameter("FTColor"));
	
	
	//*INIT MESSAGE
	
	if (tempMessage!=null)
	{
	this.defMessage = tempMessage;
	}

	//*INIT BG COLOR
	
	if (tempBGColor != null && tempBGColor.equals("black")) {
		this.defBGColor = Color.black;
		setBackground(defBGColor);
	}
	
	else if (tempBGColor != null && tempBGColor.equals("blue")) {
		this.defBGColor = Color.blue;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("cyan")) {
		this.defBGColor = Color.cyan;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("darkGray")) {
		this.defBGColor = Color.darkGray;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("gray")) {
		this.defBGColor = Color.gray;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("green")) {
		this.defBGColor = Color.green;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("lightGray")) {
		this.defBGColor = Color.lightGray;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("magenta")) {
		this.defBGColor = Color.magenta;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("orange")) {
		this.defBGColor = Color.orange;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("pink")) {
		this.defBGColor = Color.pink;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("red")) {
	
		this.defBGColor = Color.red;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("white")) {
		this.defBGColor = Color.white;
		setBackground(defBGColor);
	}
	else if (tempBGColor != null && tempBGColor.equals("yellow")) {
		this.defBGColor = Color.yellow;
		setBackground(defBGColor);
	}
	else if(tempBGColor != null) {
		setBackground(defBGColor);
		errMessage = "CHECK PARAM ERRORS";
	}
	else if(tempBGColor == null) {
		setBackground(defBGColor);
	}

	
	//*INIT SHAPE OUTLINE COLOR
	if (tempColor != null && tempColor.equals("black")) {
		this.defColor = Color.black;
	}
	else if (tempColor != null && tempColor.equals("blue")) {
		this.defColor = Color.blue;
	}
	else if (tempColor != null && tempColor.equals("cyan")) {
		this.defColor = Color.cyan;
	}
	else if (tempColor != null && tempColor.equals("darkGray")) {
		this.defColor = Color.darkGray;
	}
	else if (tempColor != null && tempColor.equals("gray")) {
		this.defColor = Color.gray;
	}
	else if (tempColor != null && tempColor.equals("green")) {
		this.defColor = Color.green;
	}
	else if (tempColor != null && tempColor.equals("lightGray")) {
		this.defColor = Color.lightGray;
	}
	else if (tempColor != null && tempColor.equals("magenta")) {
		this.defColor = Color.magenta;
	}
	else if (tempColor != null && tempColor.equals("orange")) {
		this.defColor = Color.orange;
	}
	else if (tempColor != null && tempColor.equals("pink")) {
		this.defColor = Color.pink;
	}
	else if (tempColor != null && tempColor.equals("red")) {
	
		this.defColor = Color.red;
	}
	else if (tempColor != null && tempColor.equals("white")) {
		this.defColor = Color.white;
	}
	else if (tempColor != null && tempColor.equals("yellow")) {
		this.defColor = Color.yellow;
	}
		else if (tempColor != null ) {
		errMessage="ERROR! CHECK PARAMS";
	}

	//*INIT SHAPE
	
	if (tempShape!=null && tempShape.equals("RECT")){
		this.defShape = "RECT";
	}
	else if (tempShape!=null && tempShape.equals("OVAL")){
		this.defShape = "OVAL";
	}
	else if (tempShape!=null && tempShape.equals("ROUNDRECT")){
		this.defShape = "ROUNDRECT";
	}
	else if(tempShape != null){
		this.defShape = "RECT";
		errMessage="ERROR! CHECK PARAMS";
	}
	
	
	//*INIT X 
	
	{
		this.defX = (new Integer(tempXAxis).intValue());
	}
	
	if (tempXAxis !=null && defX > 150) {
		this.defX = 5;
		errMessage="ERROR! CHECK PARAMS";
	}

	if (tempXAxis != null && defX < 0) {
		this.defX  = 5;
		errMessage="ERROR! CHECK PARAMS";
	}
		
	
	//*INIT Y
	{
		this.defY = (new Integer(tempYAxis).intValue());
	}
	
	if (tempYAxis !=null && defY > 150) {
		this.defY = 150;
		errMessage="ERROR! CHECK PARAMS";
	}

	if (tempXAxis != null && defY < 0) {
		this.defY = 150;
		errMessage="ERROR! CHECK PARAMS";
		}
		
		
	//*INIT FONT SIZE

	{
		this.defSize = (new Integer(tempSize)).intValue();
	}
	
	
	if (tempSize !=null && defSize > 33)
	{
		this.defSize = 24;
		errMessage="ERROR! CHECK PARAMS";
	}

	if (tempSize !=null && defSize <= 0)
	{
		this.defSize = 24;
		errMessage="ERROR! CHECK PARAMS";
	}
		
	//*INIT FONT STYLE
	
	
	if (tempStyle != null && tempStyle.equals("REGULAR")) {
		this.defStyle = Font.PLAIN;
	}
	else if (tempStyle != null && tempStyle.equals("BOLD")) { 
		this.defStyle = Font.BOLD;
	}
	else if (tempStyle!= null && tempStyle.equals("ITALIC")) {
		this.defStyle = Font.ITALIC;
	}
	else if (tempStyle != null && tempStyle.equals("BOLD")) {
		this.defStyle = Font.BOLD + Font.ITALIC;
	}
	else if(tempStyle != null) {
			this.defStyle = Font.PLAIN;
			errMessage="ERROR! CHECK PARAMS";
	}
	
	
	
	
	///INIT FONT COLOR
	if (tempFTColor != null && tempFTColor.equals("black")) {
		this.defFTColor = Color.black;
	}
	else if (tempFTColor != null && tempFTColor.equals("blue")) {
		this.defFTColor = Color.blue;
	}
	else if (tempFTColor != null && tempFTColor.equals("cyan")) {
		this.defFTColor = Color.cyan;
	}
	else if (tempFTColor != null && tempFTColor.equals("darkGray")) {
		this.defFTColor = Color.darkGray;
	}
	else if (tempFTColor != null && tempFTColor.equals("gray")) {
		this.defFTColor = Color.gray;
	}
	else if (tempFTColor != null && tempFTColor.equals("green")) {
		this.defFTColor = Color.green;
	}
	else if (tempFTColor != null && tempFTColor.equals("lightGray")) {
		this.defFTColor = Color.lightGray;
	}
	else if (tempFTColor != null && tempColor.equals("magenta")) {
		this.defFTColor = Color.magenta;
	}
	else if (tempFTColor != null && tempFTColor.equals("orange")) {
		this.defFTColor = Color.orange;
	}
	else if (tempFTColor != null && tempFTColor.equals("pink")) {
		this.defFTColor = Color.pink;
	}
	else if (tempFTColor != null && tempFTColor.equals("red")) {
	
		this.defFTColor = Color.red;
	}
	else if (tempFTColor != null && tempFTColor.equals("white")) {
		this.defFTColor = Color.white;
	}
	else if (tempFTColor != null && tempFTColor.equals("yellow")) {
		this.defFTColor = Color.yellow;
	}
	else if (tempFTColor != null ) {
		this.defFTColor = Color.black;
		errMessage="ERROR! CHECK PARAMS";
	}
	
	
	
	}
	

	
	//*DRAW THINGS
	public void paint(Graphics g)
	{
	
    //*DRAW SHAPE
	if (defShape == "RECT") {
	g.setColor(defColor);
	g.drawRect(defX, defY, 140, 80); 
	}
	else if (defShape == "OVAL") {
	g.setColor(defColor);
	g.drawOval(defX, defY, 140, 80);
	}
	else if (defShape == "ROUNDRECT") {
	g.setColor(defColor);
	g.drawRoundRect(defX, defY, 140, 80, 30, 30);
	}

	
	
	//*DRAW MAIN MESSAGE
	
	g.setFont(new Font("CenturyGothic", defStyle, defSize));
	g.setColor(defFTColor); //need to set as param
	g.drawString(defMessage, 20, 150); //works)
	
	//*DRAW ERROR MESSAGE
	if (errMessage != null) {
		g.setFont(new Font("TimesRoman", defStyle, 10));
		g.setColor(Color.black);
		g.drawString(errMessage, 1, 295);
	}
	
}
}





