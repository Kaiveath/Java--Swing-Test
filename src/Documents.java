import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;




public class Documents extends JFrame 
{
	
	private JPanel contentPane;
	public static JPanel panel;

public static void main(String[] args) 
{
	EventQueue.invokeLater(new Runnable()
	{
		public void run() 
		{
			try 
			{
				Documents frame = new Documents();
				createPdf("xxxxx");
				frame.setVisible(true);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	});
	
}
public Documents() 
{
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(50, 10, 1400, 900);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.RED);
	panel.setBounds(23, 13, 576, 820);
	contentPane.add(panel);
	panel.setLayout(null);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(Color.YELLOW);
	panel_1.setBounds(12, 13, 471, 364);
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	JLabel lblWwwppl = new JLabel("ww@wp.pl");
	lblWwwppl.setBounds(77, 89, 247, 70);
	panel_1.add(lblWwwppl);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBackground(Color.YELLOW);
	panel_2.setBounds(137, 314, 414, 493);
	panel.add(panel_2);
	
	JPanel panel_3 = new JPanel();
	panel_3.setLayout(null);
	panel_3.setBackground(Color.BLUE);
	panel_3.setBounds(682, 13, 576, 820);
	contentPane.add(panel_3);
	
	JPanel panel_4 = new JPanel();
	panel_4.setLayout(null);
	panel_4.setBackground(Color.YELLOW);
	panel_4.setBounds(12, 13, 471, 364);
	panel_3.add(panel_4);
	
	JLabel label = new JLabel("ww@wp.pl");
	label.setBounds(77, 89, 247, 70);
	panel_4.add(label);
	
	JPanel panel_5 = new JPanel();
	panel_5.setBackground(Color.YELLOW);
	panel_5.setBounds(137, 314, 414, 493);
	panel_3.add(panel_5);
	
	//Document document = new Document(PageSize.A4, 50, 50, 50, 50);
	
    Rectangle one = new Rectangle(210,150);

	Document document = new Document(one, 2, 2, 2, 2);

	
	//PDF PRINTER
	
	try {
	    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:\\projektyEclipse\\NiceLbL\\PDF_1.pdf"));
	    document.open();
	    PdfContentByte contentByte = writer.getDirectContent();
	    
        PdfTemplate template= contentByte.createTemplate(100, 100);
        Graphics2D g2= template.createGraphics(100, 100);
//        PdfTemplate template= contentByte.createTemplate(750, 820);
//        Graphics2D g2= template.createGraphics(750, 820);   
        
        
        Paragraph p = new Paragraph("STR 1");
        Paragraph p2 = new Paragraph("STR 2");
	    
	    document.setPageSize(one);												// strona 1
	    document.setMargins(2, 2, 2, 2);
	    document.add(p);
	    
	    
	    
	    panel_3.print(g2);
	    g2.dispose();
		contentByte.addTemplate(template, 10, 10);

	    PdfContentByte contentByte2 = writer.getDirectContent();
       PdfTemplate template2= contentByte2.createTemplate(200, 200);
        Graphics2D g3= template.createGraphics(200, 200);
        
        
        

        
	    document.setPageSize(one);
	    document.setMargins(2, 2, 2, 2);
	   
	 
	    document.newPage();

	    panel.print(g3);
        
	    g3.dispose();
		contentByte2.addTemplate(template2, 5, 5);







	    document.add(p2);


	    
	    
//	    PdfTemplate template = contentByte.createTemplate(750, 820);
//	    Graphics2D g2 = template.createGraphics(750, 820);
//	    panel.print(g2);
//	 	panel_3.print(g2);


	    document.close();

		} 
	catch (Exception e) 
		{
	    e.printStackTrace();
		}
	finally
		{
	    if(document.isOpen())
	    {
	        document.close();
	    }
		}
}

public static void createPdf(String dest) throws IOException, DocumentException 
{
	
    Document document = new Document();
    
    PdfWriter.getInstance(document, new FileOutputStream("E:\\projektyEclipse\\NiceLbL\\PDF_2.pdf"));

    Rectangle one = new Rectangle(210,150);
    document.setPageSize(one);
    document.setMargins(2, 2, 2, 2);
    document.open();
    Paragraph p = new Paragraph("Hiiiiiiiiiiii");
    document.add(p);
    
    
    
    int addPage = 1;
    while (addPage < 3) 
    {
    	Paragraph p2 = new Paragraph("This is Page nr: " + (addPage+1));
        addPage++;
        document.setPageSize(one);
        document.setMargins(2, 2, 2, 2);
        document.newPage();
        document.add(p2);
    }
    document.close();

}	

}
