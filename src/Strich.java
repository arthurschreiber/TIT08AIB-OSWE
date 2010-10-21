import java.awt.Color;

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

   public Color getFarbe()
   {
      return farbe;
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
}
