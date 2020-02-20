package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Countoccuranceofcharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the String");
		String  str= sc.nextLine();
		
	

		countcharacteroccurances(str);

	}

	private static void countcharacteroccurances(String s) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		char ar[]=s.toCharArray();
		for(char i:ar)
		{
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i,1);
				
			}
		}
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
	}
   

}
