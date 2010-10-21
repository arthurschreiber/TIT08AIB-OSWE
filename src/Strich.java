import java.awt.Color;
import java.awt.Graphics;

public class Strich
{
   private int startX;
   private int startY;
   private int endX;
   private int endY;
   private Color farbe;

   public Strich(Color farbe, int startX, int startY, int endX, int endY)
   {
      this.farbe = farbe;
      this.startX = startX;
      this.startY = startY;
      this.endX = endX;
      this.endY = endY;
   }

   public void zeichne(Graphics g)
   {
      g.setColor(farbe);
      g.drawLine(startX, startY, endX, endY);
   }
}
