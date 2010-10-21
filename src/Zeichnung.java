import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Zeichnung extends JPanel
{
   private ArrayList<Verbindung> verbindungen = new ArrayList<Verbindung>();
   
   public void addiere(Verbindung v)
   {
      verbindungen.add(v);
   }
   
   @Override
   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      for (Verbindung v : verbindungen)
      {
         v.zeichne(g);
      }
   }
   
   public void loesche()
   {
      verbindungen.clear();
      repaint();
   }
}
