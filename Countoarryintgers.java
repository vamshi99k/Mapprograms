package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Countoarryintgers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the size");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("enter the " + n + "elements");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		count(ar);

	}

	private static void count(int[] ar) {
		Map<Integer, Integer> m = new LinkedHashMap<>();
		for (int i : ar) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}
		for (Map.Entry<Integer,Integer> entry : m.entrySet()) {
			if(entry.getValue()==2) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		}

	}

}
