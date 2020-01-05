package test;
import java.util.*;
public class AlarmQue14 {
	
	static String ringAlarm(int num, boolean vacation) {
		if(num<0 && num>6)
			return "Invalid Inputs";
		else {
			if((num>=1 && num<=5)) {
				if(vacation)
					return "10:00";
				else
					return "7:00";
			}
			else if(num==0 || num==6) {   //if(num>=0 && num<=6) 
				if(vacation)
					return "OFF";
				else
					return "10:00";
			}
			else
				return "Invalid Inputs";
		}
		//return "";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value between 0-6: ");
		int num=sc.nextInt();
		System.out.print("Enter true or false value : ");
		boolean vacation=sc.nextBoolean();
		System.out.println(ringAlarm(num,vacation));
	}
}
