package Listpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args)
	{
		int a[]=new int[3]; //static array
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(90);
		ar.add(45);
		
		System.out.println(ar.size());	
		
		
		//to print all the values  from arraylist:forloop
		
		// Using for loop
		
		for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Employee e1=new Employee("Snehal",40,"Lead");
		Employee e2=new Employee("Raghav",34,"QA");
		Employee e3=new Employee("Kaushal",24,"Jr QA");
		
		//Create Arraylist
		
		ArrayList<Employee>  ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		//addALL
		
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("test1");
		ar5.add("test2");
		ar5.add("test3");
		ar5.add("test4");
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("test5");
		ar6.add("test6");
		ar6.add("test7");
		ar6.add("test8");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**************");
		
		//retainALL
		
				ArrayList<String> ar7=new ArrayList<String>();
				ar7.add("test1");
				ar7.add("test2");
				ar7.add("test3");
				ar7.add("test4");
				ArrayList<String> ar8=new ArrayList<String>();
				ar8.add("test5");
				ar8.add("test3");
				
				
				ar7.retainAll(ar8);
				
				for(int i=0;i<ar7.size();i++)
				{
					System.out.println(ar7.get(i));
				}
						
		
		
		
	}

}
