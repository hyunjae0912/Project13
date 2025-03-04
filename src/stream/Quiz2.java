package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		String[] arr = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		
		Stream<String> list = Arrays.stream(arr);
		list.filter(n -> n.endsWith(".txt")).forEach(n -> System.out.printf(n + " "));
		Stream<String> list2 = Arrays.stream(arr);
		Stream<String> list3 = Arrays.stream(arr);
		Stream<String> list4 = Arrays.stream(arr);
		
		System.out.println();
		System.out.println(list2.filter(n -> n.endsWith(".txt")).count());
		System.out.println(list3.filter(n -> n.endsWith(".pdf")).count());
		System.out.println(list4.filter(n -> n.endsWith(".img")).count());
		 
		Stream<String> list5 = Arrays.stream(arr);
		
		
		System.out.println();

		list5.map(s -> {
			String[] strArr = s.split("\\.");
			return strArr[1];
		}).distinct().sorted().forEach(n -> System.out.printf(n + " "));;
		
		
	}

}
