
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class imgAscci {
	 public static void main(String[] args) {
     int width = 150;
     int heigth= 30;
      //Metodo que muestra en pantalla img ascii
     BufferedImage imagen = new BufferedImage(width,heigth, BufferedImage.TYPE_INT_RGB);
     Graphics grafico =imagen.getGraphics();
     grafico.setFont(new Font("SansSerif", Font.BOLD,24));
     
     Graphics2D grafico2 = (Graphics2D) grafico;
     grafico2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
     grafico2.drawString("Laura",10,20);
     	
     for (int y=0; y<heigth; y++){
     StringBuilder builder = new StringBuilder();
     
     for (int x=0; x<width; x++){
     builder.append(imagen.getRGB(x,y) == -16777216 ? " ": "@");
   
        
     }
     System.out.println(builder);
     }
}
}       
        
