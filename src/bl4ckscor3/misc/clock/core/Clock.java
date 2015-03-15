package bl4ckscor3.misc.clock.core;

import java.util.Timer;
import java.util.TimerTask;

public class Clock
{
	public static void main(String[] args)
	{
		Timer t = new Timer();
		
		t.schedule(new TimerTask()
		{
			int h1 = 0;
			int h2 = 0;
			int m1 = 0;
			int m2 = 0;
			int s1 = 0;
			int s2 = 0;
			
			@Override
			public void run()
			{
				s2++;
				
				if(s2 == 10)
				{
					s2 = 0;
					s1++;
				}
				
				if(s1 == 6)
				{
					s1 = 0;
					m2++;
				}
				
				if(m2 == 10)
				{
					m2 = 0;
					m1++;
				}
				
				if(m1 == 6)
				{
					m1 = 0;
					h2++;
				}
				
				if(h2 == 10)
				{
					h2 = 0;
					h1++;
				}
				
				if(h1 == 2 && h2 == 4)
				{
					h1 = 0;
					h2 = 0;
				}
				
				System.out.println("" + h1 + h2 + ":" + m1 + m2 + ":" + s1 + s2);
			}
		}, 0, 1000);
	}
}
