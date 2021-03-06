import java.awt.Color;
import java.awt.Graphics;

public class Strich implements Verbindung
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

   @Override
   public Verbindung newVerbindung(Color farbe, int startX, int startY, int endX, int endY)
   {
      return new Strich(farbe, startX, startY, endX, endY);
   }

   @Override
   public String toString()
   {
      return "Strich";
   }

   public void zeichne(Graphics g)
   {
      g.setColor(farbe);
      g.drawLine(startX, startY, endX, endY);
   }

   public int getStartX()
   {
      return startX;
   }

   public int getStartY()
   {
      return startY;
   }

   public int getEndX()
   {
      return endX;
   }

   public int getEndY()
   {
      return endY;
   }

   public Color getFarbe()
   {
      return farbe;
   }
}
