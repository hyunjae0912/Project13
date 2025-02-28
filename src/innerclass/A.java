package innerclass;

public class A {
	int num = 10;
	
}

class B {
	void method() {
		// a 클래스의 속성 사용하기
		A a = new A();
		System.out.println(a.num);
	}
}

class C {
	int num = 10;
	
	// 내부 클래스
	
	class D {
		void method() {
			// 저기 저 변수 타입은 default타입이라 클래스 내부에서는 사용할 수 있음
			System.out.println(num);
		}
	}
}























