import java.awt.Color;
import java.awt.Graphics;


public class DoppelStrich extends Strich
{
   public DoppelStrich(Color farbe, int startX, int startY, int endX, int endY)
   {
      super(farbe, startX, startY, endX, endY);
   }
   
   @Override
   public void zeichne(Graphics g)
   {
      // TODO Auto-generated method stub
      super.zeichne(g);
      g.drawLine(getStartX()+3, getStartY()+3, getEndX()+3, getEndY()+3);
   }
}
