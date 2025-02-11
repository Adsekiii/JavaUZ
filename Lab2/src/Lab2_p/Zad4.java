package Lab2_p;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {
		
	  ArrayList<Float> arr = new ArrayList<Float>();
	  float currValue = 0f;
	  
	  Scanner scanner = new Scanner(System.in);
	  currValue = scanner.nextFloat();
	  
	  while(currValue != 0) {
		  arr.add(currValue);
		  currValue=scanner.nextFloat();
	  }
	  
	  float max = arr.get(0);
	  float min = arr.get(0);;
	  float srednia = 0f;
	  
	  for(int i = 0; i < arr.size(); i++) {
	      if(arr.get(i) >= max) {
	    	  max = arr.get(i);
	      }else if(arr.get(i)<= min) {
	    	  min = arr.get(i);
	      }
	      srednia += arr.get(i);
	  }
	  srednia = srednia/arr.size();
	  System.out.println("srednia "+ srednia);
	  System.out.println("max "+ max);
	  System.out.println("min "+ min);
	  scanner.close();
  }
}
