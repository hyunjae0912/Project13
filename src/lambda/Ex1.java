package lambda;

// 객체 없이 함수 사용하기 (라므다)
public class Ex1 {

	public static void main(String[] args) {

		Stringconcat concat2 = (s1, s2) -> System.out.println(s1 + ", " + s2);
		
		concat2.makeString("Hello", "World");
		
		// 함수형 인터페이스와 람다식 함수를 이용하면, 객체없이 함수를 사용할 수 없다.

	}

}

// 함수형 인터페이스 + 라므다 식 

// 1. 하므수형 이느터페이스
interface Stringconcat {
	void makeString(String s1, String s2);
}
