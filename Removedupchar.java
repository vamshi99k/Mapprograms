package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Removedupchar {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		removedupchar(s);
		 
		 
		
	}

	private static void removedupchar(String s) {
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		char ch[]=s.toCharArray();
		for(char i:ch)
		{
			if(map.containsKey(i)) {
			
			}
			else {
				map.put(i,1);
				
			}
		}
		for(Map.Entry entry :map.entrySet()) {
			System.out.print(entry.getKey());
		}
		
		
	}
	

}

