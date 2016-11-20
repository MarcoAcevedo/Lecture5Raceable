import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rabbit implements Raceable {
	
	private int xPos = 0;
	private int yPos = 0;
	private Color color = Color.BLACK;
	private int number;
	private int horizontalSpeed = 0;  // Car speed in pixels per second
	private int horizontalDirection;
	private Image image;

	public Rabbit(double x, double y, Color color, int hSpeed, int HDir, int number) {
		this.setPosition(x, y);
		this.setHorizontalSpeed(hSpeed);
		this.setHorizontalDirection(HDir);  // Initially moving right
		this.setNumber(number);
		this.setColor(color);
		
		File theFile = new File("/Image/BugsSmall.jpg");
		
		try{
			this.image=ImageIO.read(theFile);
		}catch (IOException e){
			System.out.println("Fatal Error: ");
			System.exit(1);
			
		}
		
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public double getXPos() {
		return xPos;
	}

	@Override
	public double getYPos() {
		return yPos;
	}

	@Override
	public int getHorizontalSpeed() {
		return  horizontalSpeed;
	}

	@Override
	public int getHorizontalDirection() {
		return horizontalDirection;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public int getHeight() {
		return 43;
	}
	
	@Override
	public int getWidth(){
		return 60;
	}

	@Override
	public void setPosition(double xPos, double yPos) {
		this.xPos=new Double(xPos).intValue();
		this.yPos=new Double(yPos).intValue();

	}

	@Override
	public void setColor(Color color) {
		this.color=color;
	}

	@Override
	public void setHorizontalSpeed(int horizontalSpeed) {
		this.horizontalSpeed=horizontalSpeed;
	}

	@Override
	public void setHorizontalDirection(int horizontalDirection) {
		this.horizontalDirection=horizontalDirection;
	}

	@Override
	public void setNumber(int number) {
		this.number=number;
	}

	@Override
	public void moveInX(double deltaX) {
		this.xPos+=deltaX;
	}

	@Override
	public void moveInY(double deltaY) {
		this.yPos+=deltaY;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 =(Graphics2D) g;
		g2.drawImage(this.image, xPos,this.yPos,null);
	}

}
