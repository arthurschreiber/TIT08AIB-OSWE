import java.awt.Color;
import java.awt.Graphics;

public class RechteckStrich extends Strich
{

   public RechteckStrich(Color farbe, int startX, int startY, int endX, int endY)
   {
      super(farbe, startX, startY, endX, endY);
   }

   @Override
   public void zeichne(Graphics g)
   {
      g.setColor(getFarbe());
      g.drawRect(getStartX(), getStartY(), 20, 20);
   }
}
