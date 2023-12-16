package IFElseExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapWorking {

	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		map.put("a", 11);
		map.put("b", 12);
		map.put("c", 13);
		map.put("a", 14);
		map.put("", 15);
//		System.out.println(map);
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(1);
		list.add(14);
		list.add(12);
		list.add(33);
		list.add(2);
		
		Collections.sort(list);
		System.out.println(list);
		List<Integer> l = Arrays.asList(1,23,43,45,12,45,123);
		System.out.println(l);
		List<Integer> collect = l.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect2 = collect.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		collect2.forEach(System.out :: println);
		
	}
}
