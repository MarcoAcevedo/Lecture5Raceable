import java.awt.Color;
import java.awt.Graphics;

public interface Raceable {

	public Color getColor();
	public double getXPos();
	public double getYPos();
	public int getHorizontalSpeed();
	public int getHorizontalDirection();
	public int getNumber();
	public int getHeight();
	public int getWidth();
	public void setPosition(double xPos, double yPos);
	public void setColor(Color color);
	public void setHorizontalSpeed(int horizontalSpeed);
	public void setHorizontalDirection(int horizontalDirection);
	public void setNumber(int number);
	public void moveInX(double deltaX);
	public void moveInY(double deltaY);
	public  void draw(Graphics g);
}
