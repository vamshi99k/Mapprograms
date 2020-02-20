package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Countwordocuurances {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		countwords(s);
		
		
	}

	private static void countwords(String s) {
		Map<String,Integer> map=new LinkedHashMap<>();
		String ar[]=s.split(" ");
		for(String i:ar) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
				
			}
			else {
				map.put(i,1);
				
			}
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
		
	}

}
