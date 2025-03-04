package stream;

import java.util.ArrayList;
import java.util.List;

public class Quiz3 {

	public static void main(String[] args) {
		List<ShopList> list = new ArrayList<>();
		list.add(new ShopList(1001, 2022, 300));
		list.add(new ShopList(1002, 2022, 150));
		list.add(new ShopList(1003, 2022, 200));
		list.add(new ShopList(1004, 2023, 500));
		list.add(new ShopList(1005, 2023, 400));
		list.add(new ShopList(1006, 2023, 600));
		list.add(new ShopList(1007, 2023, 650));
		
		list.stream().map(a -> String.valueOf(a.orderNo)).distinct().
		forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		// 2022년도의 가격을 합한 걸 출력
		int sum = list.stream().filter(a -> a.year == 2022).mapToInt(a -> a.price).sum();
		long count = list.stream().filter(a -> a.year == 2022).count();
		//Type mismatch: cannot convert from long to int
		
		System.out.println("총 금액 : " + sum + "만원, 거래건수 : " + count);
		

		int sum2 = list.stream().filter(a -> a.year == 2023).mapToInt(a -> a.price).sum();
		long count2 = list.stream().filter(a -> a.year == 2023).count();
		System.out.println("총 금액 : " + sum2 + "만원, 거래건수 : " + count2);
		
	}

}


class ShopList {
	int orderNo;
	int year;
	int price;
	
	public ShopList(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}
	
	
	
}