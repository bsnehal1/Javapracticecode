package Hashmapapackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapconcept {
	
  public static void main(String[] args )
  {
	// HashMap  is a class implements Map Interface
    // extends AbstractMap 
	//It contains only unique values
	//It stores value in key value format
	 //It may have one null value and mulitple null values
	 //It maintains no order 
	  
	  HashMap<Integer,String> hm=new HashMap<Integer,String>();
	  hm.put(1, "Selenium");
	  hm.put(2, "QTP");
	  hm.put(3, "TestComplete");
	  hm.put(4, "Karate");	  
	  System.out.println(hm.get(4));
	  
	  for(Entry m:hm.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
  }
}
