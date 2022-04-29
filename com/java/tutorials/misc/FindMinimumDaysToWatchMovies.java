package src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinimumDaysToWatchMovies {
	
	public static int findMinimumDays(List<Float> durations) {
		int startIndex=0;
		int lastIndex = durations.size()-1;;
		int dayToWatch=0;
		Collections.sort(durations);
		if(lastIndex == 1)
			return dayToWatch;
		while(startIndex<=lastIndex) {
			float watchDuration = 0.00f;
			for(int index=startIndex; index<=lastIndex; index++) {
				watchDuration=watchDuration+durations.get(startIndex);
				if(watchDuration>3.00f) {
					dayToWatch++;
					break;
				}if(index==lastIndex){
					dayToWatch++;
					startIndex++;
					break;
				}else
					startIndex++;
			}
		}
		return dayToWatch;
	}
	
	public static double round(double value, int roundOf){
        if(roundOf<0) throw new IllegalArgumentException();
        long factor = (long)Math.pow(roundOf, 10);
        value = value * factor;
        long temp = Math.round(value);
        return (double) temp/factor;
    }
	public static void main(String[] args) {
		List<Float> durations = new ArrayList<>();
		durations.add(1.70f);
		durations.add(2.30f);
		durations.add(1.10f);
		durations.add(1.60f);
		durations.add(2.50f);
		durations.add(2.70f);
		System.out.println(findMinimumDays(durations));

	}
}
