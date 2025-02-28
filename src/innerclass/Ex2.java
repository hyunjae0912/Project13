package innerclass;

// 내부 클래스의 종류
class Outer {
	
	// private 접근제어자 : 클래스 안에서만 사용할 수 있음
	private int a = 10;
	private static int b = 20;
	
	class InClass {
		int i1 = a;		// 내부 클래스는 외부 클래스의 private 변수를 사용가능
		int i2 = b;
	}
	
	static class InStaticClass {
//		int i1 = a;		// 에러남		static 클래스 안에서 인스턴스 변수는 사용을 할 수 없다.
		int i2 = b;
	}
}