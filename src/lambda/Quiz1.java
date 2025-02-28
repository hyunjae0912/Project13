package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 익명 함수
		MyNumber myNumber = new MyNumber() {
			@Override
			public int max(int x, int y) {
				if (x > y) {
					return x;
				} else {
					return y;
				}
			}
		};

		System.out.println(myNumber.max(5, 10));
		
		// 람다식 함수
		MyNumber myNumber2 = (int x, int y) -> x > y ? x : y;

		System.out.println(myNumber2.max(5, 10));

	}

}

@FunctionalInterface
interface MyNumber {
	// 두 숫자 중에서 더 큰 값을 반환하는 함수
	int max(int x, int y);
}