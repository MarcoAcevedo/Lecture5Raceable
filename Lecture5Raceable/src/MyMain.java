import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyMain
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		final int NUMBER_OF_RACERS =10;
		
		Raceable[] theRaceables = new Raceable[10];
		int nextYPos = 0;
		for (int i=0; i < theRaceables.length; i++) {
			
			if (i==0) {
				theRaceables[i] = new PoliceCar(0, 0, Color.BLUE, 10, 1, i); 
			}
			else 
				if(i==NUMBER_OF_RACERS-2 || i==NUMBER_OF_RACERS-1){
					
				}
				else{
				
					if (i % 2 == 0) {
					theRaceables[i] = new Truck(0, 0, Color.BLUE, 10, 1, i); 
				}
					else {
					theRaceables[i] = new MutableCar(0, 0, Color.BLUE, 10, 1, i); 
				}
				}
			}
		
		CarStage theComponent = new CarStage(FRAME_HEIGHT, theRaceables);
		
		frame.add(theComponent);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("CIIC 4010 / ICOM 4015 Developers");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


		
		while(!theComponent.someCarWon()) {
			frame.repaint();
			Thread.sleep(100);
		}
		
		JOptionPane.showMessageDialog(null, "END OF RACE");
		
		System.exit(0);
		
	}
}
