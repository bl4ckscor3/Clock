package bl4ckscor3.misc.clock.timesystem;

import java.util.Timer;
import java.util.TimerTask;

public class AmPm
{
	public static void schedule()
	{
		Timer t = new Timer();
		
		t.schedule(new TimerTask()
		{
			int h1 = 1;
			int h2 = 2;
			int m1 = 5;
			int m2 = 9;
			int s1 = 5;
			int s2 = 8;
			boolean am = true;
			
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
				
				if(h1 == 1 && h2 == 2 && m1 == 0 && m2 == 0 && m1 == 0 && s1 == 0 && s2 == 0) //used to append the correct letters to the time
					am = !am;

				if(h1 == 1 && h2 == 3) //there is no 13:00:00 in am/pm
				{
					h2 = 1;
					h1 = 0;
				}
				
				System.out.println("" + h1 + h2 + ":" + m1 + m2 + ":" + s1 + s2 + " " + amPm(am));
			}
		}, 1000, 1000);
	}
	
	private static String amPm(boolean am)
	{
		return am ? "AM" : "PM";
	}
}
