package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Removedupwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string  fuck");
		String s=sc.nextLine();
		removedupwords(s);
		
	}

	private static void removedupwords(String s) {
		Map<String,Integer> map=new LinkedHashMap<>();
		String ar[]=s.split(" ");
		for(String i:ar) {
			if(map.containsKey(i)) {
				
			}else {
				map.put(i,1);
			}
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.print(entry.getKey()+" ");
		}
		
		
		
	}

}
