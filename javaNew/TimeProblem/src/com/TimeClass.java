package com;

import java.util.*;

public class TimeClass {
	public static void main(String args[]) {
		String[] str = {"6:34:55","4:12:13","7:12:15","8:24:15","8:23:12","8:23:18"};
		
		List<Integer> hourArr = new ArrayList<>();
		List<Integer> minuteArr = new ArrayList<>();
		List<Integer> secondsArr = new ArrayList<>();
		
		List<String> resultArr = new ArrayList<>();
		
		int hourOne;
		int hourTwo;
		
		String result = "";
		
		for(int i = 0 ; i < str.length ; i++) {
			
			String[] time = str[i].split(":");
			
			hourArr.add(Integer.parseInt(time[0]));
			minuteArr.add(Integer.parseInt(time[1]));
			secondsArr.add(Integer.parseInt(time[2]));
		}
		
		for(int i = 0 ; i < str.length ; i++) {
			for(int j = i + 1 ; j < str.length ; j++) {
				hourOne = hourArr.get(i);
				hourTwo = hourArr.get(j);
				
				result = String.valueOf((hourOne > hourTwo) ? (hourOne - hourTwo) : (hourTwo - hourOne));
				result = result + ":";
				result = result + String.valueOf((minuteArr.get(i) > minuteArr.get(j)) ? (minuteArr.get(i) - minuteArr.get(j)) : (minuteArr.get(j) - minuteArr.get(i)));
				result = result + ":";
				result = result + String.valueOf((secondsArr.get(i) > secondsArr.get(j)) ? (secondsArr.get(i) - secondsArr.get(j)) : (secondsArr.get(j) - secondsArr.get(i)));	
				
				resultArr.add(result);
			}
		}
		
		result = resultArr.get(0);
		
		int minHour = Integer.parseInt(resultArr.get(0).split(":")[0]);
		int minMinute = Integer.parseInt(resultArr.get(0).split(":")[1]);
		int minSecond = Integer.parseInt(resultArr.get(0).split(":")[2]);
		
		for(int i = 1 ; i < resultArr.size() ; i++) {
			int compareHour = Integer.parseInt(resultArr.get(i).split(":")[0]);
			if(minHour > compareHour) {
				result = resultArr.get(i);
				minHour = compareHour;
			}
			else if(minHour == compareHour){
				int compareMinute = Integer.parseInt(resultArr.get(i).split(":")[1]);
				
				if(minMinute > compareMinute) {
					result = resultArr.get(i);
					minMinute = compareMinute;
				}
				else if(minMinute == compareMinute) {
					int compareSecond = Integer.parseInt(resultArr.get(i).split(":")[1]);
					
					if(minSecond > compareSecond) {
						result = resultArr.get(i);
						minMinute = compareMinute;
					}
				}
			}
		}
		
		System.out.print(result);
	}
}
