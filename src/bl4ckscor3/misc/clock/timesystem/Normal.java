package bl4ckscor3.misc.clock.timesystem;

import java.util.Timer;
import java.util.TimerTask;

public class Normal
{
	public static void schedule()
	{
		Timer t = new Timer();
		
		//running this every second, starting one second after calling it
		t.schedule(new TimerTask()
		{
			int h1 = 0; //first hour digit
			int h2 = 0; //second hour digit
			int m1 = 0; //first minute digit
			int m2 = 0; //second minute digit
			int s1 = 0; //first second digit
			int s2 = 0; //second second digit
			
			@Override
			public void run()
			{
				s2++; //increasing the seconds each time
				
				if(s2 == 10) //if the second second digit is ten | if we would not do this it would end up with 00:00:010 instead of 00:00:10
				{
					s2 = 0; //set it to 0
					s1++; //and increase the first second digit by one
				}
				
				if(s1 == 6) //if we would not do this it would end up with 00:00:61 instead of 00:01:00
				{
					s1 = 0;
					m2++; 
				}
				
				if(m2 == 10) //if we would not do this it would end up with 00:010:00
				{
					m2 = 0;
					m1++;
				}
				
				if(m1 == 6) //if we would not do this it would end up with 00:61:00 instead of 01:00:00
				{
					m1 = 0;
					h2++;
				}
				
				if(h2 == 10) //if we would not do this it would end up with 010:00:00 instead of 10:00:00
				{
					h2 = 0;
					h1++;
				}
				
				if(h1 == 2 && h2 == 4) //if we would not do this, it would end up with 25:00:00 instead of 00:00:00
				{
					h1 = 0;
					h2 = 0;
				}
				
				System.out.println("" + h1 + h2 + ":" + m1 + m2 + ":" + s1 + s2);
			}
		}, 1000, 1000);
	}
}
