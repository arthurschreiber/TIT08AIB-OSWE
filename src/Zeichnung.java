import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Zeichnung extends JPanel
{
   private ArrayList<Strich> striche = new ArrayList<Strich>();
   
   public void addiere(Strich s)
   {
      striche.add(s);
   }
   
   @Override
   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      for (Strich s : striche)
      {
         g.setColor(s.getFarbe());
         g.drawLine(s.getStartX(), s.getStartY(), s.getEndX(), s.getEndY());
      }
   }
   
   public void loesche()
   {
      striche.clear();
      repaint();
   }
}
