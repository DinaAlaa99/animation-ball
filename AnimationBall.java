import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

/** Create ab applet that displays ball which moves randomly on the applet*/

public class AnimationBall extends Applet implements Runnable{
	
	Thread th;
	  int x;
	  int y;
	  int r=25;
	  int xStep=30;
	  int yStep=-30; 
	public void init(){
		  x=0;
		  y=300;
		th =new Thread(this);
		th.start();
	}
	
	public void paint (Graphics g){
	        g.setColor(Color.red);
			g.drawOval(x,y,r*2,r*2);
			g.fillOval(x,y,r*2,r*2);
  
		
	}
	public void run(){
	    
	
		while (true){
			
			
			      if (x+xStep <0 || x+2*r+xStep>getWidth())
				       xStep*=-1;
				  if (y+yStep<0 || y+2*r+yStep>getHeight())
				       yStep*=-1;
				  x+=xStep;
				  y+=yStep;
			
  
					
			try{
                   th.sleep(500);  
             }
            catch(InterruptedException e)
			
			{
			e.printStackTrace();
			 }
			
		this.repaint();	
			
		}
		
		
		
}	
	
}