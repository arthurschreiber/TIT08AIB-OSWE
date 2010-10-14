import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Malen implements ActionListener, ItemListener, MouseMotionListener
{
   private Container behaelter;

   public void setBehaelter(Container behaelter)
   {
      this.behaelter = behaelter;
   }

   private int altesX = 0;
   private int altesY = 0;
   private Color aktuelleFarbe = Color.black;
   private JButton loeschKnopf;
   private JComboBox farbWahl;
   private JButton endeKnopf;

   private static final String schwarz = "Schwarz";
   private static final String rot = "Rot";
   private static final String gelb = "Gelb";
   private static final String gruen = "Grün";
   private static final String blau = "Blau";
   private static final String cyan = "Cyan";
   private static final String magenta = "Magenta";

   public void init()
   {
      behaelter.setLayout(new FlowLayout());
      behaelter.setBackground(Color.gray);

      loeschKnopf = new JButton("Löschen");
      loeschKnopf.addActionListener(this);
      loeschKnopf.setForeground(Color.black);
      loeschKnopf.setBackground(Color.lightGray);
      behaelter.add(loeschKnopf);

      farbWahl = new JComboBox();
      farbWahl.addItemListener(this);
      farbWahl.addItem(schwarz);
      farbWahl.addItem(rot);
      farbWahl.addItem(gelb);
      farbWahl.addItem(gruen);
      farbWahl.addItem(blau);
      farbWahl.setForeground(Color.black);
      farbWahl.setBackground(Color.lightGray);
      behaelter.add(new JLabel("Farbe: "));
      behaelter.add(farbWahl);

      endeKnopf = new JButton("Ende");
      endeKnopf.addActionListener(this);
      endeKnopf.setForeground(Color.black);
      endeKnopf.setBackground(Color.lightGray);
      behaelter.add(endeKnopf);

      behaelter.addMouseMotionListener(this);
   }

   public void actionPerformed(ActionEvent ereignis)
   {
      Object ereignisQuelle = ereignis.getSource();
      if (ereignisQuelle == loeschKnopf)
      {
         behaelter.repaint();
      }
      else if (ereignisQuelle == endeKnopf)
      {
         System.exit(0);
      }
   }

   public void itemStateChanged(ItemEvent e)
   {
      if (e.getItem() == schwarz)
         aktuelleFarbe = Color.black;
      else if (e.getItem() == rot)
         aktuelleFarbe = Color.red;
      else if (e.getItem() == gelb)
         aktuelleFarbe = Color.yellow;
      else if (e.getItem() == gruen)
         aktuelleFarbe = Color.green;
      else if (e.getItem() == blau)
         aktuelleFarbe = Color.blue;
      else if (e.getItem() == cyan)
         aktuelleFarbe = Color.cyan;
      else if (e.getItem() == magenta)
         aktuelleFarbe = Color.magenta;
   }

   public void mouseDragged(MouseEvent e)
   {
      Graphics g = behaelter.getGraphics();
      g.setColor(aktuelleFarbe);
      g.drawLine(altesX, altesY, e.getX(), e.getY());
      altesX = e.getX();
      altesY = e.getY();
   }

   public void mouseMoved(MouseEvent e)
   {
      altesX = e.getX();
      altesY = e.getY();
   }

   public void addiere(JComponent komponente)
   {
      behaelter.add(komponente);
   }

   public static void main(String[] argument)
   {

      JFrame f = new JFrame("Malen");

      Malen m = new Malen();
      m.setBehaelter(f.getContentPane());
      m.init();

      f.pack(); // Trick: Erzeugt Peer-Frame
      f.setSize(600, 400);
      f.setVisible(true);
   }

}
