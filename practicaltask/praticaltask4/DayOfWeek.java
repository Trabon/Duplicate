package javaCore.practicaltask.praticaltask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
	    int dayOfWeek;
	    System.out.println("Input a day of week");
	    dayOfWeek = Integer.parseInt(reader.readLine());
	    
	    switch (dayOfWeek) {
	    case 1:
	    	System.out.println("��������" + " �����������" + " Monday");
	    	break;
	    case 2:
	    	System.out.println("³������" + " �������" + " Tuesday");
	    	break;
	    case 3:
	    	System.out.println("������" + " �����" + " Wednesday");
	    	break;
	    case 4:
	    	System.out.println("������" + " �������" + " Thursday");
	    	break;
	    case 5:
	    	System.out.println("�*������" + " �������" + " Friday");
	    	break;
	    case 6:
	    	System.out.println("������" + " �������" + " Saturday");
	    	break;
	    case 7:
	    	System.out.println("�����" + " �����������" + " Sunday");
	    	break;
	    default:
	    	System.out.println("You inputted wrong number!");
	    
	    }
	    
	}

}
