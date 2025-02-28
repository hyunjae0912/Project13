package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// list는 arrylist의 부모이므로 타입으로 사용가능
		List<String> list = new ArrayList<>();
		
		list.add("aa");
		list.add("cc");
		list.add("bb");

		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		// 인스턴스로 생성 버전은 아래거
		
		// sort 리스트를 순서대로 정렬하는 함수
//		Collections.sort(list, new Comparator<String>() {
//			
//			// 크기에 따라 정렬 기준이 정해짐, 리스트 안에 문자열을 비교해서 정렬하는 함수
//			@Override
//			public int compare(String o1, String o2) {
//				// string 클래스의 compareto 함수 : 두 문자열을 비교해서 숫자로 반환
//				return o1.compareTo(o2);
//			}});
		
		System.out.println(list);
		
	}
}
