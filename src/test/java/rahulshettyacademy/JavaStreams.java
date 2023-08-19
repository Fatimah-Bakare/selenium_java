package rahulshettyacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.testng.annotations.Test;

public class JavaStreams {

	// Count the number of names starting with alphabet "A"

	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		// There is no life for intermediate operation if there is no terminal operation
		// (e.g., -- .count())
		// Terminal operation will execute only in intermediate operation (filter)
		// returns true
		// We can create stream
		// How to use filter in stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();

		System.out.println(d);

		// Print all the names of ArrayList
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// names.stream().filter(s -> s.length() > 4).limit(1).forEach(s ->
		// System.out.println(s));
	}

	@Test
	public void streamMap() {

		// Print names which have last letters as "a" with Uppercase
		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// Print names which have first letters as "a" with Uppercase and sorted
		List<String> names = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Rama");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}

	@Test
	public void streamConcat() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jane");
		names.add("Micheal");
		names.add("Eve");
		names.add("Raviga");

		List<String> namesII = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Rama");

		// Merging two different list
		Stream<String> newStream = Stream.concat(names.stream(), namesII.stream());
		// newStream.sorted().forEach(s->System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		List<String> list = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list.get(0));
		
		
		//Print unique number from this array
		//sort the array
		List<Integer> values = Arrays.asList(3,2,7,5,9,8,6,3,4,6,9);
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
