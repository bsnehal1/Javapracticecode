package com.my.filereader;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Javapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="Snehal Bhagat";
		char chars[]=str.toCharArray();
		for(int i =chars.length-1;i>=0;i--)
		{
			System.out.print(chars[i]);
		}*/
		
		/*String str;
		Scanner in=new Scanner (System.in);
		System.out.println("Enter your string");
		str=in.nextLine();
		String[] token=str.split("");
		for (int i =token.length-1;i>=0;i--)
		{
			System.out.println(token[i]	+ "");
		}*/
		
        String str = "This this is is done by Saket Saket";
        WebDriverWait wait= new WebDriverWait(driver,20);
        char chars[]=str.toCharArray();        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0;i<chars.length;i++)
        {
        	if (map.containsKey(chars[i]))
        	{
        		int count=map.get(chars[i]);
        		map.put(chars[i],count+1);
        	}
        	else
        	{
        		map.put(chars[i],1);
        	}
        }
        
        System.out.println(map);


	}

}
