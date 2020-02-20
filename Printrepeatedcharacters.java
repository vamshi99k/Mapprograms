package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Printrepeatedcharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the String");
		String  str= sc.nextLine();
		printdup(str);
		
	

	}
	private static void printdup(String s) {
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
		Set<Map.Entry<Character,Integer>> lmap=map.entrySet();
		for(Map.Entry<Character, Integer> entry :lmap) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	} 

}
