import java.util.ArrayList;
import javax.swing.JPanel;

public class Zeichnung extends JPanel
{
   private ArrayList<Strich> striche = new ArrayList<Strich>();
   
   public void addiere(Strich s)
   {
      striche.add(s);
   }
   
   public void loesche()
   {
      striche.clear();
      repaint();
   }
}
