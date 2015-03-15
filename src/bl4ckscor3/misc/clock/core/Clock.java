package bl4ckscor3.misc.clock.core;

import java.util.Scanner;

import bl4ckscor3.misc.clock.timesystem.AmPm;
import bl4ckscor3.misc.clock.timesystem.Normal;

public class Clock
{
	//TODO: Timezones
	//TODO: setting the time & getting the current pc time
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		boolean amPm = false;
		
		System.out.println("Do you want to use the 12h or 24h system? Type in the corresponding number:");
		System.out.println("1. 12h");
		System.out.println("2. 24h");
		amPm = s.nextInt() == 1;
		s.close();
		
		if(amPm)
			AmPm.schedule();
		else
			Normal.schedule();
	}
}
