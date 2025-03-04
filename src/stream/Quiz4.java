package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		list.stream().forEach(n -> System.out.print(n.name + " "));
		System.out.println();
		
		int sum = list.stream().mapToInt(a -> a.tripPrice).sum();
		System.out.println("총 여행 비용 : " + sum);
		
		list.stream().filter(a -> a.age >= 20).forEach(n -> System.out.println(n));
		
		
		// compare 함수 정리 : 두 수를 비교하여 순서를 결정, 반환값은 양수 또는 음수
		// 
		
		// 스트림 안에 있는 요소는 인스턴스로 값을 정렬할 수 없다.
		list.stream()
		.filter(c -> c.age >= 20)
		// 순정렬(작은거 > 큰거) 도우너:25 둘리:40
		.sorted((c1, c2) -> {
			if(c1.age > c2.age) {
				return 1; //양수면 c1.age가 뒤로 이동..
			} else {
				return -1; //음수면 c2.age가 뒤로 이동..
			}
		})
		.forEach(c -> System.out.println(c.name + ", " +c.age));
		

	}

}

class Customer {
	String name;
	int age;
	int tripPrice;
	
	public Customer(String name, int age, int tripPrice) {
		super();
		this.name = name;
		this.age = age;
		this.tripPrice = tripPrice;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", tripPrice=" + tripPrice + "]";
	}
	
	
}