import java.awt.Color;
import java.awt.Graphics;

public interface Verbindung
{
   void zeichne(Graphics g);
   Verbindung newVerbindung(Color farbe, int startX, int startY, int endX, int endY);
   String toString();
}
