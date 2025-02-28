package lambda;

public class Ex2 {

	public static void main(String[] args) {
		Calc calc = (num1, num2) -> num1 + num2;
		
		System.out.println(calc.add(50,70));
		
		// 위는 람다식
		// 아래는 인스턴스 생성
		
		Calc calc2 = new MyCalc();
		
		System.out.println(calc2.add(50,70));
		
	}

}


// 함수형 인터페이스
// @ 어노테이션
// 구초제 안에 함수가 하나 이상되면 에러가 남
@FunctionalInterface
interface Calc {
	int add(int num1, int num2);
	// 
}

class MyCalc implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
}