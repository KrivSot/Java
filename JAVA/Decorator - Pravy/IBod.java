import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;



/*******************************************************************************
 * Instance interfejsu {@code ITvar} představují ...
 * The {@code ITvar} interface instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public interface IBod
{
    public int getBodX1();
    public int getBodY1();
    public int getBodX2();
    public int getBodY2();
    public void setX1aY1(int x,int y);
    public void setX2aY2(int x,int y);
}