package tester;

import java.util.HashMap;
import java.util.Map;

public class testThis {

	public static void main(String[] args) {
		System.out.println(wordCount("one,\ntwo,\nthree"));

	}
	public static Map<String, Integer> wordCount(String string) {
		String[] arr;
		if (string.contains("\n")) {
			arr = string.split(",\\n");

		} else if (string.contains(",")) {
			arr = string.split(",");
		} else {
			arr = string.split(" ");
		}
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer count = map.get(arr[i]);
			if (count == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], ++count);
			}
		}
		return map;
	}


}
